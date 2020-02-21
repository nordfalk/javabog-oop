package kapitel_14;

/*
 3. Ret programmet, så det også tæller antallet af gange, en sum blev korrekt afsluttet.
 */
public class Opg_14_7__3__SumMedTastatur2 {
	public static void main(String arg[]) {
		Tastatur t = new Tastatur();
		boolean stop = false;
		int påbegyndtSum = 0;
		int korrektAfsluttet = 0;

		while (!stop) {
			System.out.print("Hvor mange tal vil du lægge sammen? ");
			try {
				double antalTal = t.læsTal();
				double sum = 0;

				påbegyndtSum++;

				for (int i = 0; i < antalTal; i = i + 1) {
					System.out.print("Indtast tal: ");
					sum = sum + t.læsTal();
				}
				System.out.println("Summen er: " + sum);
				korrektAfsluttet++;
				System.out.print("Vil du prøve igen? (j/n)");
				if ("n".equals(t.læsLinje())) stop = true;
			} catch (Exception u) {
				System.out.println("Indtastningsfejl - " + u);
			}
		}
		System.out.println("Antal gange en sum blev påbegyndt: " + påbegyndtSum);
		System.out.println("Antal gange en sum blev afsluttet: " + korrektAfsluttet);
	}
}
