package kapitel_21;
public class AnonymeTraade
{
	public static void main(String[] arg)
	{

		for (int i=1; i<=5; i=i+1)
		{
			// n bruges i den anonyme klasse
			final int n = i;

			Runnable r = new Runnable()
			{
				public void run()
				{
					for (int j=0; j<20; j=j+1) 
					{
						System.out.print(n);

						// Lav noget, der tager tid
						int x = 0;
						for (int k=0; k<1000000; k=k+1) x=x+k;
					}
					System.out.println("Færdig med "+n+".");
				}
			};

			Thread t = new Thread(r);
			t.start(); 
		}
	}
}