package kapitel_13;
import java.awt.event.*;

public class Linjelytter implements MouseListener
{
	public Linjetegning panelet;                 // Reference til panelet

	public void mousePressed(MouseEvent hændelse)  // kræves af MouseListener
	{
		panelet.trykpunkt = hændelse.getPoint();
	}

	public void mouseReleased(MouseEvent hændelse) // kræves af MouseListener
	{
		panelet.slippunkt = hændelse.getPoint();
		panelet.repaint(); // Gentegn panelet lige om lidt.
	}

	//--------------------------------------------------------------------
	//  Ubrugte hændelser (skal defineres for at implementere interfacet)
	//--------------------------------------------------------------------
	public void mouseClicked(MouseEvent event) {}  // kræves af MouseListener
	public void mouseEntered (MouseEvent event) {} // kræves af MouseListener
	public void mouseExited (MouseEvent event) {}  // kræves af MouseListener
}