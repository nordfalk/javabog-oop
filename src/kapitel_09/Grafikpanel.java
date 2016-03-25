package kapitel_09;
import java.awt.*;
import javax.swing.*;

public class Grafikpanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		// Herunder referer g til et Graphics-objekt man kan tegne med
		super.paintComponent(g);                // tegn først baggrunden på panelet

		g.drawLine(0,0,50,50);

		g.fillOval(5,10,300,30);
		g.setColor(Color.GREEN);
		g.drawString("Hej grafiske verden!",100,30);

		System.out.println("Der blev tegnet!!");
	}
}