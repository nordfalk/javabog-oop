package kapitel_03;

public class Opg_3_5_7__5 {
	public static void main(String[] args) {
		String s = "Jeg, er ikke særlig,, dygtig til, at sætte kommaer.";

		int antal = 0;
		int pos = s.indexOf(",");

		while (pos != -1) {
			antal = antal + 1;

			/* En løsning er at lave en ny streng:

			 String s2 = s.substring(pos+1);
			 int pos2 = s2.indexOf(",");
			 if (pos2 != -1) pos = pos2+ pos+1;
			 else pos = -1;
			 */

			// Men mere elegant er at bruge indexOf() med et startindeks:
			pos = s.indexOf(",", pos + 1);
		}
		System.out.println("Der er " + antal + " kommaer i: " + s);
	}
}
