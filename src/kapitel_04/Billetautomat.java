package kapitel_04;
/**
 * Model af en simpel billetautomat til enkeltbilletter med én fast pris.
 */
public class Billetautomat {
	private int pris;    // Prisen for én billet.
	private int balance; // Hvor mange penge kunden p.t. har puttet i automaten
	private int total;   // Total mængde penge som billetautomaten har modtaget
	private int antalBilletterSolgt; // Antal billetter automaten i alt har solgt

	/**
	 * Opret en billetautomat der sælger billetter til en given billetpris.
	 * @param billetpris skal være større end nul (p.t. bliver det ikke tjekket)
	 */
	public Billetautomat(int billetpris) {
		pris = billetpris;
		balance = 0;
		total = 0;
		antalBilletterSolgt = 0;
	}

	/**
	 * Opret en billetautomat der sælger billetter til en given billetpris
	 * @param billetpris skal være større end nul (p.t. bliver det ikke tjekket)
	 * @param startbalance mængden af penge automaten allerede indeholder
	 */
	public Billetautomat(int billetpris, int startbalance) {
		int pris = billetpris;
		balance = startbalance;
		total = 0;
		antalBilletterSolgt = 0;
	}

	/**
	 * Giver prisen for en billet.
	 */
	public int getBilletpris() {
		int resultat = pris;
		return resultat;
	}

	/**
	 * Modtag nogle penge (i kroner) fra en kunde.
	 */
	public void indsætPenge(int beløb) {
		balance = balance + beløb;
		total = total + beløb;
	}

	/**
	 * Giver balancen (beløbet maskinen har modtaget til den næste billet).
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * Udskriv en billet.
	 * Opdater total og nedskriv balancen med billetprisen
	 */
	public void udskrivBillet() {
		System.out.println("##########B##T#########");
		System.out.println("# BlueJ Trafikselskab #");
		System.out.println("#                     #");
		System.out.println("#        Billet       #");
		System.out.println("#        " + pris + " kr.       #");
		System.out.println("#                     #");
		System.out.println("##########B##T#########");
		System.out.println("# Du har " + balance + " kr til gode       #");
		System.out.println("##########B##T#########");
		System.out.println();

		antalBilletterSolgt = antalBilletterSolgt + 1;
		total = total + balance; // Opdater total med balance
		balance = 0;              // Nulstil balance
	}
}