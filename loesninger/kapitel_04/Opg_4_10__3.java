package kapitel_04;

/*
 1. Lav et program, der holder styr på en musiksamling. Opret en klasse, der repræsenterer en
 udgivelse (int år, String navn, String gruppe, String pladeselskab). Programmet skal huske
 listen over udgivelser og kunne udskrive den, brugeren skal kunne tilføje flere, og gemme og
 hente listen i en fil (vha. serialisering).
 */

import java.io.Serializable;
import java.util.ArrayList;

public class Opg_4_10__3 {
	public static class Udgivelse implements Serializable {
		public int år;
		public String navn;
		public String gruppe;
		public String pladeselskab;

		public Udgivelse(int årInd, String navnInd, String gruppeInd, String selskabInd) {
			år = årInd;
			navn = navnInd;
			gruppe = gruppeInd;
			pladeselskab = selskabInd;
		}


		public String toString() {
			return "navn : " + navn + ",  gruppe : " + gruppe + ",  år : " + år + ",  pladeselskab : " + pladeselskab + "\n";
		}
	}

	public static void main(String arg[]) throws Exception {
		ArrayList<Udgivelse> samling = new ArrayList<Udgivelse>();
		samling.add(new Udgivelse(1996, "Load", "Metalica", "PolyGram"));
		samling.add(new Udgivelse(1992, "Ten", "Pearl Jam", "Sony"));
		samling.add(new Udgivelse(1998, "Adore", "Smashing Pumpkins", "Virgin"));

		System.out.println("Den nye samling er :\n " + samling);
	}

}
