package kapitel_13;
import java.awt.event.*;
public class Linjelytter2 extends MouseAdapter
{
	public Linjetegning panelet;

	public void mousePressed(MouseEvent hændelse)
	{
		panelet.trykpunkt = hændelse.getPoint();
	}

	public void mouseReleased(MouseEvent hændelse)
	{
		panelet.slippunkt = hændelse.getPoint();
		panelet.repaint();
	}
}