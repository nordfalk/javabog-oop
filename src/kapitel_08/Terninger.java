package kapitel_08;
import kapitel_04.*;
import kapitel_05.*;
// Bruger Terning.java og FalskTerning2.java fra kapitel 4 og 5
public class Terninger
{
	public static void main(String[] arg) 
	{
		Terning[] t = { new Terning(), new FalskTerning2(), new FalskTerning2() };

		for (int i=0; i<t.length; i++) t[i].kast();    // normal for-løkke

		for (Terning ti : t) System.out.println( ti ); // foreach-løkke
	}
}