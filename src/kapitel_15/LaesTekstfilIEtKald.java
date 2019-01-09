package kapitel_15;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

public class LaesTekstfilIEtKald
{
	public static void main(String[] arg) throws IOException
	{
		//Se mere på http://www.javapractices.com/topic/TopicAction.do?Id=42

		String heleFilen = new String(Files.readAllBytes(Paths.get("skrevet fil.txt")));
		System.out.println("Hele filen er "+ heleFilen.length() + " tegn lang.");
		System.out.println("På linje 3 i filen står: "+heleFilen.split("\n")[3]);

		List<String> linjer = Files.readAllLines(Paths.get("skrevet fil.txt"));
		for (String linje : linjer)
		{
			System.out.println("Læst: "+linje);
		}
	}
}