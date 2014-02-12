package kapitel_15;
import java.io.*;
public class SkrivTekstfil 
{
	public static void main(String[] arg) throws IOException
	{
		FileWriter fil = new FileWriter("skrevet fil.txt");
		PrintWriter ud = new PrintWriter(fil);
		for (int i=0; i<5; i++)
		{
			String navn = "person"+i;
			String køn;
			if (Math.random()>0.5) køn = "m"; else køn = "k";
			int alder = 10+(int) (Math.random()*60);

			ud.println(navn+" "+køn+" "+alder);
		}
		ud.close(); // luk så alle data skrives til disken
		System.out.println("Filen er gemt.");
	}
}