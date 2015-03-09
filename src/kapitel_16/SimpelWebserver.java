package kapitel_16;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
public class SimpelWebserver
{
	public static void main(String[] arg)
	{
		try {
			ServerSocket serversocket = new ServerSocket(8001);
			while (true)
			{
				System.out.println("Lytter på port "+serversocket.getLocalPort());
				Socket forbindelse = serversocket.accept();
				PrintWriter ud = new PrintWriter(forbindelse.getOutputStream());

				BufferedReader ind = new BufferedReader(
					new InputStreamReader(forbindelse.getInputStream()));

				String anmodning = ind.readLine();
				System.out.println("Anmodning: "+anmodning);

				ud.println("HTTP/1.1 200 OK");
				ud.println();
				ud.println("<html><head><title>Svar</title></head>");
				ud.println("<body><h1>Svar fra server</h1>");
				ud.println("Du har spurgt om "+anmodning);
				ud.println("</body></html>");
				ud.flush();
				forbindelse.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}