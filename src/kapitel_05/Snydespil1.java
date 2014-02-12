package kapitel_05;
import kapitel_04.*;
public class Snydespil1
{
	public static void main(String[] arg)
	{
		Terning t1 = new Terning();
		FalskTerning1 t2 = new FalskTerning1();

		System.out.println("t1: "+t1); // kunne også kalde t1.toString()
		System.out.println("t2: "+t2);

		for (int i=0; i<5; i++)
		{
			t1.kast();
			t2.kast();
			System.out.println("t1=" + t1 + "  t2=" + t2);
			if (t1.getVærdi() == t2.getVærdi()) System.out.println("To ens!");
		}
	}
}