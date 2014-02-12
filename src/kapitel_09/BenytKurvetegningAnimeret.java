package kapitel_09;
public class BenytKurvetegningAnimeret
{
	public static void main(String[] arg)
	{
		Kurvetegning kt = new Kurvetegning();

		for (int t=0; t<100000; t++) 
		{
			kt.forskydning = t; // ændr forskydningen så kurven ser anderledes ud
			kt.repaint();       // forårsager at paintComponent() kaldes af systemet
			try { Thread.sleep(40); } catch (Exception e) {} // Vent 0.040 sekund
		}
		System.out.println("Animation er færdig med at køre");
	}
}