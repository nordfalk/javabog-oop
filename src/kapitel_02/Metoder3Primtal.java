package kapitel_02;
public class Metoder3Primtal
{
	public static boolean erPrimtal(int talDerSkalUndersøges)
	{
		int faktor = 2;

		while (talDerSkalUndersøges % faktor > 0) faktor++;

		if (faktor < talDerSkalUndersøges)
		{
			System.out.println(talDerSkalUndersøges + " har faktoren "+faktor);
			return false;
		} else {
			System.out.println(talDerSkalUndersøges + " er et primtal.");
			return true;
		}
	}

	public static void main(String[] arg) 
	{
		int antalPrimtal = 0;

		int tal;
		for (tal = 10; tal<20; tal++)
		{
			boolean erPrim = erPrimtal(tal);
			if ( erPrim ) antalPrimtal = antalPrimtal + 1;
		}

		System.out.println("Antal primtal i alt: " + antalPrimtal);
	}
}