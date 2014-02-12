package kapitel_11;
import javax.swing.*;
public class BenytGrafikpanelMedKomponenter
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "GrafikpanelMedKomponenter" ); 
		vindue.add( new GrafikpanelMedKomponenter() );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		vindue.setSize(350,300);
		vindue.setVisible(true);
	}
}