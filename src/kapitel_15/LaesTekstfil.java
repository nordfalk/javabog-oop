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
/*
		FileReader fil = new FileReader("skrevet fil.txt");
		BufferedReader ind = new BufferedReader(fil);

		String linje = ind.readLine();
		while (linje != null)
		{
			System.out.println("Læst: "+linje);
			linje = ind.readLine();
		}
    
    */    
//Se mere på http://www.javapractices.com/topic/TopicAction.do?Id=42
	
		String linjerstr = new String(Files.readAllBytes(Paths.get("skrevet fil.txt")));
		System.out.println("linjerstr="+ linjerstr);
		System.out.println("linjerstr.split(\"\\n\")[2]="+linjerstr.split("\n")[2]);

		//FileReader fil = new FileReader("skrevet fil.txt");
		//BufferedReader ind = new BufferedReader(fil);
		List<String> linjer = Files.readAllLines(Paths.get("skrevet fil.txt"), Charset.defaultCharset());

		for (String linje : linjer)
		{
			System.out.println("Læst: "+linje);
		}
	}
}