package kapitel_12;
import kapitel_04.*;
import java.util.Comparator;
public class TerningComparator implements Comparator<Terning>
{
	public int compare(Terning t1, Terning t2) // kræves af Comparator
	{
		System.out.println("compare( " + t1 + " og " + t2);
		if (t1.getVærdi() > t2.getVærdi()) return 1; // t1 skal efter t2
		if (t1.getVærdi() == t2.getVærdi()) return 0; // samme plads i listen
		else return -1;                               // t1 skal før t2
	}
}