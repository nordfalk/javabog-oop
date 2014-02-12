package kapitel_07;
import java.awt.Point;
public class Parametervariabler
{
	public static void flyt1(Point p, int dx, int dy)
	{
		p.x = p.x+dx;	// OK, vi ændrer på kalderens objekt
		p.y = p.y+dy;
	}

	public static void flyt2(Point p, int dx, int dy)
	{
		// hmm... vi smider kalderens objekt væk... men det opdager han ikke!
		p = new Point(p.x+dx, p.y+dy);
	}

	public static void main(String[] arg)
	{
		Point p1 = new Point(10,10);
		flyt1(p1,13,14);
		System.out.println("Nu er p1="+p1);

		Point p2 = new Point(10,10);
		flyt2(p2,13,14);
		System.out.println("Nu er p2="+p2);
	}
}