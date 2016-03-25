package kapitel_03;
// Datoer.java
// Viser brugen af Date-klassen og dens metoder.
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date; // Date-klassen er i pakken java.util

public class Datoer
{
	public static void main (String[] arg)
	{
		Date netopNu;
		Date jacob;

		netopNu = new Date();                    // dags dato og tidspunkt lige nu
		jacob = new Date(71,0,1,12,00);          // 1. januar 1971 kl. 12:00

		System.out.println("Dags dato: "+netopNu.toString());
		System.out.println("Jacob blev født "+jacob); // .toString() implicit

		// Lad os regne Jacobs alder ud (i millisekunder)
		long nuMs;
		long jacobMs;
		long alderMs;

		nuMs = netopNu.getTime();
		jacobMs = jacob.getTime();
		alderMs = nuMs - jacobMs;
 
		// Hvornår var han halvt så gammel?
		jacob.setTime(nuMs - alderMs/2);
		System.out.println("Jacob var halvt så gammel "+jacob);

		SimpleDateFormat df = new SimpleDateFormat("d/m yyyy");
		System.out.println("Jacob var halvt så gammel d. "+df.format(jacob));

		System.out.println("Jacob var halvt så gammel "+DateFormat.getInstance().format(jacob));

	}
}