package kapitel_14;
public class Boks2KasterException
{
	private double længde;
	private double bredde;
	private double højde;

	public void sætMål(double lgd, double b, double h)
	{
		if (lgd<=0||b<=0||h<=0) throw new IllegalArgumentException("Ugyldige mål.");
		længde = lgd;
		bredde = b;
		højde  = h;
	}

	public double volumen()
	{
		return længde*bredde*højde; 
	}
}