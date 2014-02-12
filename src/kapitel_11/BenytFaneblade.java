package kapitel_11;
import javax.swing.*;
public class BenytFaneblade
{
	public static void main(String[] arg)
	{
		JTabbedPane faneblade = new JTabbedPane();

		faneblade.add("GrafikpanelMedKomponenter", new GrafikpanelMedKomponenter());
		faneblade.add("OverblikOverKomponenter", new OverblikOverKomponenter());
		faneblade.add("PanelMedBorderLayout", new PanelMedBorderLayout());
		faneblade.add("PanelMedGridBagLayout", new PanelMedGridBagLayout());

		JFrame vindue = new JFrame("Faneblade");
		vindue.add( faneblade );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
		vindue.pack();                  // lad vinduet selv bestemme sin størrelse
		vindue.setVisible(true);                                  // åbn vinduet

	}
}