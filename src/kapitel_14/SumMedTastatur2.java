package kapitel_14;
public class SumMedTastatur2
{
	public static void main(String[] arg)
	{
		Tastatur t = new Tastatur();
		boolean stop = false;

		while (!stop)
		{
			System.out.print("Hvor mange tal vil du lægge sammen? ");
			try 
			{
				double antalTal = t.læsTal();
				double sum = 0;

				for (int i=0; i<antalTal; i=i+1)
				{
					System.out.print("Indtast tal: ");
					sum = sum + t.læsTal();
				}
				System.out.println("Summen er: "+sum);
			} catch (Exception e) {
				System.out.println("Indtastningsfejl - " + e);
			}
			System.out.print("Vil du prøve igen (j/n)? ");
			if ("n".equals(t.læsLinje())) stop = true;
		}
	}
}