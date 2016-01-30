package loesninger.konti2;

public class BenytPerson {
	public static void main(String[] arg) {
		Person j, k, l;
		j = new Person("Jacob", "Nordfalk", 30);
		k = new Person("Kai", "Lund", 86);
		l = new Person("Lars", "Holm", 2);

		j.nyKonto();
		j.konti.get(0).posteringer.add(new Postering(j.konti.get(0), 100));
		System.out.println("Jacobs ene konto: " + j.konti.get(0).saldo);
		j.nyKonto();
		j.konti.get(1).posteringer.add(new Postering(j.konti.get(1), 700));
		System.out.println("jacobs anden konto: " + j.konti.get(1).saldo);
		Bil jacobsBil = new Bil(j, 92000);
		j.biler.add(jacobsBil);
		System.out.println(jacobsBil.toString());
		System.out.println("Samlet formue for Jacob: " + j.formue());

		k.nyKonto();
		k.konti.get(0).posteringer.add(new Postering(k.konti.get(0), 150));
		System.out.println("Kais ene konto: " + k.konti.get(0).saldo);
		k.nyKonto();
		k.konti.get(1).posteringer.add(new Postering(k.konti.get(1), 500));
		System.out.println("Kais anden konto: " + k.konti.get(1).saldo);
		k.nyKonto();
		k.konti.get(2).posteringer.add(new Postering(k.konti.get(2), 920));
		System.out.println("Kais tredje konto: " + k.konti.get(2).saldo);
		Bil kaisEneBil = new Bil(k, 120000);
		Bil kaisAndenBil = new Bil(k, 65000);
		k.biler.add(kaisEneBil);
		k.biler.add(kaisAndenBil);
		System.out.println(kaisEneBil.toString());
		System.out.println(kaisAndenBil.toString());
		System.out.println("Samlet formue for Kai: " + k.formue());

		l.nyKonto();
		l.konti.get(0).posteringer.add(new Postering(l.konti.get(0), 500));
		wait(1000);
		l.konti.get(0).posteringer.add(new Postering(l.konti.get(0), 150));
		wait(1000);
		l.konti.get(0).posteringer.add(new Postering(l.konti.get(0), 50));
		wait(1000);
		l.konti.get(0).posteringer.add(new Postering(l.konti.get(0), 2000));
		wait(1000);
		l.konti.get(0).posteringer.add(new Postering(l.konti.get(0), 50));
		System.out.println("Lars' konto: " + l.konti.get(0).saldo);
		System.out.println("Samlet formue for Lars: " + l.formue());

		l.konti.get(0).udskrivListe();
	}

	public static void wait(int t) {       //Hvorfor virker denne ikke i main-metoden uden "static"?
		try {
			Thread.sleep(t);
		} catch (InterruptedException e) {
		}
	}
}