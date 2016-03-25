package kapitel_16;
import java.io.*;
import java.net.*;
public class HentHjemmeside
{
	public static void main(String[] arg)
	{
		try {
			Socket forbindelse = new Socket("esperanto.dk",80);
			OutputStream os = forbindelse.getOutputStream();
			InputStream  is = forbindelse.getInputStream();
			PrintWriter    ud  = new PrintWriter(os);
			BufferedReader ind = new BufferedReader(new InputStreamReader(is));
			ud.println("GET / HTTP/1.1");
			ud.println("Host: esperanto.dk");
			ud.println();
			ud.flush();              // send anmodning afsted til værten
			String s = ind.readLine();
			while (s != null) {      // readLine() giver null når datastrømmen lukkes
				System.out.println("modt: "+s);
				s = ind.readLine();
			}
			forbindelse.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}