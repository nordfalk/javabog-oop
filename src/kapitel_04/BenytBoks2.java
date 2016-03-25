package kapitel_04;
public class BenytBoks2
{
	public static void main(String[] arg)
	{
		Boks2 enBoks = new Boks2();

		//ulovligt:	enBoks.længde = 1.5;
		//ulovligt: enBoks.bredde = 1.0;
		//ulovligt: enBoks.højde  = 1.0;

		enBoks.sætMål( 1.5, 1.0, 1.0);

		System.out.println("Volumen er: "+ enBoks.volumen());

		Boks2 enAndenBoks = new Boks2();

		enAndenBoks.sætMål( 0.0,-0.5, 0.5);
		System.out.println("Volumen er: "+ enAndenBoks.volumen());

		enAndenBoks.sætMål( 0.5, 0.5, 0.5);
		System.out.println("Volumen er: "+ enAndenBoks.volumen());

		System.out.println("Samlet: " +(enBoks.volumen() + enAndenBoks.volumen()));
	}
}