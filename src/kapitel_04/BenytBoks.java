package kapitel_04;
public class BenytBoks
{
	public static void main(String[] arg)
	{
		double rumfang;

		Boks boksobjekt;
		boksobjekt = new Boks();

		boksobjekt.længde = 2.0;
		boksobjekt.bredde = 2.5;
		boksobjekt.højde  = 1.5;
		rumfang = boksobjekt.volumen();
		System.out.println("Boksens volumen: "+ rumfang);
	}
}