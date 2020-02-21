package kapitel_02;

public class Opg_2_10_1__1 {
	public static void main(String[] args) {
		for (int x = 25; x <= 75; x++) {
			double beløb = (x - 25) * 1.94;
			System.out.println("For " + x + " km er fradraget " + beløb + " kr.");
		}
	}
}
