package kapitel_10;
import java.awt.*;
import javax.swing.*;

public class MinApplet extends JApplet
{
	public void paint(Graphics g)
	{
		// Herunder referer g til et Graphics-objekt man kan tegne med

		super.paint(g);    // tegn først baggrunden (og evt komponenter)

		g.drawLine(0,0,50,50);

		g.fillOval(5,10,300,30);

		g.setColor(Color.GREEN);

		g.drawString("Hej grafiske verden!",100,30);
	}
}