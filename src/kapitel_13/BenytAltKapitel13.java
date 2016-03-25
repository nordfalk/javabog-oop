package kapitel_13;
import javax.swing.*;
public class BenytAltKapitel13
{
	public static void main(String[] arg)
	{
		JTabbedPane faneblade = new JTabbedPane();
		faneblade.add("1 LytTilMusen", new LytTilMusen());
		faneblade.add("2 Linjetegning", new Linjetegning());
		faneblade.add("3 Linjetegning2", new Linjetegning2());
		faneblade.add("4 Kruseduller", new Kruseduller());
		faneblade.add("5 LytTilKnap", new LytTilKnap());
		faneblade.add("6 Tastetryk", new Tastetryk());
		faneblade.setRequestFocusEnabled(false);

		JFrame vindue = new JFrame("BenytAltKapitel13");
		vindue.add( faneblade );
		vindue.addWindowListener(new LukProgram()); // reagér på luk
		vindue.pack();                  // lad vinduet selv bestemme sin størrelse
		vindue.setVisible(true);                                  // åbn vinduet
	}
}