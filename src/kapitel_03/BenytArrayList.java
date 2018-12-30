package kapitel_03;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JButton;

public class BenytArrayList
{
	public static void main(String[] arg)
	{
		ArrayList<String> liste;         // opret liste-variabel
		liste = new ArrayList<String>();

		new Thread( () -> System.out.println("") ).start();

		new JButton().addActionListener((e) -> {
			System.out.println("Hurra");
		}
		);

		liste.add("æh");                 // føj til listen
		liste.add("bæh");
		liste.add("buh");

		System.out.println("Listen har elementerne "+liste.toString());

		liste.add(2,"og");
		System.out.println("Nu har listen "+liste); // .toString() kaldes implicit

		liste.remove(0);
		System.out.println("Nu har listen "+liste+" og størrelsen "+liste.size());
		System.out.println("På plads nummer 1 er: "+liste.get(1));

		for (String element : liste) {  // gennemløb alle elementerne i listen
			System.out.println("Et element i listen: "+ element);
		}
	}
}