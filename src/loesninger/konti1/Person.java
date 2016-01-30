//Malene Andersen
package loesninger.konti1;

import java.util.ArrayList;

public class Person {
	private String fornavn;
	private String efternavn;
	private int alder;
	public ArrayList<Konto> konti; // bruges senere
	private Bil bil;

	public Person(String fornavnP, String efternavnP, int alderP, Bil l_bil) {
		fornavn = fornavnP;
		efternavn = efternavnP;
		alder = alderP;
		konti = new ArrayList<Konto>(); // bruges senere
		bil = l_bil;
	}

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

	public String formue() {
		int l_size = (konti.size());
		int l_formue = 0;
		Konto l_konto;
		String returntekst;

		for (int i = 0; i < l_size; i++) {
			l_konto = konti.get(i);
			l_formue = l_formue + l_konto.saldo();
		}

		if (bil != null) {
			l_formue = l_formue + bil.værdi();
			returntekst = l_formue + "kroner. Personen ejer en bil til værdien: " + bil.værdi() + " kroner";
		} else {
			returntekst = l_formue + " kroner";
		}

		return returntekst;
	}
}