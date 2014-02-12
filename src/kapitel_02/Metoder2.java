package kapitel_02;
public class Metoder2
{
	//              returtype   metodenavn  (parametertype variabelnavn)
	public static   int         gangMedTi   (int           tal)
	{
		int resultat;
		resultat = tal*10;      // lav mellemregning
		return resultat;        // returnér resultatet
	}

	public static double dividér (double tæller, double nævner)
	{
		return tæller / nævner; // returnér resultatet, uden en mellemregning
	}

	public static void main(String[] arg)
	{
		for( int x = 1; x<=5; x++)
		{
			int tidobbelt = gangMedTi(x);
			System.out.print( "Det tidobbelte er " + tidobbelt );
 
			double tredjedel = dividér(tidobbelt, 3);
			System.out.println( " og en tredjedel af dette er " + tredjedel );
		}
	}
}