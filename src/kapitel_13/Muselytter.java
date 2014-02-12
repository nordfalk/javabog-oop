package kapitel_13;
import java.awt.*;
import java.awt.event.*;

public class Muselytter implements MouseListener
{
	public void mousePressed(MouseEvent hændelse)	// kræves af MouseListener
	{
		Point trykpunkt = hændelse.getPoint();
		System.out.println("Mus trykket ned i "+trykpunkt);
	}

	public void mouseReleased(MouseEvent hændelse)	// kræves af MouseListener
	{
		Point slippunkt = hændelse.getPoint();
		System.out.println("Mus sluppet i "+slippunkt);
	}

	public void mouseClicked(MouseEvent hændelse)	// kræves af MouseListener
	{
		System.out.println("Mus klikket i "+hændelse.getPoint());
	}

	//--------------------------------------------------------------------
	//  Ubrugte hændelser (skal defineres for at implementere MouseListener)
	//--------------------------------------------------------------------
	public void mouseEntered (MouseEvent event) {}	// kræves af MouseListener
	public void mouseExited (MouseEvent event) {}	// kræves af MouseListener
}