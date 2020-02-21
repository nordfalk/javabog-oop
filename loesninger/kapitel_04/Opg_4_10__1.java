package kapitel_04;

public class Opg_4_10__1 {
	static class Bil {
		public int pris;
		public String farve;
		public String mærke;
		public int kilometer;

		public Bil(String mærket, String farven, int kilometerne, int prisen) {
			pris = prisen;
			farve = farven;
			mærke = mærket;
			kilometer = kilometerne;
		}

		public int pris() {
			return pris;
		}

		public void kør(int km) {
			pris = pris - km / 2;
		}

		public String toString() {
			return "mærke:" + mærke + " farve:" + farve + " kilometer:" + kilometer + " pris:" + pris;
		}


		public void vis() {
			System.out.println("Mærke : " + mærke);
			System.out.println("Farve : " + farve);
			System.out.println("Pris : " + pris);
			System.out.println("Kilometer : " + kilometer);
		}
	}

	public static void main(String[] args) {
		Bil b;
		b = new Bil("Volvo", "Blå", 20000, 200000);

		b.vis();

		System.out.println("Bilen " + b + " kører 500 kilometer.");
		b.kør(500);
		System.out.println("Den er nu kun " + b.pris() + " kroner værd.");
		b.vis();
	}
}
