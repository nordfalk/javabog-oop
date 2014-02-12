package kapitel_02;
//
// Skatteberegning for 2014
//
public class Skatteberegning 
{
	public static void main(String[] arg) 
	{
		double indkomst = 300000;
		double arbejdsmarkedsbidrag, bundskat;

		arbejdsmarkedsbidrag = indkomst * 0.08;
		indkomst = indkomst - arbejdsmarkedsbidrag;
		bundskat = (indkomst - 42800) * 0.0683;
		System.out.println("Arbejdsmarkedsbidrag: " + arbejdsmarkedsbidrag);
		System.out.println("Personlig indkomst: " + indkomst);
		System.out.println("Bundskat: " + bundskat);
	}
}