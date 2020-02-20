package kapitel_03;
import java.util.ArrayList;          // ArrayList skal importeres før den kan bruges

public class BenytArrayList
{
	public static void main(String[] arg)
	{
		ArrayList<String> liste;         // opret liste-variabel
		liste = new ArrayList<String>(); // opret liste-objekt

		liste.add("æh");                 // føj til listen
		liste.add("bæh");
		liste.add("buh");

		System.out.println("Listen har elementerne "+liste.toString());

		liste.add(2, "og");
		System.out.println("Nu har listen "+liste); // .toString() kaldes implicit

		liste.remove(0);
		System.out.println("Nu har listen "+liste+" og størrelsen "+liste.size());
		System.out.println("På plads nummer 1 er: "+liste.get(1));

		for (int i=0; i< liste.size(); i++) {
			String element = liste.get(i);
			System.out.println("Element nummer "+i+" er: "+ element);
		}

		for (String element : liste) {  // gennemløb alle elementerne i listen
			System.out.println("Et element i listen: "+ element);
		}
	}
}