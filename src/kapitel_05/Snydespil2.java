package kapitel_05;
public class Snydespil2
{
	public static void main(String[] arg)
	{
		FalskTerning2 t1 = new FalskTerning2();
		t1.sætSnydeværdi(4);

		for (int i=0; i<3; i++)
		{
			t1.kast();
			System.out.println("t1=" + t1);
		}
	}
}