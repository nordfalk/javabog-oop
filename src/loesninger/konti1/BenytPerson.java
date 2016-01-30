//Malene Andersen
package loesninger.konti1;

public class BenytPerson {
	public static void main(String[] arg) {
		Person j = new Person("Jacob", "Nordfalk", 30, new Bil(25000));
		Person k = new Person("Kai", "Lund", 86, new Bil(20000));
		Person l = new Person("Lars", "Holm", 2, null);

		Konto jKonto1 = new Konto(j);
		Konto jKonto2 = new Konto(j);
		j.konti.add(jKonto1);
		j.konti.add(jKonto2);

		Konto kKonto1 = new Konto(k);
		Konto kKonto2 = new Konto(k);
		k.konti.add(kKonto1);
		k.konti.add(kKonto2);

		Konto lKonto1 = new Konto(l);
		l.konti.add(lKonto1);

		/*System.out.println("Vi har oprettet "+j+", "+k+" og "+l);
		 j.præsentation();
		 k.præsentation();
		 l.præsentation();
		 */

		jKonto1.overførsel(100);
		jKonto2.overførsel(5000);
		System.out.println("Jacobs konti: \n" + jKonto1.toString() + "\n" + jKonto2.toString());
		System.out.println("Samlet formue: " + j.formue() + "\n");


		kKonto1.overførsel(200);
		kKonto2.overførsel(3000);
		System.out.println("Kais konti: \n" + kKonto1.toString() + "\n" + kKonto2.toString());
		System.out.println("Samlet formue: " + k.formue() + "\n");


		lKonto1.overførsel(500);
		System.out.println("Lars konti: \n" + lKonto1.toString());
		System.out.println("Samlet formue: " + l.formue() + "\n");

		System.out.println("Jacobs posteringer");
		System.out.println(jKonto1.udskrivPosteringer());
		System.out.println(jKonto2.udskrivPosteringer() + "\n");

		System.out.println("Kais posteringer");
		System.out.println(kKonto1.udskrivPosteringer());
		System.out.println(jKonto2.udskrivPosteringer() + "\n");

		System.out.println("Lars posteringer");
		System.out.println(lKonto1.udskrivPosteringer() + "\n");


		jKonto1.overførsel(-100);
		jKonto2.overførsel(-2500);

		System.out.println("Jacobs konti: \n" + jKonto1.toString() + "\n" + jKonto2.toString());
		System.out.println("Samlet formue: " + j.formue() + "\n");

		System.out.println("Jacobs posteringer");
		System.out.println(jKonto1.udskrivPosteringer());
		System.out.println(jKonto2.udskrivPosteringer() + "\n");


		/*j.hils(k);
		 k.hils(j);
		 l.hils(j);
		 */

	}
}
