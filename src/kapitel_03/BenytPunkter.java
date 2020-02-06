package kapitel_03;
import java.awt.Point; // Point-klassen skal importeres fra pakken java.awt

public class BenytPunkter
{
	public static void main(String[] arg)
	{
		Point p;
		p = new Point();

		int a;

		a = p.x;

		System.out.println("a: "+a);

		System.out.println("1 x-koordinat: "+p.x);
		System.out.println("1 y-koordinat: "+p.y);

		p.x = 110;
		p.y = 210;
		System.out.println("2 x-koordinat: "+p.x);
		System.out.println("2 y-koordinat: "+p.y);

		p.move(200,300);
		System.out.println("3 x-koordinat: "+p.x);
		System.out.println("3 y-koordinat: "+p.y);

		p.x = p.x + 5;
		System.out.println("4 x- og y-koordinater: "+p.toString()); // se afsnit 3.5.4

		p.translate(-10,20);
		System.out.println("5 x- og y-koordinater: "+p);            // se afsnit 3.5.5

		Point p2 = new Point(0,0);

		double afstand = p.distance(p2);
		System.out.println("afstanden mellem "+p+" og "+p2+" er "+afstand);

		p2 = p; // nu peger p og p2 på det samme objekt!
		System.out.println("afstanden mellem "+p+" og "+p2+" er "+p.distance(p2));

		p.translate(1000, 1000); // p2 peger på det samme objekt så den ændres også
		System.out.println("afstanden mellem "+p+" og "+p2+" er "+p.distance(p2));
	}
}