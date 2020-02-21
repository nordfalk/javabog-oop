package kapitel_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Opg_2_10_2__3 {
	public static void main(String[] args) throws Exception {
		double xStart, xSlut, skalering, forskydning;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Indtast startpunktet: ");
		xStart = Double.parseDouble(br.readLine());

		System.out.print("Indtast slutpunktet: ");
		xSlut = Double.parseDouble(br.readLine());

		System.out.print("Indtast skaleringen af y-akse: ");
		skalering = Double.parseDouble(br.readLine());

		System.out.print("Indtast forskydning langs y-aksen: ");
		forskydning = Double.parseDouble(br.readLine());

		for (double x = xStart; x <= xSlut; x = x + 1) {
			double y = 0.2 * x * x + 0.5 * x + 2;     //Her skrives ligningen

			int antalstjerner = (int) (y * skalering + forskydning);

			int kolonnenr = 0;

			while (kolonnenr < antalstjerner - 1) {
				System.out.print(" ");
				kolonnenr = kolonnenr + 1;
			}
			if (antalstjerner > 0) System.out.print("*");
			System.out.println();
		}
	}
}
