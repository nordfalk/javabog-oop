package kapitel_04;

import java.util.ArrayList;

public class Opg_4_5_2__3 {
	static class Raflebæger {
		public ArrayList<Terning> terninger;  // Raflebaeger har en vektor af terninger

		public Raflebæger(int antalTerninger) {
			terninger = new ArrayList<Terning>();
			for (int i = 0; i < antalTerninger; i++) {
				Terning t;
				t = new Terning();
				tilføj(t);
			}
		}

		public void tilføj(Terning t) // Læg en terning i bægeret
		{
			terninger.add(t);
		}

		public void ryst() // Kast alle terningerne
		{
			for (int i = 0; i < terninger.size(); i++) {
				Terning t;
				t = (Terning) terninger.get(i);
				t.kast();
			}
		}

		public int sum() // Summen af alle terningers værdier
		{
			int resultat;
			resultat = 0;
			for (int i = 0; i < terninger.size(); i++) {
				Terning t;
				t = (Terning) terninger.get(i);
				resultat = resultat + t.getVærdi();
			}
			return resultat;
		}

		/**
		 * Tæller antallet af terninger, der har en bestemt værdi.
		 * Eksempel: For [1, 3, 4, 4, 6] vil antalDerViser(1) give 1,antalDerViser(2) give 0,
		 * og antalDerViser(4) give 2.
		 *
		 * @param værdi Ønsket værdi, f.eks. 6
		 * @return antallet af den ønskede værdi (f.eks. hvor mange 6'ere der er)
		 */
		public int antalDerViser(int værdi) {
			int resultat;
			resultat = 0;
			for (int i = 0; i < terninger.size(); i++) {
				Terning t;
				t = (Terning) terninger.get(i);
				if (t.getVærdi() == værdi) {
					resultat = resultat + 1;
				}
			}
			return resultat;
		}

		/**
		 * Tjekker for Lav (kaldes også lille straight)
		 *
		 * @return true hvis der er en 1'er, 2'er, 3'er, 4'er og en 5'er.
		 */
		public boolean lilleStraight() {
			if (antalDerViser(1) < 1) return false;
			if (antalDerViser(2) < 1) return false;
			if (antalDerViser(3) < 1) return false;
			if (antalDerViser(4) < 1) return false;
			if (antalDerViser(5) < 1) return false;
			return true;
		}

		/**
		 * Tjekker for Høj (kaldes også stor straight)
		 *
		 * @return true hvis der er en 2'er, 3'er, 4'er, 5'er og en 6'er.
		 */
		public boolean storStraight() {
			for (int værdi = 2; værdi <= 6; værdi++) {
				if (antalDerViser(værdi) < 1) return false;
			}
			return true;
		}


		public boolean tjekOmDerErSåMangeEns(int ønsketAntalEns) {
			for (int værdi = 1; værdi <= 6; værdi++) {
				if (antalDerViser(værdi) >= ønsketAntalEns) return true;
			}
			return false;
		}


		public boolean femEns() {
			return tjekOmDerErSåMangeEns(5);
		}

		public boolean fireEns() {
			return tjekOmDerErSåMangeEns(4);
		}

		public boolean treEns() {
			return tjekOmDerErSåMangeEns(3);
		}

		public boolean toEns() {
			return tjekOmDerErSåMangeEns(3);
		}

		public boolean etPar() {
			return tjekOmDerErSåMangeEns(3);
		}

		public boolean hus() {
			return toEns() && treEns();
		}

		public boolean toPar() {
			int antalPar = 0;
			for (int værdi = 1; værdi <= 6; værdi++) {
				if (antalDerViser(værdi) == 2) antalPar++;
			}
			return antalPar == 2;
		}


		public String beskrivelse() {
			if (femEns()) return "Fem ens";
			if (fireEns()) return "Fire ens";
			if (storStraight()) return "Stor straight";
			if (lilleStraight()) return "Lille straight";
			if (hus()) return "Hus";
			if (treEns()) return "Tre ens";
			if (toPar()) return "To par";
			if (etPar()) return "Et par";
			return "Ingenting";
		}

		public String toString() {
			return terninger.toString() + " " + beskrivelse();
		}
	}


	static public void main(String[] args) {

		Raflebæger bæger1 = new Raflebæger(5);
		int antalSlag = 0;
		while (antalSlag < 10) {
			antalSlag++;
			bæger1.ryst();
			System.out.println("Slag nr. " + antalSlag);
			System.out.println("Summen af øjnene var " + bæger1.sum());
			System.out.println(bæger1.toString());
			System.out.println();
		}
	}
}
