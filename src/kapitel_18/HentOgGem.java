package kapitel_18;
import java.util.ArrayList;
public class HentOgGem
{
	public static void main(String[] arg) throws Exception
	{
		ArrayList<String> l;
		try {
			l = (ArrayList<String>) Serialisering.hent("venner.ser");
			System.out.println("Læst: "+l);
		} catch (Exception e) {
			l = new ArrayList();
			l.add("Jacob");
			l.add("Brian");
			l.add("Preben");
			System.out.println("Oprettet: "+l);
		}

		l.add("Ven"+l.size());
		Serialisering.gem(l,"venner.ser");
		System.out.println("Gemt: "+l);
	}
}