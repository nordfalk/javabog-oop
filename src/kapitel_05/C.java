package kapitel_05;
import java.awt.Point;
import java.util.ArrayList;
public class C
{
	ArrayList<Point> l;

	public C(int x, int y)
	{
		l = new ArrayList<Point>();    // opret en liste af punkter
		l.add(new Point(x,y));         // tilføj punkt med koordinater x,y
	}

	public C()
	{
		this(2,2); // kalder den anden konstruktør så listen oprettes med punkt 2,2
	}
}