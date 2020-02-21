package kapitel_05;

import kapitel_04.Terning;

public class Opg_5_1_4__1 {
	static class LudoTerning extends Terning {
		public String toString() {
			int værdi = getVærdi();
			if (værdi == 3) return "*";
			if (værdi == 4) return "Globus";
			String svar = "" + værdi;
			return svar;
		}
	}


	public static void main(String[] args) {
		LudoTerning lt = new LudoTerning();
		for (int i = 0; i < 10; i++) {
			System.out.println("" + lt);
			lt.kast();
		}
	}
}
