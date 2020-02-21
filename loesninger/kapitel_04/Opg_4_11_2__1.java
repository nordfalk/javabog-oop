package kapitel_04;

import java.util.ArrayList;


public class Opg_4_11_2__1 {

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
				Konto kontoF = konti.get(i);
				formueF += kontoF.saldo;
			}
			return formueF;
		}
	}


	static class Konto {
		public int saldo;
		public Person ejer;

		public Konto(Person ejeren) {
			saldo = 0;
			ejer = ejeren;
			ejer.konti.add(this);
		}

		public void overførsel(int kroner) {
			saldo = saldo + kroner;
		}

		public String toString() {
			return ejer + " har saldo " + saldo + " kr.\n";
		}
	}


	static public void main(String[] args) {
		Person x;
		Konto jens1, jens2;

		x = new Person("Jens", "Pedersen", 36);

		System.out.println("Vi har oprettet " + x);

		jens1 = new Konto(x);
		jens2 = new Konto(x);

		System.out.println("Vi har oprettet følgende konti : " + jens1 + " " + jens2);

		jens1.overførsel(1000);
		jens2.overførsel(2000);

		System.out.println("Kontooversigt : " + jens1 + " " + jens2);
		System.out.println("" + x);
	}
}
