package kapitel_03;
// Demonstrerer hastighedsforskellen mellem String og StringBuilder 
// ved sammensætning af mange strenge
public class HastighedsforskelMedStringBuilder
{
	public static void main (String[] arg)
	{
		long tid1 = System.currentTimeMillis();
		String s = "";
		for (int i=0; i<100000; i++) s = s + "x";    // her oprettes 100000 objekter

		long tid2 = System.currentTimeMillis();
		System.out.println("Antal sekunder med String: "+ (tid2-tid1)*0.001 );

		StringBuilder sb = new StringBuilder(100000);// lav plads til 100000 tegn
		for (int i=0; i<100000; i++) sb.append("x"); // ændr i det samme objekt
		s = sb.toString();

		long tid3 = System.currentTimeMillis();
		System.out.println("Antal sek med StringBuilder: "+ (tid3-tid2)*0.001 );
	}
}