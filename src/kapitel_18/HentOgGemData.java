package kapitel_18;
import java.util.ArrayList;
public class HentOgGemData
{
	public static void main(String[] arg) throws Exception
	{
		ArrayList<Data> dataliste;
		try {
			dataliste = (ArrayList<Data>) Serialisering.hent("data.ser");
			System.out.println("Læst: "+dataliste);
		} catch (Exception e) {
			dataliste = new ArrayList<Data>();
			System.out.println("Oprettet: "+dataliste);
		}

		Data d = new Data();
		d.a   = (int) (Math.random()*100);
		d.tmp = (int) (Math.random()*100);
		dataliste.add(d);

		System.out.println("Gemt: "+dataliste);
		Serialisering.gem(dataliste,"data.ser");
	}
}