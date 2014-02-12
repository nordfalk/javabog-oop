package kapitel_02;
public class AlderMedTastaturindlaesning
{
	public static void main(String[] arg) 
	{
		java.util.Scanner tastatur = new java.util.Scanner(System.in);  // forbered

		System.out.println("Skriv din alder herunder og tryk retur:");
		int alder;
		alder = tastatur.nextInt();                     // læs et tal fra tastaturet

		if (alder >= 18) System.out.println("Du er myndig.");
		System.out.println("Du er " + alder + " år.");
	}
}