package kapitel_02;

public class Opg_2_5_5__3 {
	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++) {
			System.out.println(x + "-tabellen:");

			for (int y = 1; y <= 10; y++)
				System.out.println(x + " * " + y + " er " + x * y);

			System.out.println();
		}
	}
}
