package kapitel_03;

public class Opg_3_5_7__7 {
	public static void main(String[] args) {
		String tegn = "abcdefghijklmnopqrstuvwxyzæøå";

		String tekst = "Åge lo, da baronesse Nora bad Ole gå.";
//        String tekst = "Ikke et Palindrom!";

		String nyTekst = tekst.toLowerCase();
		int bund = 0;
		int top = nyTekst.length() - 1;
		boolean erPalindrom = true;

		while (erPalindrom && (bund < top)) {
			// Sålænge tegnet på plads bund ikke er et lovligt bogstav, tælles bund én op
			// Det checkes, at bund stadig er mindre end top, ellers er vi færdige
			while (tegn.indexOf(nyTekst.substring(bund, bund + 1)) == -1 && (bund < top)) {
				bund = bund + 1;
			}

			// Sålænge tegnet på plads top ikke er et lovligt bogstav, tælles top én ned
			// Det checkes, at bund stadig er mindre end top, ellers er vi færdige
			while (tegn.indexOf(nyTekst.substring(top, top + 1)) == -1 && (bund < top)) {
				top = top - 1;
			}

			if (bund < top) {
				if (!nyTekst.substring(bund, bund + 1).equals(nyTekst.substring(top, top + 1))) {
					erPalindrom = false;
				}
			}
			bund = bund + 1;
			top = top - 1;
		}

		if (erPalindrom) {
			System.out.println("Teksten: \"" + tekst + "\" er et palindrom");
		} else {
			System.out.println("Teksten: \"" + tekst + "\" er ikke et palindrom");
		}
	}
}
