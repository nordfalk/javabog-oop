package kapitel_09;

import kapitel_04.Billetautomat;

public class TjekBilletautomat
{
	public static void main(String[] arg)
	{
		int antalFejl = 0;                   // opsætning af testen
		Billetautomat automat = new Billetautomat(10);

		int værdi = automat.getBilletpris(); // tjek af startbetingelser
		if (værdi != 10) {
			System.out.println("FEJL, getBilletpris() giver ikke 10");
			antalFejl = antalFejl + 1;
		}

		automat.indsætPenge(10);             // afprøvning af indsætPenge()
		værdi = automat.getBalance();        // tjek af forventet tilstand
		if (værdi != 10) {
			System.out.println("FEJL, getBalance() giver ikke 10, men "+værdi);
			antalFejl = antalFejl + 1;
		}

		automat.udskrivBillet();             // afprøvning af udskrivBillet()
		værdi = automat.getBalance();        // tjek af forventet tilstand
		if (værdi != 0) {
			System.out.println("FEJL, getBalance() giver ikke 0, men "+værdi);
			antalFejl = antalFejl + 1;
		}

		værdi = automat.getSamletSalgsbeløb("1234"); // tjek af forventet tilstand
		if (værdi != 10) {
			System.out.println("FEJL getSamletSalgsbeløb() giver ikke 10 men "+værdi);
			antalFejl = antalFejl + 1;
		}

		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Der blev fundet "+antalFejl+" fejl i automaten, ØV!");
		}
	}
}