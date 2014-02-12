package kapitel_09;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class AktivVisning extends JFrame
{	
	Graphics2D g2;
	AffineTransform orgTrans;
	GeneralPath fig = new Java2DDemo().fig;      // stjæl 'smiley' fra andet eks.
	double[][] koord = new double[50][6];        // koordinater på figurer

	void init() {	
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setIgnoreRepaint(true);      // system skal IKKE kalde paintComponent()
		this.setVisible(true);

		g2 = (Graphics2D) this.getGraphics();     // aktiv visning: gem Graphics...
		orgTrans = g2.getTransform();             // ... og brug det som du lyster!

		for (int i=0; i<koord.length; i++)        // sæt alle stjerne-koordinater
		  for (int j=0; j<koord[i].length; j++)   // til noget tilfældigt: 0=tid,
		    koord[i][j] = Math.random();          // 1=x, 2=y, 3,4=skala, 5=rotation
	}

	// public void paintComponent() {}           // definer IKKE - aktiv visning!

	void tegn() {                 // venter lidt, tegner og opdaterer koordinater
		try { Thread.sleep(10); } catch (InterruptedException ex) {} // vent lidt
		g2.setTransform( orgTrans );               // genskab orig. transformation
		g2.setColor(Color.WHITE);                  // rens skærmen selv
		Dimension d = getSize();
		g2.fillRect(0, 0, d.width, d.height);
		g2.setColor(Color.BLACK);

		for (int n=0; n<koord.length; n++) {
			double k[] = koord[n];
			double t = k[0] = (k[0] + 0.005) % 1;    // opdater 'tid' k[0] og put i t
			g2.setTransform( orgTrans );             // genskab orig. transformation
			g2.translate( (t*(k[1]-0.5)+0.5)*d.width, (t*(k[2]-0.5)+0.5)*d.height );
			g2.scale(t*k[3], t*(k[4]+t-1));          // flyt, skaler og rotér
			g2.rotate(t*50*(k[5]-0.5));
			g2.translate( -fig.getBounds().width/2, -fig.getBounds().height/2 );
			g2.draw(fig);
		}
	}

	public static void main(String[] args)
	{
		AktivVisning vindue = new AktivVisning();
		vindue.setSize(400,300);
		vindue.init();

		for (int i=0; i<10000; i++) 
			vindue.tegn();
	}
}