package kapitel_03;

public class Opg_3_5_7__7b {
	public static void main(String[] arg) {
		String s1, s2, s3, s4, s5;
		int halflength, i, length;
		s1 = "Åge lo, da baronesse Nora bad Ole gå"; /* inputstreng */
		s4 = "";

		/* Fjern store bogstaver, space og ',' fra inputstreng: */
		s5 = s1.toLowerCase();
		s5 = s5.replace(" ", "");
		s5 = s5.replace(",", "");

		/* Find længde & ½ længde af den tilpassede streng (s5): */
		length = s5.length();
		halflength = length / 2;

		/* Debug info: */
		System.out.println("length: " + length);

		/* Gem første halvdel af den tilpassede streng i s2 og
		 den anden halvdel af den tilpassede streng i s3: */
		if (length % 2 > 0) {
			/* Streng længde er ulige */
			s2 = s5.substring(0, halflength);
			s3 = s5.substring(halflength + 1);
		} else {
			/* Streng længde er lige */
			s2 = s5.substring(0, halflength);
			s3 = s5.substring(halflength);
		}

		i = halflength - 1;

		/* 'Inverter' streng s3 og gem resultat i s4: */
		while (i >= 0) {
			s4 = s4 + s3.substring(i, i + 1);
			i--;
		}

		/* Undersøg om s2 og s4 er ens: */
		if (s2.equals(s4)) {
			System.out.println("Tekststreng er en palindrom: " + s1);

			/* Debug info: */
			System.out.println("s5: " + s5);
			System.out.println("s2: " + s2);
			System.out.println("s3: " + s3);
			System.out.println("s4: " + s4);
		} else {
			System.out.println("Tekststreng er IKKE en palindrom: " + s1);

			/* Debug info: */
			System.out.println("s5: " + s5);
			System.out.println("s2: " + s2);
			System.out.println("s3: " + s3);
			System.out.println("s4: " + s4);
		}
	}
}
