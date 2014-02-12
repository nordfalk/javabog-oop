package kapitel_11;
import javax.swing.*;
public class BenytPanelMedBorderLayout
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "PanelMedBorderLayout" ); 
		vindue.add( new PanelMedBorderLayout() );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		vindue.pack();// sætter en rimelig vinduesstørrelse (i stedet for setSize())
		vindue.setVisible(true);
	}
}