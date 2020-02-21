package kapitel_04;

import java.util.*;

public class Opg_4_11_2__3 {
	static class Postering {
		public Konto konto;
		public Date dato;
		public String tekst;
		public int beløb;
		public int lbSaldo;

		public Postering(Konto kontoP, String tekstP, int beløbP) {
			konto = kontoP;
			dato = new Date();
			if (beløbP > 0) tekst = tekstP + "   Indsat kroner : ";
			else tekst = tekstP + "   Hævet kroner : ";
			beløb = beløbP;
			konto.posteringer.add(this);
			konto.saldo += beløbP;
			lbSaldo = konto.saldo;
		}

		public String toString() {
			return dato + "   " + tekst + "   " + beløb + "   " + lbSaldo;
		}
	}

	static class Person {
		public String fornavn;
		public String efternavn;
		public int alder;
		public ArrayList<Konto> konti = new ArrayList<>();

		public Person(String fornavnP, String efternavnP, int alderP) {
			fornavn = fornavnP;
			efternavn = efternavnP;
			alder = alderP;
		}

		public String toString() {
			return fornavn + " " + efternavn + " (" + alder + " år)\n";
		}

		public void præsentation() {
			if (alder < 5) System.out.println("agyyy!");
			else System.out.println("Jeg hedder " + fornavn + ", og jeg er " + alder + " år.");
		}

		public void hils(Person andenPerson) {
			if (alder < 5) System.out.println("ma ma.. ");
			else if (alder < 60) System.out.println("Hej " + andenPerson.fornavn + ". ");
			else System.out.println("Goddag hr. " + andenPerson.efternavn + ". ");
			præsentation();
		}

		public int formue() {
			int formueF = 0;
			for (int i = 0; i < konti.size(); i++) {
				Konto kontoF = (Konto) konti.get(i);
				formueF += kontoF.saldo;
			}
			return formueF;
		}

	}


	static class Konto {
		public int saldo;
		public Person ejer;
		public ArrayList<Postering> posteringer = new ArrayList<Postering>();

		public Konto(Person ejeren) {
			saldo = 0;
			ejer = ejeren;
			ejer.konti.add(this);
		}

		public void overførsel(int kroner) {
			Postering postering = new Postering(this, "Overførsel ", kroner);
		}


		public String toString() {
			return ejer + " har saldo " + saldo + " kr.\n";
		}

		public void udskrivPosteringer() {
			System.out.println("" + ejer);
			for (int i = 0; i < posteringer.size(); i++) {
				Postering p = (Postering) posteringer.get(i);
				System.out.println("" + p);
			}
		}
	}


	static public void main(String[] args) {
		Person x, y, z;
		Konto jens1, jens2;

		x = new Person("Jens", "Pedersen", 36);
		y = new Person("Kai", "Lund", 86);
		z = new Person("Peter", "Holm", 2);

		jens1 = new Konto(x);
		jens2 = new Konto(x);

		System.out.println("Vi har oprettet følgende konti : \n" + jens1 + jens2);

		jens1.overførsel(1000);
		jens2.overførsel(2000);


		Postering nyeBukser = new Postering(jens1, "Nye cowboybukser", -500);
		Postering lottopræmie = new Postering(jens1, "Vundet i lotto", 3800000);

		System.out.println("Kontooversigt : \n" + jens1 + jens2);

		jens1.udskrivPosteringer();
		jens2.udskrivPosteringer();

	}
}
