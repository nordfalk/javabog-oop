package kapitel_16;
import java.io.*;
import java.net.*;
public class HentHjemmesideMedURL
{
	public static void main(String[] arg) throws IOException
	{
		URL url = new URL("https://esperanto.dk");
		InputStream is = url.openStream();
		BufferedReader ind = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		String linje = ind.readLine();
		while (linje != null)
		{
			System.out.println("modt: "+linje);
			linje = ind.readLine();
		}

/*  Java 11 version:
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(URI.create("https://esperanto.dk")).build();

		var res = client.send(request, BodyHandlers.ofString());

		System.out.println(""+res.body());

*/
	}
}