package kapitel_15;
import java.io.*;
import java.util.Scanner;
public class LaesTekstfilOgLavStatistik
{
	public static void main(String[] arg)
	{
		int antalPersoner = 0;
		int sumAlder = 0;

		try 
		{
			Scanner sc = new Scanner(new FileReader("skrevet fil.txt"));

			while (sc.hasNext())
			{
				try 
				{
					String navn = sc.next(); // læs tekst til første mellemrum
					String køn = sc.next();  // læs tekst til næste mellemrum
					int alder = sc.nextInt();// læs ét tal 

					System.out.println(navn+" er "+alder+" år.");
					antalPersoner = antalPersoner + 1;
					sumAlder = sumAlder + alder;
				} 
				catch (Exception u) 
				{
					System.out.println("Fejl. Linjen springes over.");
					u.printStackTrace();
				}
				sc.hasNextLine();          // hop til næste linje
			}

			System.out.println("Aldersgennemsnittet er: "+sumAlder/antalPersoner);
		} 
		catch (FileNotFoundException u)
		{
			System.out.println("Filen kunne ikke findes.");
		} 
		catch (Exception u) 
		{
			System.out.println("Fejl ved læsning af fil.");
			u.printStackTrace();
		}
	}
}