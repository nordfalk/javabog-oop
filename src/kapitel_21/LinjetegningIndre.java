package kapitel_21;
import kapitel_13.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LinjetegningIndre extends JPanel
{
	// Selv private variabler har den indre klasse adgang til
	private Point trykpunkt;
	private Point slippunkt;

	public LinjetegningIndre()
	{
		Linjelytter lytter = new Linjelytter();
		this.addMouseListener(lytter);
	}

	// En indre klasse
	class Linjelytter implements MouseListener
	{
		public void mousePressed (MouseEvent event)
		{
			trykpunkt = event.getPoint();           // sæt variablen i det ydre objekt
		}

		public void mouseReleased (MouseEvent event)
		{
			slippunkt = event.getPoint();
			repaint();                              // kald det ydre objekts metode
		}

		public void mouseClicked (MouseEvent event) {} // kræves af MouseListener
		public void mouseEntered (MouseEvent event) {} // kræves af MouseListener
		public void mouseExited (MouseEvent event) {}  // kræves af MouseListener
	}
	// slut på indre klasse

	// en metode i den ydre klasse
	public void paintComponent (Graphics g)
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