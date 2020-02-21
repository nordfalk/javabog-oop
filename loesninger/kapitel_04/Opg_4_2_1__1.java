package kapitel_04;

class Boks2ny {
	private double længde;
	private double bredde;
	private double højde;
	private double massefylde;

	public void sætMål(double lgd, double b, double h) {
		if (lgd > 0 && b > 0 && h > 0) {
			længde = lgd;
			bredde = b;
			højde = h;
		} else {
			System.out.println("Ugyldige mål. Bruger standardmål.");
			længde = 10.0;
			bredde = 10.0;
			højde = 10.0;
		}
	}

	public void sætMassefylde(double m) {
		if (m > 0) {
			massefylde = m;
		} else {
			System.out.println("Ugyldig massefylde. Bruger standard massefylde.");
			massefylde = 1;
		}
	}

	public double volumen() {
		return længde * bredde * højde;
	}

	public double vægt() {
		return volumen() * massefylde;
	}
}


public class Opg_4_2_1__1 {
	static public void main(String[] args) {
		Boks2ny boks1 = new Boks2ny();
		Boks2ny boks2 = new Boks2ny();
		boks2.sætMål(-2.1, 0, 2);
		boks2.sætMassefylde(4);
		Boks2ny boks3 = new Boks2ny();
		boks3.sætMål(2, 4, 3);
		boks3.sætMassefylde(4);
		Boks2ny boks4 = new Boks2ny();
		boks4.sætMål(2, 3, 4);
		boks4.sætMassefylde(7);

		System.out.println("boks1 har rumfanget : " + boks1.volumen());
		System.out.println("boks2 har rumfanget : " + boks2.volumen());
		System.out.println("boks3 har rumfanget : " + boks3.volumen());
		System.out.println("boks4 har rumfanget : " + boks4.volumen());

		System.out.println("boks1 vejer : " + boks1.vægt());
		System.out.println("boks2 vejer : " + boks2.vægt());
		System.out.println("boks3 vejer : " + boks3.vægt());
		System.out.println("boks4 vejer : " + boks4.vægt());

		boks3.sætMassefylde(2.5);

		System.out.println("boks3 vejer nu : " + boks3.vægt());
	}
}
