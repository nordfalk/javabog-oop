package kapitel_12;
import javax.swing.*;
public class BenytTegnbareObjekter
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "TegnbareObjekter" ); 
		vindue.add( new TegnbareObjekter() );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		vindue.setSize(300,300);
		vindue.setVisible(true);
		while (true) {
			try { Thread.sleep(3000); } catch (Exception e) {}// vent 3 sek.
			vindue.repaint();                                 // gentegn skærm
		}
	}	
}