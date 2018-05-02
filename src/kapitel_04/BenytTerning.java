package kapitel_04;
public class BenytTerning
{
	public static void main(String[] arg)
	{
		Terning terningen;
		terningen = new Terning();	// opret terning

		// Slå nu med terningen indtil vi får en sekser
		boolean sekser = false;
		int antalKast = 0;

		while (sekser == false)
		{
			terningen.kast();
			antalKast = antalKast + 1;
			System.out.println("Kast " + antalKast + " gav: " + terningen.getVærdi());
			if (terningen.getVærdi() == 6) sekser = true;
		}

		System.out.println("Vi slog en 6'er efter " + antalKast + " slag.");
	}
}
