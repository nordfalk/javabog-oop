package kapitel_04;
public class BenytRaflebaeger
{
	public static void main(String[] arg)
	{	
		Raflebaeger bæger;
		boolean toSeksere;
		int antalForsøg;

		bæger = new Raflebaeger(3);   // opret et bæger med 3 terninger
		toSeksere=false;
		antalForsøg = 0;
		while (toSeksere==false)
		{
			bæger.ryst();              // kast alle terningerne
			System.out.print("Bæger: " + bæger + " sum: " + bæger.sum());
			System.out.println(" Antal 6'ere: "+bæger.antalDerViser(6)
			                 + " antal 5'ere: "+bæger.antalDerViser(5));
			if (bæger.antalDerViser(6) == 2)
			{
				toSeksere = true;
			}
			antalForsøg++;
		}
		System.out.println("Du fik to seksere efter "+ antalForsøg+" forsøg.");
	}
}