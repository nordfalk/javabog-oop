package kapitel_18;
import java.util.ArrayList;
public class HentOgGemData
{
	public static void main(String[] arg) throws Exception
	{
		ArrayList<Data> l;
		try {
			l = (ArrayList<Data>) Serialisering.hent("data.ser");
			System.out.println("Læst: "+l);
		} catch (Exception e) {
			l = new ArrayList<Data>();
			System.out.println("Oprettet: "+l);
		}

		Data d = new Data();
		d.a   = (int) (Math.random()*100);
		d.tmp = (int) (Math.random()*100);
		l.add(d);

		System.out.println("Gemt: "+l);
		Serialisering.gem(l,"data.ser");
	}
}