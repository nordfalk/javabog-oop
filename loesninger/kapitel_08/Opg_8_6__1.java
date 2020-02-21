package kapitel_08;

import kapitel_04.Raflebaeger;

public class Opg_8_6__1 {
	public static void main(String[] args) {
		Raflebaeger bæger = new Raflebaeger(6);

		int[] hyp = new int[37]; // indgangene 6 til 36 bruges.

		for (int antalSlag = 0; antalSlag < 100; antalSlag++) {
			bæger.ryst();
			hyp[bæger.sum()]++;
		}

		for (int v = 6; v <= 36; v++)
			System.out.println("Antal slag med " + v + " øjne : " + hyp[v]);
	}
}
