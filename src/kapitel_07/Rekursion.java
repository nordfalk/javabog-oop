package kapitel_07;
public class Rekursion
{
	public static void main(String[] arg)
	{
		tælNed(3);
	}

	public static void tælNed(int tæller)
	{
		System.out.print(tæller+" ");
		if (tæller>0) tælNed(tæller-1); // tælNed() kalder sig selv !!
	}
}