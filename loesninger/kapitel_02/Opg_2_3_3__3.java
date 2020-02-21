package kapitel_02;

import javax.swing.*;

public class Opg_2_3_3__3 {
	public static void main(String[] args) {
		double vægt, pris;
		vægt = 47;

		// Lav et vindue der spørger brugeren om vægten
		vægt = Double.parseDouble(
						JOptionPane.showInputDialog("Indtast vægt i gram.")
		);

		System.out.println("Hvis brevet vejer " + vægt + " gram...");

		if (vægt <= 20) pris = 4.00;
		else if (vægt <= 50) pris = 5.5;
		else if (vægt <= 100) pris = 6.0;
		else if (vægt <= 250) pris = 10.25;
		else if (vægt <= 500) pris = 18.0;
		else if (vægt <= 1000) pris = 22.0;
		else if (vægt <= 1500) pris = 29.0;
		else pris = 32.0;

		System.out.println("så er prisen for at sende brevet er " + pris);
	}
}
