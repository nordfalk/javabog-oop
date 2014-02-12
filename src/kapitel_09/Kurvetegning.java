package kapitel_09;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Kurvetegning extends JPanel
{
	ArrayList<Color> farver;//felt kendt både i konstruktør og paintComponent
	int forskydning = 50;  // en forskydning i farvevalget (bruges i afsnit 9.4.1)

	public Kurvetegning()  // forbered punkterne i konstruktøren
	{
		farver = new ArrayList<Color>();
		for (int i=0; i<400; i++)
		{
			Color farve = new Color(i%256, (i*2)%256, (i*4)%256);
			farver.add(farve);
		}

		JFrame vindue = new JFrame("Kurvetegning");   // opret et vindue på skærmen
		vindue.add( this );                           // vis dette panel i vinduet
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
		vindue.setSize(400,300);                      // sæt vinduets størrelse
		vindue.setVisible(true);                      // åbn vinduet
	}

	public void paintComponent(Graphics g) // tegn punkterne
	{
		super.paintComponent(g);            // tegn først baggrunden på panelet

		g.drawString("Kurvetegning", forskydning%400, forskydning%300);
		for (int x=0; x<farver.size(); x++)
		{
			int y = 140 - (int) (130*Math.sin(0.05*x));
			int i = (x+forskydning)%400;
			Color farve = farver.get(i);
			g.setColor(farve);
			g.fillRect(x, y, 5, 5);
		}
	}
}