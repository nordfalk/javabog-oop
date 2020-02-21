package kapitel_14;

/*
 1. Flyt try og catch i SumMedTastatur2 sådan, at programmet smider den aktuelle sum væk og prøver
 igen, men uden at spørge brugeren.
 */
public class Opg_14_7__1__SumMedTastatur2 {
	public static void main(String arg[]) {
		Tastatur t = new Tastatur();
		boolean stop = false;

		while (!stop) {
			System.out.print("Hvor mange tal vil du lægge sammen? ");
			try {
				double antalTal = t.læsTal();
				double sum = 0;

				for (int i = 0; i < antalTal; i = i + 1) {
					System.out.print("Indtast tal: ");
					sum = sum + t.læsTal();
				}
				System.out.println("Summen er: " + sum);
				System.out.print("Vil du prøve igen? (j/n)");
				if ("n".equals(t.læsLinje())) stop = true;
			} catch (Exception u) {
				System.out.println("Indtastningsfejl - " + u);
			}
		}
	}
}
