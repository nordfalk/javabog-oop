package kapitel_09;
public class KurveanimationMedTraad extends Kurvetegning implements Runnable
{
	public KurveanimationMedTraad()
	{
	}

	public void run()
	{
		for (int t=0; t<100000; t++)
		{
			forskydning = t;        // ændr forskydningen så kurven ser anderledes ud
			repaint();      // systemet vil kalde paintComponent() (fra grafiktråden)
			try { Thread.sleep(40); } catch (Exception e) {}
		}
	}

	public static void main(String[] arg)
	{
		KurveanimationMedTraad ka = new KurveanimationMedTraad();
		Thread tråd = new Thread(ka);  // opret tråd, der kører run() på ka
		tråd.start();                  // start den nye tråd
		System.out.println("Animationen kører nu...");
	}
}