package kapitel_04;
/** En klasse der beskriver 4-, 8- 12- og 20-sidede terninger */
public class NSidetTerning
{
	/** hvor mange sider har terningen (normalt 6) */
	private int sider;

	/** den side på terningen, der vender opad lige nu */
	private int værdi;

	/** konstruktør der opretter en standardterning med 6 sider */
	public NSidetTerning()
	{
		sider = 6;
		kast(); // sæt værdi til noget
	}

	/** konstruktør der opretter en terning med et vist antal sider */
	public NSidetTerning(int antalSider)
	{
		if (antalSider >= 3) sider = antalSider;
		else sider = 6;
		kast();
	}

	/** kaster terningen, så den får en anden værdi */
	public void kast()
	{
		// find en tilfældig side
		double tilfældigtTal = Math.random();
		værdi = (int) (tilfældigtTal * sider + 1);
	}

	/** giver antallet af øjne på den side på terningen, der vender opad */
	public int getVærdi()
	{
		return værdi;
	}

	/** ændrer terningen til at vende en bestemt side opad */
	public void setVærdi(int nyVærdi)
	{
		if (nyVærdi > 0 && nyVærdi <= sider) værdi = nyVærdi;
		else System.out.println("Ugyldig værdi");
	}

	/** giver en beskrivelse af terningen som en streng.
	    Hvis den ikke har 6 sider udskrives også antal af sider */
	public String toString()
	{
		String svar = ""+værdi;  // værdi som streng, f.eks. "4"
		if (sider!= 6) svar = svar+"("+sider+"s)";
		return svar;
	}
}