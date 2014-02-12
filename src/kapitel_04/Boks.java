package kapitel_04;
public class Boks
{
	double længde;
	double bredde;
	double højde;

	double volumen()
	{
		double vol;
		vol = længde*bredde*højde;
		return vol; 
	}
}