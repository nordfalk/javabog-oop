package kapitel_13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tastetryk extends JPanel implements KeyListener
{
	String tekst = "tast noget - pil op/ned rykker teksten ";
	Point pos = new Point(20,20);

	public Tastetryk()
	{
		addKeyListener(this);
		setFocusable(true);
		requestFocus();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);            // tegn først baggrunden på panelet
		g.drawString(tekst, pos.x, pos.y);
	}

	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_ENTER) tekst = "tekst: ";
		else if (e.getKeyCode() == KeyEvent.VK_UP)   pos.y = pos.y - 10;
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) pos.y = pos.y + 10;
		else tekst = tekst + e.getKeyChar();
		repaint();
	}

	public void keyReleased(KeyEvent e) {} // kræves af KeyListener
	public void keyTyped(KeyEvent e)    {} // kræves af KeyListener
}