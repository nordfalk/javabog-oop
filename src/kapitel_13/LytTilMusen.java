package kapitel_13;
import javax.swing.*;
public class LytTilMusen extends JPanel
{
	public LytTilMusen()
	{
		Muselytter lytter = new Muselytter();
		this.addMouseListener(lytter);	// this er panelet selv
	}
}