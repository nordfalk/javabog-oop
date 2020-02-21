package kapitel_04;

public class Opg_4_4_1__1 {
	static public void main(String[] args) {
		Terning terning1 = new Terning();
		Terning terning2 = new Terning();
		int antalSlag = 1;

		while (terning1.getVærdi() != 6 && terning2.getVærdi() != 6) {
			System.out.println("Antal slag : " + antalSlag + "   Terning 1 : " + terning1.getVærdi() + "   Terning 2 : " + terning2.getVærdi());
			antalSlag++;
			terning1.kast();
			terning2.kast();
		}

		System.out.println("Antal slag : " + antalSlag + "   Terning 1 : " + terning1.getVærdi() + "   Terning 2 : " + terning2.getVærdi());
	}
}
