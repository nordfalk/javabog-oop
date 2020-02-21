package kapitel_12;

import javax.swing.*;
import java.awt.*;


public class Opg_12_6__1__TegnbartHus {

	static class Hus implements Tegnbar {
		int højde;
		int bredde;
		int x;
		int y;

		public Hus(int x1, int y1, int width1, int height1) {
			x = x1;
			y = y1;
			højde = height1;
			bredde = width1;
		}

		public void sætPosition(int x1, int y1) {
			x = x1;
			y = y1;
		}

		public void tegn(Graphics g) {
			g.drawRect(x, (int) (y + højde / 3), bredde, (int) (højde * 2 / 3));
			g.drawLine(x, (int) (y + højde / 3), (int) (x + bredde / 3), y);
			g.drawLine((int) (x + bredde / 3), y, (int) (x + bredde * 2 / 3), y);
			g.drawLine((int) (x + bredde * 2 / 3), y, x + bredde, (int) (y + højde / 3));
		}
	}


	public static void main(String[] arg) {
		TegnbareObjekterPanel panel = new TegnbareObjekterPanel();

		Stjerne stjerne = new Stjerne();
		GrafiskTerning grafiskTerning1 = new GrafiskTerning();
		GrafiskTerning grafiskTerning2 = new GrafiskTerning();
		GrafiskRaflebaeger grafiskRaflebæger = new GrafiskRaflebaeger();
		grafiskRaflebæger.tilføjTerning(grafiskTerning1);
		grafiskRaflebæger.tilføjTerning(grafiskTerning2);

		panel.tegnbareObjekter.add(stjerne);
		panel.tegnbareObjekter.add(grafiskTerning1);
		panel.tegnbareObjekter.add(grafiskTerning2);
		panel.tegnbareObjekter.add(grafiskRaflebæger);
		panel.tegnbareObjekter.add(new Rektangel(20, 30));
		panel.tegnbareObjekter.add(new Rektangel(30, 20));

		Hus h = new Hus(0, 0, 50, 30);
		panel.tegnbareObjekter.add(h);
		panel.tegnbareObjekter.add(new Hus(20, 35, 30, 50));

		JFrame vindue = new JFrame("TegnbareObjekter");
		vindue.add(panel);
		vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vindue.setSize(400, 400);
		vindue.setVisible(true);
		int runde = 1;
		while (true) {
			double vinkel = runde * 0.005;
			for (Tegnbar t : panel.tegnbareObjekter) {
				int x = (int) (Math.cos(vinkel) * 100) + 200;
				int y = (int) (Math.sin(vinkel) * 100) + 200;
				t.sætPosition(x, y);
				vinkel = vinkel * 1.5;
			}
			panel.repaint();                               // gentegn skærm
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}// vent lidt
			if (runde++ % 100 == 0) grafiskRaflebæger.ryst();
		}
	}
}
