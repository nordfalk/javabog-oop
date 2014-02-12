package kapitel_05;
import kapitel_04.*;
public class SnydeMedBaeger
{
	public static void main(String[] arg)
	{
		Raflebaeger bæger = new Raflebaeger(0); // opret et bæger med nul terninger

		Terning t = new Terning();
		bæger.tilføjTerning(t);   // føj en almindelig terning til bægeret

		FalskTerning2 ft = new FalskTerning2();
		ft.sætSnydeværdi(6);
		bæger.tilføjTerning(ft); // parameteren er et objekt af typen Terning,
		                         // og dermed også af typen FalskTerning2.

		ft = new FalskTerning2();
		ft.snydeværdi=6;
		t=ft;               // t bruges som mellemvariabel for sjov.
		bæger.tilføjTerning(t);

		for (int i=1; i<10; i++)
		{
			bæger.ryst();
		}
	}
}