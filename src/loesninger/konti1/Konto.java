//Malene Andersen
package loesninger.konti1;

import java.util.ArrayList;

public class Konto {
	private int saldo;
	private Person ejer;
	private ArrayList<Postering> postering = new ArrayList<Postering>();

	public Konto(Person ejeren) {
		ejer = ejeren;               // Sæt kontoen til at referere til personen
		//ejer.konti.add(this);        // ... og personen til at referere til kontoen
		saldo = 0;
	}

	public void overførsel(int kroner) {
		saldo = saldo + kroner;

		Postering l_Post = new Postering(saldo, "Saldo ændret med " + kroner + " kroner, er nu på ");
		postering.add(l_Post);
	}

	public int saldo() {
		Postering l_Post = new Postering(saldo, "Saldo oplyst ");
		postering.add(l_Post);

		return saldo;
	}

	public String toString() {
		return ejer + " har " + saldo + " kr.";
	}

	public String udskrivPosteringer() {
		String l_log = "";

		for (int i = 0; i < postering.size(); i++) {
			String l_Udskriv = postering.get(i).toString();
			l_log += (l_Udskriv) + "\n";
		}

		return l_log;
	}
}