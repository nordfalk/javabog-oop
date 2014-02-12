package kapitel_04;
public class BenytNSidetTerning
{
	public static void main(String[] arg)
	{
		NSidetTerning t = new NSidetTerning(); // sekssidet terning

		System.out.println("t viser nu "+t.getVærdi()+" øjne");

		NSidetTerning t6 = new NSidetTerning(6); // sekssidet terning
		NSidetTerning t4 = new NSidetTerning(4); // firesidet terning
		NSidetTerning t12 = new NSidetTerning(12); // tolvsidet terning

		System.out.println("t4 er "+t4); // t4.toString() kaldes implicit
		t4.kast();
		System.out.println("t4 er nu "+t4);
		t4.kast();

		System.out.println("terninger: "+t+" "+t6+" "+t4+" "+t12);
		t.kast();
		t12.kast();
		System.out.println("terninger: "+t+" "+t6+" "+t4+" "+t12);

		for (int i=0; i<5; i++) 
		{
			t.kast();
			t6.kast();
			t4.kast();
			t12.kast();
			System.out.println("kast "+i+": "+t+" "+t6+" "+t4+" "+t12);
			if (t.getVærdi() == t6.getVærdi())
			{
				System.out.println("t og t6 er ens!");
			}
		}
	}
}