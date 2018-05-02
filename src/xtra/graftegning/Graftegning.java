package xtra.graftegning;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Graftegning extends JPanel
{
	Graf graf = new Graf();
	ArrayList<Graf> graf2 = new ArrayList<Graf>();
	Skærmkoordinattranformation skærmkoordinattranformation = new Skærmkoordinattranformation();


	public void paintComponent(Graphics g)
	{
		// Herunder referer g til et Graphics-objekt man kan tegne med
		super.paintComponent(g);                // tegn først baggrunden på panelet

		g.drawLine(0,0,50,50);

		g.fillOval(5,10,300,30);
		g.setColor(Color.GREEN);
		g.drawString("Hej grafiske verden!",100,30);

		g.setColor(Color.BLACK);

		int forrigeSx = -1;
		int forrigeSy = -1;
		for (double x=0; x<25; x=x+.5) {
			double y = graf.getYværdi(x);
			int sx = skærmkoordinattranformation.tilSkærmX(x);
			int sy = skærmkoordinattranformation.tilSkærmY(y);
			if (forrigeSx != -1) {
				g.drawLine(forrigeSx, forrigeSy, sx, sy);
			}
			System.out.println(" "+sx+"  "+ sy);
			forrigeSx = sx;
			forrigeSy = sy;

		}

		System.out.println("Der blev tegnet!!");
	}


	public static void main(String[] arg) throws InterruptedException
	{
		Graftegning panel = new Graftegning();
		JFrame vindue = new JFrame("Grafikpanel");    // opret et vindue på skærmen
		vindue.add( panel );                          // vis panelet i vinduet

		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
		vindue.setSize(350,270);                       // sæt vinduets størrelse
		vindue.setVisible(true);                      // åbn vinduet
    //panel.requestFocus();

    System.out.println("Vinduet blev åbnet");
/*
    for (int i=0; i<10000; i++) {
      panel.minBombeX = i/10;
      panel.repaint();
      Thread.sleep(50);
      System.out.println("i="+i);

    }
*/
	}

}