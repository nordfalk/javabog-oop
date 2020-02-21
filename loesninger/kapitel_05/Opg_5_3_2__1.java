package kapitel_05;// Matadorspil for to spillere

public class Opg_5_3_2__1 {
	static class Bryggeri extends Felt {
		Spiller ejer;
		double pris;
		double grundleje;

		public Bryggeri(String navn, double pris) {
			this.navn = navn;
			this.pris = pris;
		}

		public void landet(Spiller sp) {
			System.out.println(sp.navn + " er landet på " + navn);
			if (sp == ejer) {                                       // spiller ejer selv grunden
				System.out.println("Dette er " + sp.navn + "s egen grund");
			} else if (ejer == null) {                                       // ingen ejer grunden, så køb den
				if (sp.konto > pris) {
					System.out.println(sp.navn + " køber " + navn + " for " + pris);
					ejer = sp;
					sp.transaktion(-pris);
				} else System.out.println(sp.navn + " har ikke penge nok til at købe " + navn);
			} else {                                       // feltet ejes af anden spiller
				grundleje = 800 * ((int) (Math.random() * 6 + 1));
				System.out.println("Husleje: " + grundleje);
				sp.betal(ejer, grundleje);            // spiller betaler til ejeren
			}
		}
	}


	public static void main(String[] args) {
		Matadorspil spil = new Matadorspil();
		spil.felter.add(4, new Bryggeri("Tuborg", 16000));
		spil.felter.add(8, new Bryggeri("Carlsberg", 24000));

		spil.spillere.add(new Spiller("Søren", 50000));   // opret spiller Søren
		spil.spillere.add(new Spiller("Gitte", 50000));   // opret spiller Gitte

		// løb gennem 20 runder (40 ture)
		for (spil.spillersTur = 0; spil.spillersTur < 40; spil.spillersTur++) {
			// tag skiftevis Søren og Gitte (% er forklaret i afsnit Fejl: Henvisningskilde ikke fundet)
			Spiller sp = spil.spillere.get(spil.spillersTur % spil.spillere.size());
			int slag = (int) (Math.random() * 6) + 1;     // og slå et terningkast (1-6)
			System.out.println("***** " + sp.navn + " på felt " + sp.feltnr + " slår " + slag);

			for (int i = 1; i <= slag; i = i + 1)                  // nu rykkes der
			{
				// gå til næste felt. Hvis vi når over antal felter så tæl fra 0
				sp.feltnr = sp.feltnr + 1;
				if (sp.feltnr == spil.felter.size()) sp.feltnr = 0;
				Felt felt = spil.felter.get(sp.feltnr);

				if (i < slag) felt.passeret(sp); // kald passeret() på passerede felter
				else felt.landet(sp);          // kald landet() på sidste felt
				try {
					Thread.sleep(300);
				} catch (Exception e) {
				} // vent 0.3 sek
			}
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			} // tur slut, vent 3 sek
		}
	}
}

