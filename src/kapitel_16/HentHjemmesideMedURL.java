package kapitel_16;
import java.io.*;
import java.net.*;
public class HentHjemmesideMedURL
{
	public static void main(String[] arg) throws IOException
	{
		URL url = new URL("http://esperanto.dk");
		InputStream is = url.openStream();
		BufferedReader ind = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		String s = ind.readLine();
		while (s != null)
		{
			System.out.println("modt: "+s);
			s = ind.readLine();
		}
	}
}