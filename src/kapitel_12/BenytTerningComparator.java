package kapitel_12;
import kapitel_04.*;
import java.util.*;
public class BenytTerningComparator
{
	public static void main(String[] arg)
	{
		ArrayList<Terning> liste = new ArrayList<Terning>();
		liste.add(new Terning());
		liste.add(new Terning());
		liste.add(new Terning());
		liste.add(new Terning());
		liste.add(new Terning());

		System.out.println("før sortering: " + liste);

		Collections.sort(liste, new TerningComparator());
		System.out.println("efter sortering: " + liste);

		Comparator<Terning> sammenligner = new Comparator<Terning>() {
			public int compare(Terning t1, Terning t2) // kræves af Comparator
			{
				System.out.println("compare( " + t1 + " og " + t2);
				if (t1.getVærdi() > t2.getVærdi()) return 1; // t1 skal efter t2
				if (t1.getVærdi() == t2.getVærdi()) return 0; // samme plads i listen
				else return -1;                               // t1 skal før t2
			}
		};

		Collections.sort(liste, (t1, t2) -> {
			System.out.println("compare( " + t1 + " og " + t2);
			if (t1.getVærdi() > t2.getVærdi()) return 1; // t1 skal efter t2
			if (t1.getVærdi() == t2.getVærdi()) return 0; // samme plads i listen
			else return -1;                               // t1 skal før t2
		});


		Collections.sort(liste, (o1, o2) -> o2.getVærdi() - o1.getVærdi());

		// Man kan også implementere sammenligningen direkte, som f.eks.:
		// Collections.sort(liste, (t1, t2) -> t1.getVærdi() - t2.getVærdi() );

		System.out.println("efter sortering: " + liste);
	}
}