package kapitel_02;
public class Syvtabel3
{
	public static void main(String[] arg) 
	{
		for (int n=1; n<=10; n++)	// n++ gør det samme som n=n+1
		{
			if (n == 6) System.out.println("puha, nu bliver det svært.");

			if (n < 8) System.out.println(n+" : "+ 7*n);
			else System.out.println(n+" : (ved ikke)");
		}
	}
}