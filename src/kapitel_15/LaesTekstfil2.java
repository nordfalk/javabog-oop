package kapitel_15;
import java.io.*;

public class LaesTekstfil2
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader ind = new BufferedReader(new FileReader("skrevet fil.txt"));
		String linje = ind.readLine();
		int alderssum = 0;
		while (linje != null)
		{
			String[] bidder = linje.split(" ");     // opdel i bidder efter mellemrum
			alderssum = alderssum + Integer.parseInt( bidder[2] ); // brug tredje bid
			linje = ind.readLine();
		}
		System.out.println("Summen af aldrene er: "+alderssum);
	}
}