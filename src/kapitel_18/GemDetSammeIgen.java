package kapitel_18;
import java.util.ArrayList;
import java.io.*;
public class GemDetSammeIgen {
	public static void main(String[] arg) throws Exception {
		ArrayList l;
		try {
			FileInputStream datastrøm = new FileInputStream("venner2.ser");
			ObjectInputStream objektstrøm = new ObjectInputStream(datastrøm);
			l = (ArrayList) objektstrøm.readObject();
			System.out.println("Læst1: "+l);

			l = (ArrayList) objektstrøm.readObject();
			System.out.println("Læst2: "+l);

			objektstrøm.close();
		} catch (Exception e) {
			l = new ArrayList();
			l.add("Jacob");
			System.out.println("Oprettet: "+l);
		}
		l.add("Ven"+l.size());

		FileOutputStream datastrøm = new FileOutputStream("venner2.ser");
		ObjectOutputStream objektstrøm = new ObjectOutputStream(datastrøm);

		objektstrøm.writeObject(l);
		System.out.println("Gemt1: "+l);

		// ændr nu l og serialiser igen
		l.add("EkstraVen"+l.size());
		// l = (ArrayList) l.clone();// løsning1: opret et andet objekt
		// objektstrøm.reset();     // løsn2: nulstil liste af allerede skrevne obj
		objektstrøm.writeObject(l); // ellers bliver den nye tilstand af l ikke gemt
		System.out.println("Gemt2: "+l);
		objektstrøm.close();
	}
}