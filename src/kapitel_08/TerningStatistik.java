package kapitel_08;
public class TerningStatistik
{
	public static void main(String[] arg)
	{
		int[] statistik = new int[13];    // array med element nr. 0 til og med 12

		for (int i=0; i<100; i=i+1) 
		{
			int sum = (int) (6*Math.random()+1) + (int) (6*Math.random()+1);

			statistik[sum]=statistik[sum]+1; // optæl statistikken for summen af øjne
		}

		for (int n=2; n<=12; n=n+1) System.out.println( n + ": " + statistik[n]);
	}
}