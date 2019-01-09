package kapitel_21;
import java.io.*;
public class FilnavnfiltreringMedAnonymKlasse
{
	public static void main(String[] arg)
	{
		File mappe = new File( "src/kapitel_21" );			// den aktuelle mappe
		FilenameFilter filter;

		filter = new FilenameFilter()
				{ // En anonym klasse
					public boolean accept( File mappe, String s) // En metode
					{
						return s.startsWith("Benyt");  // svar true hvis fil ender på .java
					}
				} // slut på klassen
			; // slut på tildelingen filter = new ...

		// brug objektet som filter i en liste af et antal filer
		String[] filer = mappe.list( filter );

		for (String fil : filer) System.out.println( fil );
	}
}