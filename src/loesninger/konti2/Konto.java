package loesninger.konti2;

import java.util.ArrayList;

public class Konto {
	public int saldo;
	public Person ejer;
	public ArrayList<Postering> posteringer;

	public Konto(Person ejeren) {
		saldo = 0;
		posteringer = new ArrayList<>();
		ejer = ejeren;      //Sæt kontoen til at referere til personen.
	}

	@Override
	public String toString() {
		return ejer.fornavn + " " + ejer.efternavn + " har " + saldo + " kr.";
	}

	public void udskrivListe() {
		for (int i = 1; i <= posteringer.size(); i++) {
			System.out.println(posteringer.get(i - 1).toString());
		}
	}
}