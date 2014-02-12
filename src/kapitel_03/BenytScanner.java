package kapitel_03;
import java.util.Scanner;

public class BenytScanner 
{
	public static void main(String[] arg)
	{
		Scanner scanner = new Scanner(System.in); // opret scanner-objekt
		System.out.println("Hvor mange personer er der i din husstand? ");
		int antalPersoner = scanner.nextInt();

		int sumAlder = 0;
		double sumVægt = 0;
		String alleNavne = "";

		for (int n = 1; n <= antalPersoner; n++) {
			scanner.nextLine();                      // hop over linjeskiftet
			System.out.print("Skriv personen nummer " + n + "s navn og tryk retur: ");
			String navn = scanner.nextLine();        // læs en linje fra tastaturet
			System.out.print("Skriv " + navn + "s alder og vægt og tryk retur: ");
			int alder = scanner.nextInt();           // læs et helt tal fra tastaturet
			double vægt = scanner.nextDouble();      // læs et kommatal fra tastaturet
			if (n>1) alleNavne = alleNavne + ", ";   // sæt komma før næste navn
			alleNavne = alleNavne + navn;
			sumAlder = sumAlder + alder;
			sumVægt = sumVægt + vægt;
		}

		System.out.println("Statistik for " + alleNavne); 
		System.out.println("Gennemsnitlig alder: " + sumAlder / antalPersoner);
		System.out.println("Gennemsnitlig vægt: " + sumVægt / antalPersoner);
	}
}