package kapitel_21;

import kapitel_12.GrafiskRaflebaeger;
import kapitel_12.Tegnbar;

import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;

/**
 * 1. Tag TegnbareObjekter.java fra kapitel 11 og lav (i init()-metoden) fem forskellige objekter, der
 * implementerer Tegnbar-interfacet (brug anonyme klasser). De fem objekter skal have forskellig
 * måde at reagere på tegn() og sætPosition().
 */
public class Opg_21_8__1__Tegnbare extends Applet {
	ArrayList tegnbare = new ArrayList();
	GrafiskRaflebaeger bæger = new GrafiskRaflebaeger();

	public void paint(Graphics g) {
		super.paint(g);
		for (int n = 0; n < tegnbare.size(); n++) {
			Tegnbar t = (Tegnbar) tegnbare.get(n);
			t.tegn(g);
		}
	}

	public void sætPositioner() {
		for (int n = 0; n < tegnbare.size(); n++) {
			Tegnbar t = (Tegnbar) tegnbare.get(n);
			int x = (int) (Math.random() * 200);
			int y = (int) (Math.random() * 200);
			t.sætPosition(x, y);
		}
	}

	public void init() {

		Tegnbar s = new Tegnbar() {
			private int posX, posY;

			public void sætPosition(int x, int y) // kræves af Tegnbar
			{
				posX = x;
				posY = y;
			}

			public void tegn(Graphics g) // kræves af Tegnbar
			{
				g.drawString("*", posX, posY);
			}
		};
		tegnbare.add(s);


		s = new Tegnbar() {
			private int pos;

			public void sætPosition(int x, int y) // kræves af Tegnbar
			{
				pos = x + y;
			}

			public void tegn(Graphics g) // kræves af Tegnbar
			{
				g.drawString("+", pos, pos);
			}
		};
		tegnbare.add(s);


		tegnbare.add(new Tegnbar() {
			private int pos;

			public void sætPosition(int x, int y) // kræves af Tegnbar
			{
				pos = x / y;
			}

			public void tegn(Graphics g) // kræves af Tegnbar
			{
				g.drawString("/", pos, pos);
			}
		});


		sætPositioner();
	}
}