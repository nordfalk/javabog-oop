package kapitel_02;
public class Primtal
{
	public static void main(String[] arg) 
	{
		int talDerSkalUndersøges = 15;
		int faktor = 2;

		while (talDerSkalUndersøges % faktor > 0) faktor = faktor+1;

		if (faktor < talDerSkalUndersøges)
		{
			System.out.println(talDerSkalUndersøges + " er IKKE et primtal,");
			System.out.println("for det har faktoren "+faktor);
		}
		else
			System.out.println(talDerSkalUndersøges + "er et primtal.");
	}
}