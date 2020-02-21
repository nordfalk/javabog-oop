package kapitel_02;

public class Opg_2_10_1__3 {
	public static void main(String[] args) {
		for (int x = 10; x <= 150; x = x + 10) {
			double beløb = 0;

			if (x > 120) beløb = (x - 120) * 0.97 + (120 - 25) * 1.94;
			else if (x > 25) beløb = (x - 25) * 1.94;

			System.out.println("For " + x + " km er fradraget " + beløb + " kr.");
		}
	}
}
