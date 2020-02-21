package kapitel_16;/*
2. Lav din egen proxy. En proxy er en "stråmand", der modtager en HTTP-forespørgsel og spørger
	 videre for klienten.
*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Opg_16_4__5__Proxy {
	public static void main(String arg[]) {
		try {
			ServerSocket værtssokkel = new ServerSocket(8001);
			while (true) {
				Socket forb = værtssokkel.accept();
				PrintWriter udk = new PrintWriter(forb.getOutputStream());

				BufferedReader indk =
								new BufferedReader(new InputStreamReader(forb.getInputStream()));

				String anmodning = indk.readLine();
				System.out.println("Anmodning: " + anmodning);
				// Opsnap de efterfølgende linier (headeren) og se om der ikke kommer en Host: med
				String vært = null;
				ArrayList<String> header = new ArrayList<String>();
				String lin;
				while ((lin = indk.readLine()).length() > 0) {
					header.add(lin);
					if (lin.toLowerCase().startsWith("host")) vært = lin.substring(lin.indexOf(":") + 1).trim();
				}
				System.out.println("Header: " + header);

				// Hent nu hjemmesiden
				try {
					if (vært == null) throw new IllegalArgumentException("mangler Host: ");

					Socket forbindelse = new Socket(vært, 80);
					OutputStream fraOs = forbindelse.getOutputStream();
					InputStream tilOs = forbindelse.getInputStream();
					PrintWriter ud = new PrintWriter(fraOs);
					BufferedReader ind = new BufferedReader(new InputStreamReader(tilOs));

					ud.println(anmodning);
					for (int i = 0; i < header.size(); i++) ud.println((String) header.get(i));
					ud.flush();              // send anmodning afsted til værten

					String s = ind.readLine();
					while (s != null)        // readLine() giver null når datastrømmen lukkes
					{
						System.out.println("svar: " + s);
						udk.println(s); // send det til klienten
						s = ind.readLine();
					}
					forbindelse.close();
				} catch (Exception e) {
					e.printStackTrace();

					udk.println("HTTP/0.9 400 Not found");
					udk.println();
					udk.println("<html><head><title>Fejl</title></head>");
					udk.println("<body><h1>Der opstod en fejl: " + e + "</h1>");
					udk.println("Du spurgte om " + anmodning + "<br>");
					udk.println("med header: " + header + "<br>");
					udk.println("Stakspor: <pre>\n");
					e.printStackTrace(udk);
					udk.println("</pre></body></html>");
				}

				udk.flush();
				forb.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}