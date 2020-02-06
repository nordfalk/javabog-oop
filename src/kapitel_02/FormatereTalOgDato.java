package kapitel_02;
import java.util.*;

public class FormatereTalOgDato
{
	public static void main(String[] args)
	{
		for (int n = 1; n < 5; n++) {
			String txt = String.format("kvadratrod( %d ) er %f, (og %2$e med 1 decimal er %2$3.1f)", n, Math.sqrt(n));
			System.out.println(txt);
		}
		System.out.println(String.format(Locale.US, "kvadratrod %4d er %f på amerikansk", 8, Math.sqrt(8)));
		Date d = new Date(); // repræsenterer dags dato
		System.out.println(String.format("I dag er %tA den %1$te. %1$tB år %1$tY kl. %1$tT\n",d));
	}
}