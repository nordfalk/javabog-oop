package kapitel_04;
import java.util.ArrayList;

public class Raflebaeger
{
	/** listen af terninger, der er i raflebægeret */
	public ArrayList<Terning> terninger;

	public Raflebaeger(int antalTerninger)
	{
		terninger = new ArrayList<Terning>();
		for (int i=0; i<antalTerninger; i++)
		{
			Terning t;
			t = new Terning();
			terninger.add(t);
		}
	}

	/** lægger en terning i bægeret */
	public void tilføjTerning(Terning t)
	{
		terninger.add(t);
	}

	/** ryster bægeret, så alle terningerne bliver 'kastet' og får en ny værdi */
	public void ryst()
	{
		for (Terning t : terninger) 
		{
			t.kast();
		}
	}

	/** finder summen af alle terningernes værdier */
	public int sum()
	{
		int resultat;
		resultat = 0;
		for (Terning t : terninger) 
		{
			int terningensVærdi = t.getVærdi();
			resultat = resultat +  terningensVærdi;
		}
		return resultat;
	}

	/**
	 * Tæller antallet af terninger, der viser en bestemt værdi.
	 * Eksempel: For [1, 3, 4, 4, 6] vil antalDerViser(1) give 1,antalDerViser(2) give 0,
	 * og antalDerViser(4) give 2.
	 *
	 * @param værdi Ønsket værdi, f.eks. 6
	 * @return antallet af den ønskede værdi (f.eks. hvor mange 6'ere der er)
	 */
	public int antalDerViser(int værdi) {
		int resultat = 0;
		for (Terning t : terninger) {
			int terningensVærdi = t.getVærdi();
			if (terningensVærdi==værdi)
			{
				resultat = resultat + 1;
			}
		}
		return resultat;
	}

	/** beskriver bægerets indhold som en streng */
	public String toString()
	{// (listens toString() kalder toString() på hver terning)
		return terninger.toString();
	}
}