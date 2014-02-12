package kapitel_20;
import java.util.*;

public class BenytDatabaseforbindelse
{
	public static void main(String[] arg)
	{
		try {
			Databaseforbindelse dbf = new Databaseforbindelse();

			dbf.opretTestdata(); // fjern hvis tabellen allerede findes
			ArrayList<Kunde> l = dbf.hentAlle();
			System.out.println("Alle data: "+l);
			dbf.sletAlleData();

			dbf.indsæt( new Kunde("Kurt",1000) );
			System.out.println("Alle data nu: "+ dbf.hentAlle());

		} catch(Exception e) {
			System.out.println("Problem med database: "+e);
			e.printStackTrace();
		}
	}
}