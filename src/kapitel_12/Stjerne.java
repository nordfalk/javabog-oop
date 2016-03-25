package kapitel_12;
import java.awt.*;
public class Stjerne implements Tegnbar
{
	private int posX, posY;

	public void sætPosition(int x, int y)   // kræves af interfacet Tegnbar
	{
		posX = x;
		posY = y;
	}

	public void tegn(Graphics g)            // kræves af interfacet Tegnbar
	{
		g.drawString("* STJERNE *",posX,posY);
	}
}