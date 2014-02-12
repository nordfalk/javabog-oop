package kapitel_07;
public class RekursionUdfoldet
{
	public static void main(String[] arg)
	{
		tælNed(3);
	}

	public static void tælNed(int tæller)
	{
		System.out.print(tæller+" ");
		if (tæller>0) tælNedA(tæller-1);    // kald tælNedA(2)
	}

	public static void tælNedA(int tæller)
	{
		System.out.print(tæller+" ");
		if (tæller>0) tælNedB(tæller-1);    // kald tælNedB(1)
	}
 
	public static void tælNedB(int tæller)
	{
		System.out.print(tæller+" ");
		if (tæller>0) tælNedC(tæller-1);    // kald tælNedC(0)
	}

	public static void tælNedC(int tæller)
	{
		System.out.print(tæller+" ");
		if (tæller>0) tælNedC(tæller-1);    // kalder ikke videre, da tæller=0
	}
}