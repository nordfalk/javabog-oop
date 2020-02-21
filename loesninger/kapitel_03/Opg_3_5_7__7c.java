package kapitel_03;

// Programmet undersøger, om en tekst er et palindrom
public class Opg_3_5_7__7c {
	public static void main(String[] args) {
		// Lovlige tegn
		String tegn = "abcdefghijklmnopqrstuvwxyzæøå";

		// Teksten, som skal undersøges
		String tekst = "Åge lo, da baronesse Nora bad Ole gå.";

		// Teksten, der skal undersøges, skrevet med små bogstaver
		String lilleTekst = tekst.toLowerCase();

		// Variabler til sammenligning tegn for tegn, hvor tegnet på plads nr. bund
		// i teksten skrevet med små bogstaver skal sammenlignes med tegnet på plads nr. top
		int bund = 0;
		int top = lilleTekst.length() - 1;


		// Variablen angiver, om der er fundet et lovligt tegn i teksten
		boolean etTegn = false;

		// Det undersøges, om teksten indeholder mindst ét lovligt tegn
		for (int i = 0; i < lilleTekst.length(); i++) {
			if (tegn.indexOf(lilleTekst.charAt(i)) != -1) {
				etTegn = true;
				break;
			}
		}

		// Hvis der findes mindst ét lovligt tegn i teksten, initialiseres variablen til true, ellers false
		boolean erPalindrom = etTegn;

		// Sålænge det ikke konstateret, at det ikke er et palindrom, og vi ikke er nået til midten af teksten,
		// sammenlignes tegnet på plads nr. bund med tegnet på plads nr. top
		while (erPalindrom && (bund < top)) {
			// Sålænge tegnet på plads nr. bund ikke er et lovligt tegn, tælles bund én op
			// Dvs. at ulovlige tegn springes over
			while (tegn.indexOf(lilleTekst.charAt(bund)) == -1 && (bund < top)) {
				bund = bund + 1;
			}

			// Sålænge tegnet på plads nr. top ikke er et lovligt tegn, tælles top én op
			// Dvs. at ulovlige tegn springes over
			while (tegn.indexOf(lilleTekst.charAt(top)) == -1 && (bund < top)) {
				top = top - 1;
			}

			// Hvis plads nr. bund er mindre en plads nr. top, sammenlignes tegnet på plads nr. bund
			// med tegnet på plads nr. top
			// Hvis disse tegn er forskellige, sættes variablen erPalindrom til false, da teksten så ikke
			// er et palindrom
			if (bund < top) {
				if (lilleTekst.charAt(bund) != (lilleTekst.charAt(top))) {
					erPalindrom = false;
				}
			}

			// Bund og top tælles op
			bund = bund + 1;
			top = top - 1;
		}

		// Teksten og hvorvidt teksten er et palindrom udskrives
		if (erPalindrom) {
			System.out.println("Teksten: \"" + tekst + "\" er et palindrom");
		} else {
			System.out.println("Teksten: \"" + tekst + "\" er ikke et palindrom");
		}
	}
}
