package kapitel_21;
import javax.swing.*;
public class BenytLinjetegningAnonym
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "LinjetegningAnonym" ); 
		vindue.add( new LinjetegningAnonym() );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		vindue.setSize(500,150);
		vindue.setVisible(true);
	}
}