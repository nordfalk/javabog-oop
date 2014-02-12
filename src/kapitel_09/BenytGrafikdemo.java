package kapitel_09;
import javax.swing.*;

public class BenytGrafikdemo
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame("Grafikdemo");     // opret et vindue på skærmen
		vindue.add( new Grafikdemo() );               // vis panelet i vinduet
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
		vindue.setSize(500,200);                      // sæt vinduets størrelse
		vindue.setVisible(true);                      // åbn vinduet
	}
}