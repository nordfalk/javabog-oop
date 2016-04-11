package kapitel_11_veksle;
import kapitel_09.*;
import javax.swing.JFrame;

public class BenytGrafikpanel
{
	public static void main(String[] arg)
	{
		/*
		VekslePanel panel = new VekslePanel();        // opret panelet

		JFrame vindue = new JFrame("Grafikpanel");    // opret et vindue på skærmen
		vindue.add( panel );                          // vis panelet i vinduet
				*/

		VeksleVindue vindue = new VeksleVindue();    // opret et vindue på skærmen

		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
		vindue.pack();
		vindue.setVisible(true);                      // åbn vinduet
    
    System.out.println("Vinduet blev åbnet");
	}
}