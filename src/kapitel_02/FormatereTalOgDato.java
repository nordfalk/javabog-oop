package kapitel_02;
import java.util.*;

public class FormatereTalOgDato
{
	public static void main(String[] args)
	{
		for (int n = 1; n < 5; n++) {
			System.out.printf("kvadratrod( %d ) er %5.3f / %2$e\n", n, Math.sqrt(n));
		}
		System.out.printf(Locale.US, "kvadratrod %0+3d er %.9f\n", 8, Math.sqrt(8));
		Date d = new Date(); // repræsenterer dags dato
		System.out.printf("I dag er %1$tA den %1$te. %1$tB år %1$tY kl. %1$tT\n",d);
	}
}