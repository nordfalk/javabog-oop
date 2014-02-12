package kapitel_13;
import java.awt.*;
import javax.swing.*;

public class Linjetegning extends JPanel
{
	public Point trykpunkt;
	public Point slippunkt;

	public Linjetegning()
	{
		Linjelytter lytter = new Linjelytter();
		lytter.panelet = this; // initialiserer lytterens reference til panelet
		this.addMouseListener(lytter);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);            // tegn først baggrunden på panelet
		g.drawString("1:"+trykpunkt+"  2:"+slippunkt,10,10);
		if (trykpunkt != null && slippunkt != null)
		{
			g.setColor(Color.BLUE);
			g.drawLine(trykpunkt.x, trykpunkt.y, slippunkt.x, slippunkt.y);
		}
	}
}