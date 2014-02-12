package kapitel_02;
//
// Beregning af rumfang for en cylinder
//
public class Cylinderberegning
{
	public static void main(String[] arg) 
	{
		double radius;
		radius = 5.0;

		double højde = 12.5;

		//beregn rumfang
		double volumen = radius * radius * højde * 3.14159;

		System.out.println("Cylinderens højde: " + højde);
		System.out.println("Cylinderens radius: " + radius);
		System.out.println("Cylinderens volumen: " + volumen);
	}
}