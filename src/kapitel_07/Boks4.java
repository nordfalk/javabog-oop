package kapitel_07;
public class Boks4 
{
	private double længde;              // objektvariabel
	private double bredde;              // objektvariabel
	private double højde;               // objektvariabel
	private static int antalBokse;      // klassevariabel

	public Boks4(double lgd, double b, double h)
	{
		// lgd, b og h er lokale variabler
		længde = lgd;
		bredde = b;
		højde  = h;
		antalBokse = antalBokse + 1;
	}

	public static int læsAntalBokse()   // klassemetode
	{
		return antalBokse;
	}

	public double volumen()
	{
		// vol er en lokal variabel
		double vol;
		vol = længde*bredde*højde;
		return vol; 
	}
}