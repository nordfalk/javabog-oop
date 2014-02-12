package kapitel_04;
public class BenytBokse
{
	public static void main(String[] arg)
	{
		Boks enBoks, enAndenBoks;
		enBoks = new Boks();
		enAndenBoks = new Boks();

		enBoks.længde = 1.5;
		enBoks.bredde = 1.0;
		enBoks.højde  = 1.0;

		enAndenBoks.længde = 0.5;
		enAndenBoks.bredde = 0.5;
		enAndenBoks.højde  = 0.5;

		double v1, v2;
		v1 = enBoks.volumen();
		v2 = enAndenBoks.volumen();

		System.out.println("Samlet rumfang: "+ (v2 + v1));
	}
}