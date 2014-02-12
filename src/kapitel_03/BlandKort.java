package kapitel_03;
import java.util.ArrayList;

public class BlandKort
{
	public static void main(String[] arg)
	{
		ArrayList<String> bunke = new ArrayList<String>();

		// Opbyg bunken
		for (int n=2; n<9; n++)
		{
			bunke.add("ruder"+n);  // ruder
			bunke.add("klør"+n);   // klør
			bunke.add("spar"+n);   // spar
		}

		System.out.println("Før blanding: "+bunke);   // bunke.toString() kaldes
		int antalKort = bunke.size();

		// Bland bunken
		for (int n=0; n<100; n++)
		{
			int nr = (int) (Math.random() * antalKort); // find en tilfældig plads

			String kort = bunke.get(nr);                // tag et kort ud
			bunke.remove(nr);

			nr = (int) (Math.random() * antalKort);
			bunke.add(nr, kort);                        // sæt det ind et andet sted
		}
		
		System.out.println("Efter blanding: "+bunke);
	}
}