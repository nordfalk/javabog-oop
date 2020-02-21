package kapitel_04;

import java.util.*;

public class Opg_4_4_1__3 {

	static public void main(String[] args) {

		ArrayList<Terning> liste = new ArrayList<Terning>();
		for (int i = 0; i < 12; i++) liste.add(new Terning());

		int antalSlag = 0;

		while (antalSlag < 10) {
			antalSlag++;

			Terning t;
			for (int i = 0; i < liste.size(); i++) {
				t = liste.get(i);
				t.kast();
			}

			int seksere = 0;
			int sum = 0;
			for (int i = 0; i < liste.size(); i++) {
				t = liste.get(i);
				sum = sum + t.getVærdi();
				if (t.getVærdi() == 6) seksere++;
			}

			System.out.println("Terninger: " + liste);
			System.out.println("Sum : " + sum + "   Antal slag : " + antalSlag + "  Antal seksere : " + seksere);
		}
	}
}
