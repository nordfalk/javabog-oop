package kapitel_11;
import javax.swing.*;
public class BenytOverblikOverKomponenter
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "OverblikOverKomponenter" ); 
		vindue.add( new OverblikOverKomponenter() );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		vindue.setSize(500,150);
		vindue.setVisible(true);
	}
}