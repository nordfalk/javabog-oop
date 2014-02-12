package kapitel_13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Kruseduller extends JPanel
                         implements MouseListener, MouseMotionListener
{
	public Kruseduller()
	{
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	Point punkt;

	public void mousePressed(MouseEvent hændelse) // kræves af MouseListener
	{
		punkt = hændelse.getPoint();
	}

	public void mouseDragged(MouseEvent hændelse) // kræves af MouseMotionListener
	{
		Point gammeltPunkt = punkt;
		punkt =	 hændelse.getPoint();
		Graphics g = getGraphics();
		g.drawLine(gammeltPunkt.x, gammeltPunkt.y, punkt.x, punkt.y);
	}

	public void mouseReleased (MouseEvent hændelse){} // kræves af MouseListener
	public void mouseClicked (MouseEvent event) {}    // kræves af MouseListener
	public void mouseEntered (MouseEvent event) {}    // kræves af MouseListener
	public void mouseExited (MouseEvent event) {}     // kræves af MouseListener
	public void mouseMoved (MouseEvent hændelse){} //kræves af MouseMotionListener
}