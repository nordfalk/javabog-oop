package kapitel_21;
import javax.swing.*;
public class BenytLinjetegningIndre
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "LinjetegningIndre" ); 
		vindue.add( new LinjetegningIndre() );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		vindue.setSize(500,150);
		vindue.setVisible(true);
	}
}