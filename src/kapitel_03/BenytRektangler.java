package kapitel_03;
import java.awt.*;

public class BenytRektangler
{
	public static void main(String[] arg)
	{
		Point p, p2;
		Rectangle r;

		p = new Point();
		p2 = new Point(6,8);
		r = new Rectangle(1,1,10,10);

		boolean inde;
		inde = r.contains(p);
		if (inde==true)
		{
				System.out.println("p er inde i r");
		}

		if (r.contains(p2))
		{
				System.out.println("p2 er inde i r");
		}
	}
}