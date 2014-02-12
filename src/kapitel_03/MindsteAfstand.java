package kapitel_03;
import java.awt.Point;
import java.util.ArrayList;

public class MindsteAfstand
{
	public static void main(String[] arg)
	{
		ArrayList<Point> punktliste;    // punkt-liste
		Point origo, p1, p2, p3;
		double minDist = 10000;
		punktliste = new ArrayList<Point>();
		origo = new Point(0,0);
		p1 = new Point(0,65);
		p2 = new Point(50,50);
		p3 = new Point(120,10);
		
		punktliste.add(p1);
		punktliste.add(p2);
		punktliste.add(p3);
		
		for (Point p : punktliste)
		{
			double dist;

			dist = origo.distance(p);
			if (dist<minDist)
			{
				minDist=dist;
			}
		}

		System.out.println("Den mindste afstand mellem punkterne "
			+ punktliste + " og (0,0) er "+minDist);
	}
}