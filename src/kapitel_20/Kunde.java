package kapitel_20;
public class Kunde
{
	String navn;
	double kredit;

	public Kunde(String n, double k)
	{
		navn = n;
		kredit = k;
	}

	public String toString()
	{
		return navn+": "+kredit+" kr.";
	}
}