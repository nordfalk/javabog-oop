package kapitel_07;
public class BenytBoks4
{
	public static void main(String[] arg)
	{
		System.out.println("Antal bokse: "+ Boks4.læsAntalBokse());

		Boks4 boksen;
		boksen = new Boks4(2,5,10);

		System.out.println("Antal bokse: "+ Boks4.læsAntalBokse());

		Boks4 enAndenBoks, enTredjeBoks;
		enAndenBoks = new Boks4(5,5,10);
		enTredjeBoks = new Boks4(7,5,10);

		System.out.println("Antal bokse: "+ Boks4.læsAntalBokse());
	}
}