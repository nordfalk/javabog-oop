package kapitel_18;/*
2. Udvid programmet til, at brugeren angiver filnavnet, der skal hentes/gemmes i.
*/

import kapitel_04.Opg_4_10__3.Udgivelse;
import kapitel_14.Tastatur;

import java.util.ArrayList;

public class Opg_18_3__3__Udgivelser {
	public static void main(String arg[]) throws Exception {
		ArrayList<Udgivelse> samling;
		Tastatur t = new Tastatur();
		System.out.print("Filnavn, der indeholder samlingen : ");
		try {
			samling = (ArrayList<Udgivelse>) Serialisering.hent(t.læsLinje());
			System.out.println("Indlæst : " + samling);
		} catch (Exception e) {
			samling = new ArrayList<Udgivelse>();
			samling.add(new Udgivelse(1996, "Load", "Metalica", "PolyGram"));
			samling.add(new Udgivelse(1992, "Ten", "Pearl Jam", "Sony"));
			samling.add(new Udgivelse(1998, "Adore", "Smashing Pumpkins", "Virgin"));
			System.out.println("Oprettet : " + samling);
		}

		System.out.println("Indtast ny udgivelse: år, navn, gruppe og pladeselskab (hver på en ny linie)");

		Udgivelse u = new Udgivelse((int) t.læsTal(), t.læsLinje(), t.læsLinje(), t.læsLinje());

		samling.add(u);

		System.out.println("Den nye samling er :\n " + samling);

		System.out.print("Filnavn, hvor samlingen skal gemmes : ");
		Serialisering.gem(samling, t.læsLinje());
	}
}
