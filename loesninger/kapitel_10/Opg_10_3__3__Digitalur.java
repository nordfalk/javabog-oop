package kapitel_10;

import java.awt.*;
import java.util.Date;

public class Opg_10_3__3__Digitalur extends Frame {
	public void paint(Graphics g) {
		Date d = new Date();
		String s;

		s = d.toString();
		// Eller:
		// DateFormat df = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		// s = df.format(d);

		g.drawString(s, 30, 50);
		repaint(1000);
	}

	public static void main(String[] arg) {
		Opg_10_3__3__Digitalur vindue = new Opg_10_3__3__Digitalur();   // opret vinduet
		vindue.setSize(350, 100);
		vindue.setVisible(true);
	}
}
