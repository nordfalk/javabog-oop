package kapitel_05;
import kapitel_04.*;
public class Snydespil2medPolymorfi
{
	public static void main(String[] arg)
	{
		FalskTerning2 ft = new FalskTerning2();
		ft.sætSnydeværdi(4);

		Terning t;
		t = ft;
		                                   // punkt A
		for (int i=0; i<3; i++)
		{
			t.kast();
			System.out.println("t=" + t);
		}
	}
}