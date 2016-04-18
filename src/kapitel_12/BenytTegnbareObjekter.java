package kapitel_12;
import javax.swing.*;
public class BenytTegnbareObjekter
{
	public static void main(String[] arg)
	{
    TegnbareObjekter panel = new TegnbareObjekter();

		Stjerne stjerne = new Stjerne();

		GrafiskTerning t1 = new GrafiskTerning();
		GrafiskTerning t2 = new GrafiskTerning();
  	GrafiskRaflebaeger bæger = new GrafiskRaflebaeger();
		bæger.tilføjTerning(t1);
		bæger.tilføjTerning(t2);

		panel.tegnbareObjekter.add(stjerne);
		panel.tegnbareObjekter.add(t1);
		panel.tegnbareObjekter.add(t2);
		panel.tegnbareObjekter.add(bæger);
		panel.tegnbareObjekter.add( new Rektangel(20,30) );
		panel.tegnbareObjekter.add( new Rektangel(30,20) );

		JFrame vindue = new JFrame( "TegnbareObjekter" );
		vindue.add( panel );
		vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vindue.setSize(300,300);
		vindue.setVisible(true);
    int n = 1;
		while (true) {
      double v = n*0.005;
      for (Tegnbar t : panel.tegnbareObjekter) {
        int x = (int) (Math.cos(v)*100)+100;
        int y = (int) (Math.sin(v)*100)+100;
        t.sætPosition(x,y);
        v = v*1.5;
      }
			vindue.repaint();                               // gentegn skærm
			try { Thread.sleep(10); } catch (Exception e) {}// vent lidt
      if (n++ % 100 == 0) bæger.ryst();
		}
	}
}