package kapitel_04;


public class Opg_4_3_2__1 {
	static class Boks3ny {
		private double længde;
		private double bredde;
		private double højde;
		private double massefylde;

		public Boks3ny() {
			System.out.println("Standardboks oprettes");
			længde = 10;
			bredde = 10;
			højde = 10;
			massefylde = 2;
		}

		public Boks3ny(double l, double b, double h) {
			if (l <= 0 || b <= 0 || h <= 0) {
				System.out.println("Ugyldige mål. Standardboks oprettes");
				længde = 10;
				bredde = 10;
				højde = 10;
				massefylde = 2;
			} else {
				længde = l;
				bredde = b;
				højde = h;
				massefylde = 2;
			}
		}

		public Boks3ny(double l, double b, double h, double m) {
			if (l <= 0 || b <= 0 || h <= 0 || m <= 0) {
				System.out.println("Ugyldige mål. Standardboks oprettes");
				længde = 10;
				bredde = 10;
				højde = 10;
				massefylde = 2;
			} else {
				længde = l;
				bredde = b;
				højde = h;
				massefylde = m;
			}
		}

		public double volumen() {
			return længde * bredde * højde;
		}

		public double vægt() {
			return volumen() * massefylde;
		}

		public void setMassefylde(double m) {
			massefylde = m;
		}
	}

	static public void main(String[] args) {
		Boks3ny boks1 = new Boks3ny();
		Boks3ny boks2 = new Boks3ny(-2.1, 0, 2);
		Boks3ny boks3 = new Boks3ny(2, 4, 3);
		Boks3ny boks4 = new Boks3ny(2, 3, 4, 5);

		System.out.println("boks1 har rumfanget : " + boks1.volumen());
		System.out.println("boks2 har rumfanget : " + boks2.volumen());
		System.out.println("boks3 har rumfanget : " + boks3.volumen());
		System.out.println("boks4 har rumfanget : " + boks4.volumen());

		System.out.println("boks1 vejer : " + boks1.vægt());
		System.out.println("boks2 vejer : " + boks2.vægt());
		System.out.println("boks3 vejer : " + boks3.vægt());
		System.out.println("boks4 vejer : " + boks4.vægt());

		boks3.setMassefylde(2.5);

		System.out.println("boks3 vejer nu : " + boks3.vægt());
	}
}
