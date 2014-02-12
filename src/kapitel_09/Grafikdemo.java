package kapitel_09;
import java.awt.*;
import javax.swing.*;

public class Grafikdemo extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);                // tegn først baggrunden på panelet

		g.drawRoundRect(10,10,80,80,25,25);     // tegn rektangel med runde hjørner

		g.drawArc(110,10,80,80,20,320);         // tegn buestykke

		g.fillArc(210,10,80,80,20,320);         // tegn lagkagestykke (udfyldt)

		Polygon p = new Polygon();              // lav polygon, der viser en pil:
		p.addPoint(0,13);  p.addPoint(45,13);                    // frem
		p.addPoint(45,0);  p.addPoint(60,15); p.addPoint(45,30); // spidsen
		p.addPoint(45,17); p.addPoint(0,17);                     // tilbage

		p.translate(300,10);                    // flyt polygonen
		g.drawPolygon(p);                       // tegn polygonen

		p.translate(0,50);                      // flyt polygonen mere
		g.fillPolygon(p);                       // tegn polygonen udfyldt

		for (int i=0; i<4; i++)                 // tegn forskellige skriftstørrelser
		{
			int størrelse = 10+i*4;
			Font skrifttype = new Font("Serif", Font.ITALIC, størrelse);
			g.setFont(skrifttype);
			g.drawString("Skrift "+størrelse, 400, 15+25*i);
		}

		// Indlæs billede. Forudsætter at "bog.gif" er der, hvor programmet køres.
		// Bemærk: I en applet, skriv i stedet getImage(getCodeBase(), "bog.gif")
		// Bemærk: Billedformatet skal være platformsneutralt, f.eks GIF, JPG, PNG.
		Image billede = Toolkit.getDefaultToolkit().getImage("bog.gif");

		g.drawImage(billede, 110, 100, this);         // tegn billedet

		g.drawImage(billede, 0, 100, 100, 160, this); // tegn billedet skaleret
	}
}