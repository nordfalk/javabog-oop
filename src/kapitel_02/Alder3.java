package kapitel_02;
public class Alder3
{
	public static void main(String[] arg) 
	{
		int alder;
		alder = 15;

		if (alder >= 18) 
		{                                                   // blokstart
			System.out.println("Du er " + alder + " år.");
			System.out.println("Du er myndig.");
		}                                                   // blokslut 
		else 
		{                                                   // blokstart
			System.out.println("Du er kun " + alder + " år.");
			System.out.println("Du er ikke myndig.");
		}                                                   // blokslut
	}
}