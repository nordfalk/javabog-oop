package kapitel_15;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class LaesTekstfil
{
	public static void main(String[] arg) throws IOException
	{
		FileReader fil = new FileReader("skrevet fil.txt");
		BufferedReader ind = new BufferedReader(fil);

		String linje = ind.readLine();
		while (linje != null)
		{
			System.out.println("Læst: "+linje);
			linje = ind.readLine();
		}
	}
}