package kapitel_02;

public class Opg_2_10_2__1 {
	public static void main(String[] args) {
		for (double x = 0; x <= 20; x = x + 1) {

			int antalstjerner = (int) Math.sqrt(x);

			int kolonnenr = 0;

			while (kolonnenr < antalstjerner) {
				System.out.print("*");
				kolonnenr = kolonnenr + 1;
			}
			System.out.println();

		}
	}
}
