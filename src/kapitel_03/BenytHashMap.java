package kapitel_03;
import java.util.*;
public class BenytHashMap
{
	public static void main(String[] arg)
	{
		// En tabel med strenge som nøgler og Date-objekter som værdier
		HashMap<String,Date> hashtabel = new HashMap<String,Date>();
		Date dato = new Date(71,0,1); // 1. januar 1971
		hashtabel.put("Jacob",dato);
		hashtabel.put("Troels",new Date(72,7,11)); // 11. august 1972
		hashtabel.put("Eva",new Date(73,2,5));
		hashtabel.put("Ulla",new Date(69,1,9));
		System.out.println( "tabel indeholder: "+hashtabel );

		// Lav nogle opslag i tabellen under forskellige navne
		dato = hashtabel.get("Troels");
		System.out.println( "Opslag under 'Troels' giver: "+dato);
		System.out.println( ".. og under Jacob: "+hashtabel.get("Jacob"));
		System.out.println( ".. Kurtbørge: "+hashtabel.get("Kurtbørge"));
		System.out.println( ".. Eva: "+hashtabel.get("Eva"));

		// Gennemløb af alle elementer
		for (String nøgle : hashtabel.keySet()) {
			dato = hashtabel.get(nøgle);
			System.out.println(nøgle + "'s fødselsår: "+dato.getYear());
		}
	}
}