package kapitel_11_demo;
import kapitel_09.*;
import javax.swing.JFrame;

public class BenytMitJPanel
{
	public static void main(String[] arg)
	{
		MitJPanel panel = new MitJPanel();        // opret panelet

		JFrame vindue = new JFrame("Mit flotte panel");    // opret et vindue på skærmen
		vindue.add( panel );                          // vis panelet i vinduet

		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
		vindue.pack();                       // sæt vinduets størrelse
		vindue.setVisible(true);                      // åbn vinduet
	}
}