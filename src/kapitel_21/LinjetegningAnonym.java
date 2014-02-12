package kapitel_21;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LinjetegningAnonym extends JPanel
{	
	private Point trykpunkt;
	private Point slippunkt;

	public LinjetegningAnonym()
	{		
		this.addMouseListener(
			new MouseListener() 
			{
				public void mousePressed (MouseEvent event)
				{
					trykpunkt = event.getPoint();
				}

				public void mouseReleased (MouseEvent event)
				{
					slippunkt = event.getPoint();
					repaint();	
				}

				public void mouseClicked (MouseEvent event) {}
				public void mouseEntered (MouseEvent event) {}
				public void mouseExited (MouseEvent event) {}
			} // slut på anonym klasse
		); // slut på kald til addMouseListener()

		System.out.println("Anonymt lytter-objekt oprettet");		
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