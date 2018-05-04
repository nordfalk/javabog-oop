package kapitel_09;

import kapitel_04.Billetautomat;

public class TjekBilletautomat
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat(10);

		int antalFejl = 0;
		int retur;

		retur = automat.getBilletpris();
		if (retur != 10) {
			System.out.println("FEJL, getBilletpris() != 10");
		}

		System.out.println("*** Tjek af salg af en billet");
		automat.indsætPenge(10);
		automat.udskrivBillet();
		retur = automat.getBalance();
		if (retur != 0) {
			System.out.println("FEJL, getBalance() skulle give 0, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}

		System.out.println("*** Tjek af, at penge kan komme retur");
		automat.indsætPenge(100);
		automat.udskrivBillet();
		retur = automat.getBalance();
		if (retur != 90) {
			System.out.println("FEJL, getBalance() skulle give 90, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}



		System.out.println();
		System.out.println();
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");
		}
	}
}