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
		System.out.println("efter sortering: "+liste);
	}
}