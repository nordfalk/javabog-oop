package kapitel_02;
public class Kvadratrod2
{
	public static void main(String[] arg) 
	{
		int n;
		n = 0;

		while (n <= 10)
		{
			System.out.println("kvadratroden af "+n+" er " + Math.sqrt(n));
			n = n + 1;
		}
	}
}