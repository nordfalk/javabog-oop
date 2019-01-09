package kapitel_21;
import java.io.*;
public class FilnavnfiltreringMedAnonymMetode
{
	public static void main(String[] arg)
	{
		File mappe = new File("src/kapitel_21");
		String[] filer = mappe.list( (mappen, filnavn) -> filnavn.startsWith("Benyt") );
		for (int i=0; i<filer.length; i=i+1) System.out.println( filer[i] );
	}
}