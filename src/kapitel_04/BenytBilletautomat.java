package kapitel_04;

import java.util.Scanner;

public class BenytBilletautomat
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat(24);
		System.out.println("Installatøren har installeret en ny billetautomat");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		while (true) {
			System.out.println("Skriv 1 for vise billetpris, 2 for at betale og 3 for at udskrive billetten");
			System.out.println("Balancen er nu på " + automat.getBalance() + " kroner");
			int valg = sc.nextInt();
      sc.nextLine();
			if (valg == 1) {
				int pris = automat.getBilletpris();
				System.out.println("Billetprisen er: " + pris + " kroner");
			} else if (valg == 2) {
				System.out.println("Kunden putter 24 kroner i automaten");
				automat.indsætPenge(24);
			} else {
				automat.udskrivBillet();
			}
		}
	}
}