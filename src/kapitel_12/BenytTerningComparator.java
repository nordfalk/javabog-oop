package kapitel_12;
import kapitel_04.*;
import java.util.*;
public class BenytTerningComparator
{
	public static void main(String[] arg)
	{
		ArrayList<Terning> liste = new ArrayList<Terning>();
		liste.add( new Terning());
		liste.add( new Terning());
		liste.add( new Terning());
		liste.add( new Terning());
		liste.add( new Terning());

		System.out.println("før sortering: "+liste);
		TerningComparator sammenligner = new TerningComparator();
		Collections.sort(liste, sammenligner );

		// Man kan også implementere sammenligningen direkte, som f.eks.:
		// Collections.sort(liste, (t1, t2) -> t1.getVærdi() - t2.getVærdi() );

		System.out.println("efter sortering: "+liste);
	}
}