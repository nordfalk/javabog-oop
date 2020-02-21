package kapitel_15;

/*
 1. Udvid LaesTekstfilOgLavStatistik.java sådan, at linier, der starter med "#" er kommentarer, som
 ignoreres, og afprøv om programmet virker.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Opg_15_8__1__LaesTekstfilOgLavStatistik {
	public static void main(String[] args) {
		int antalPersoner = 0;
		int sumAlder = 0;

		try {
			BufferedReader ind = new BufferedReader(new FileReader("skrevet fil.txt"));
			String linie = ind.readLine();
			while (linie != null) {
				if (!linie.startsWith("#")) try {
					StringTokenizer bidder = new StringTokenizer(linie);
					String navn = bidder.nextToken();
					String køn = bidder.nextToken();
					int alder = Integer.parseInt(bidder.nextToken());

					System.out.println(navn + " er " + alder + " år.");
					antalPersoner++;
					sumAlder += alder;
				} catch (Exception u) {
					System.out.println("Fejl. Linien springes over.");
					u.printStackTrace();
				}
				linie = ind.readLine();
			}
			System.out.println("Aldersgennemsnittet er: " + sumAlder / antalPersoner);
		} catch (FileNotFoundException u) {
			System.out.println("Filen kunne ikke findes");
		} catch (Exception u) {
			System.out.println("Fejl ved læsning af fil");
			u.printStackTrace();
		}
	}
}