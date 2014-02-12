package kapitel_07;
import java.awt.*;
import javax.swing.*;

public class Fraktaltrae extends JPanel
{
	/**
	 * Tegner et fraktalt træ. Hver gren er i sig selv et træ.
	 * @param x   x-koordinaten hvor træets rod skal tegnes
	 * @param y   y-koordinaten hvor træets rod skal tegnes
	 * @param dx  x-forskydning fra rod til træets første forgrening
	 * @param dy  y-forskydning fra rod til træets første forgrening
	 * @param str træets størrelse
	 * @param g   Graphics-objektet
	 */
	public void tegnGren(Graphics g, int x, int y, int dx, int dy, int str)
	{
		if (str < 1) return; // vi vil ikke tegne forsvindende små grene
		
		g.drawLine(x, y, x+dx, y+dy);                 // tegn stammen

		tegnGren(g, x+dx, y+dy,-str/2, str/2, str/2); // tegn gren til venstre
		tegnGren(g, x+dx, y+dy, str/10,str/5, str/3); // lille gren lidt til højre
		tegnGren(g, x+dx, y+dy, str/2, str/2, str/2); // tegn gren til højre
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		tegnGren(g,410,30,0,0,400);
	}

	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame("Fraktaltrae");
		vindue.add( new Fraktaltrae() );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		vindue.setSize(850, 450);
		vindue.setVisible(true);
	}
}