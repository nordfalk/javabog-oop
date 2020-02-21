package kapitel_15;/*
2. Skriv et program, Grep.java, der læser en fil og udskriver alle linier, der indeholder en
	 bestemt delstreng (vink: Ret LaesTekstfil.java - en linie undersøges for en delstreng med
	 substring(...))
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Opg_15_8__3__Grep {
	public static void main(String[] args) throws IOException {
		String søgestreng = "m";
		String filnavn = "skrevet fil.txt";

		// Hvis der er to kommandolinie-parametre fortolkes den første som søgestrengen
		// og den anden som filnavnet
		if (args.length >= 2) {
			søgestreng = args[0];
			filnavn = args[1];
		}

		BufferedReader ind = new BufferedReader(new FileReader(filnavn));
		String linie = ind.readLine();
		while (linie != null) {
			if (linie.indexOf(søgestreng) >= 0) System.out.println(linie);
			linie = ind.readLine();
		}
	}
}
