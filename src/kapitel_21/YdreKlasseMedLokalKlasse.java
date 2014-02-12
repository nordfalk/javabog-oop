package kapitel_21;
public class YdreKlasseMedLokalKlasse
{
	private int a1 = 1;					// Felter behøves ikke være final

	public void prøvLokaltObjekt(final int a2) // Bemærk: final
	{
		final int a3 = 3;                        // Bemærk: final

		class LokalKlasse {                      // definér lokal klasse
			int a4 = 4;
			public void udskriv()
			{
				System.out.println( a4 );
				System.out.println( a3 );
				System.out.println( a2 );
				System.out.println( a1 );
			}
		} // slut på lokal klasse

		LokalKlasse lokal = new LokalKlasse(); // opret lokalt objekt fra klassen
		lokal.udskriv();
	}

	public static void main(String[] arg){
		YdreKlasseMedLokalKlasse ydre = new YdreKlasseMedLokalKlasse();
		ydre.prøvLokaltObjekt(2);
	}
}