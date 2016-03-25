package kapitel_11_struktur_i_en_gui;
import javax.swing.JFrame;

public class BenytMangePaneler
{
	public static void main(String[] arg)
	{
//		Grafikpanel panel = new Grafikpanel();        // opret panelet
//		JacobPanel panel = new JacobPanel();        // opret panelet
		MangePaneler panel = new MangePaneler();        // opret panelet

		JFrame vindue = new JFrame("Grafikpanel");    // opret et vindue på skærmen
		vindue.add( panel );                          // vis panelet i vinduet

		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
		vindue.setSize(700,370);                      // sæt vinduets størrelse
		vindue.setVisible(true);                      // åbn vinduet
	}
}