package kapitel_11;
import javax.swing.*;
public class BenytPanelMedGridBagLayout
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "PanelMedGridBagLayout" ); 
		vindue.add( new PanelMedGridBagLayout() );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		vindue.pack();
		vindue.setVisible(true);
	}
}