package kapitel_04;
import java.util.ArrayList;
public class Boks2medThis
{
	private double længde;
	private double bredde;
	private double højde;

	public void sætMål(double længde, double bredde, double højde)
	{
		if (længde>0 && bredde>0 && højde>0) 
		{
			this.længde = længde;
			this.bredde = bredde;
			this.højde  = højde;
		} else {
 			System.out.println("Ugyldige mål.");
			this.længde = 10.0;
			this.bredde = 10.0;
			this.højde  = 10.0;
		}
	}

	public double volumen()
	{
		return bredde*højde*længde; 
	}

	public void føjTilListe(ArrayList l)
	{
		l.add(this);
	}
}