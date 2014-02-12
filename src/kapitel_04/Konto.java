package kapitel_04;
public class Konto
{
	public int saldo;
	public Person ejer;
	public Konto(Person ejeren)
	{
		ejer = ejeren;               // Sæt kontoen til at referere til personen
		ejer.konti.add(this);        // ... og personen til at referere til kontoen
		saldo = 0;
	}

	public void overførsel(int kroner)
	{
		saldo = saldo + kroner;
	}

	public String toString()
	{
		return ejer+" har "+saldo+" kr.";
	}
}