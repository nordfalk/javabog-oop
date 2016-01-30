package loesninger.konti2;

import java.util.ArrayList;

public class Person {
	public String fornavn;
	public String efternavn;
	public int alder;
	public ArrayList<Konto> konti;  //Liste over konti...
	public ArrayList<Bil> biler;    //Og biler.

	public Person(String fornavnP, String efternavnP, int alderP) {
		fornavn = fornavnP;
		efternavn = efternavnP;
		alder = alderP;
		konti = new ArrayList<>();
		biler = new ArrayList<>();
	}

	public void nyKonto() {
		konti.add(new Konto(this));
	}

	@Override
	public String toString() {
		return fornavn + " " + efternavn + " (" + alder + " år)";
	}

	public void præsentation() {
		if (alder < 5) System.out.println("agyyy!");
		else System.out.println("Jeg hedder " + fornavn + " og jeg er " + alder + " år.");
	}

	public void hils(Person andenPerson) {
		if (alder < 5) System.out.print("ma ma.. ");
		else if (alder < 60) System.out.print("Hej " + andenPerson.fornavn + ". ");
		else System.out.print("Goddag, hr. " + andenPerson.efternavn + ". ");
		præsentation();
	}

	public int formue() {
		int formue = 0;
		for (Konto k : konti) formue = formue + k.saldo;
		for (Bil b : biler) formue = formue + b.værdi;
		return formue;
	}
}