package kapitel_05;
import kapitel_04.*;
public class FalskTerning2 extends Terning
{
	public int snydeværdi;

	public void sætSnydeværdi(int nySnydeværdi)
	{
		snydeværdi = nySnydeværdi;
	}

  @Override
	public void kast()
	{
		//System.out.println("[kast() på FalskTerning2] ");

		int værdi = (int) (6*Math.random() + 1);

		// 1 eller 2? Så lav det om til snydeværdi!
		if ( værdi <= 2 ) værdi = snydeværdi;

		setVærdi(værdi); // sæt værdien på terningen
	}
}