package kapitel_12;
import kapitel_04.*;
import java.awt.*;
public class GrafiskRaflebaeger extends Raflebaeger implements Tegnbar
{
	public GrafiskRaflebaeger()
	{
		super(0);
	}

	@Override
	public void sætPosition(int x, int y)
	{
		// tom metodekrop
	}

	@Override
	public void tegn(Graphics g)
	{
		g.drawOval(180,160,90,54);
		g.drawLine(250,255,270,190);
		g.drawLine(200,255,180,190);
		g.drawArc(200,240,50,30,180,180);
    g.drawString("sum: "+sum(), 200, 200);
	}
}