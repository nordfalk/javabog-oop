package kapitel_04;

public class Opg_4_5_2__1 {
	static public void main(String[] args) {

		Raflebaeger bæger1 = new Raflebaeger(4);
		int antalSlag = 0;
		while (bæger1.antalDerViser(6) != 3 && bæger1.antalDerViser(6) != 4) {
			antalSlag++;
			bæger1.ryst();
			System.out.println("Slag nr. " + antalSlag);
			System.out.println(bæger1.toString());
		}
		System.out.println("Slag nr. " + antalSlag);
	}
}
