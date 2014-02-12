package kapitel_05;
import java.awt.Point;
import java.util.ArrayList;
public class InitB extends InitA
{
	ArrayList<Point> l = new ArrayList<Point>(); // p3

	{                                 	      // initialiseringsblok
    l.add(new Point(4,4));           	      // p4 udføres før konstruktøren p5
	}

	public InitB()
	{                                  	      // p5
	  l.add(new Point(5,5));
	}
}