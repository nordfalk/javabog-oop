package kapitel_03;

import java.util.Scanner;

/**
 * Dette program finder ud om et ord er et palindrom.
 * Alle bogstaver med accenter og umlaut (f.eks. í, è, ä eller
 * û) bliver konverteret til de tilsvarende bogstaver uden
 * accenter (f.eks. i, e, a eller u).
 * Programmet ignorerer alle tegn som ikke er bogstaver og er
 * ligeglad med om det er små eller store bogstaver.
 * Eksempelvis vil äB..&&%%bÁ blive opfattet som et palindrom.
 */
public class Opg_3_5_7__7d {
	/**
	 * Fjerner accenter, umlaut med mere.
	 *
	 * @param input String
	 * @return String
	 */
	private static String fjernAccenterMedMere(String input) {
		// Lav á, à, ä, â, Á, À, Ä og Â om til a
		input = input.replaceAll("[áàäâÁÀÄÂ]", "a");
		// Lav é, è, ë, ê, É, È, Ë og Ê om til e
		input = input.replaceAll("[éèëêÉÈËÊ]", "e");
		// Lav í, ì, ï, î, Í, Ì, Ï og Î om til i
		input = input.replaceAll("[íìïîÍÌÏÎ]", "i");
		// Lav ó, ò, ö, ô, Ó, Ò, Ö og Ô om til o
		input = input.replaceAll("[óòöôÓÒÖÔ]", "o");
		// Lav ú, ù, ü, û, Ú, Ù, Ü og Û om til u
		input = input.replaceAll("[úùüûÚÙÜÛ]", "u");
		// Lav ý, ÿ og Ý om til y
		input = input.replaceAll("[ýÿÝ]", "y");
		// Lav ñ og Ñ om til n
		input = input.replaceAll("[ñÑ]", "n");
		return input;
	}

	/**
	 * Fjerner alt bortset fra 'almindelige' danske bogstaver store som
	 * små. Dvs. a - å, A - Å
	 *
	 * @param input String
	 * @return String
	 */
	private static String fjernAltBortsetFraBogstaver(String input) {
		// Fjern alle tegn bortset fra a til å og A til Å
		input = input.replaceAll("[^a-zA-ZæøåÆÅØ]", "");
		System.out.println("Inputstreng efter filtrering: " + input);
		return input;
	}

	/**
	 * Forudsætter at der ikke er tegnsætning, accenter, umlaut med mere i
	 * input-strengen. Ydermere skal alle tegnene enten være store eller små
	 * bogstaver.
	 *
	 * @param input Input streng renset for tegnsætning, accenter mm.
	 * @return boolean
	 */
	private static boolean isPalindrome(String input) {
		StringBuilder firstHalfReversed = new StringBuilder(input.length() / 2);
		firstHalfReversed.append(input.substring(0, input.length() / 2));
		firstHalfReversed.reverse();

		return input.endsWith(firstHalfReversed.toString());
	}

	/**
	 * @param args String[]
	 */
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);

		System.out.print("Indtast streng: ");
		String input = tastatur.nextLine();

		input = fjernAccenterMedMere(input);
		input = fjernAltBortsetFraBogstaver(input);

		// Lav alle bogstaver om til små bogstaver
		input = input.toLowerCase();

		if (isPalindrome(input)) {
			System.out.println("Det er et palindrom");
		} else {
			System.out.println("Det er ikke et palindrom");
		}
	}
}
