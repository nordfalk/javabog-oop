package kapitel_12;
import javax.swing.*;
public class BenytTegnbareObjekter
{
	public static void main(String[] arg)
	{
    TegnbareObjekter panel = new TegnbareObjekter();

		Stjerne stjerne = new Stjerne();

		GrafiskTerning t1 = new GrafiskTerning();
  	GrafiskRaflebaeger bæger = new GrafiskRaflebaeger();
		bæger.tilføjTerning(t1);

		GrafiskTerning t2 = new GrafiskTerning();
		bæger.tilføjTerning(t2);

		panel.tegnbareObjekter.add(t1);
		panel.tegnbareObjekter.add(t2);
		panel.tegnbareObjekter.add(bæger);
		panel.tegnbareObjekter.add(stjerne);		
		panel.tegnbareObjekter.add( new Rektangel(10,10,30,30) );
		panel.tegnbareObjekter.add( new Rektangel(15,15,20,20) );
    
		JFrame vindue = new JFrame( "TegnbareObjekter" ); 
		vindue.add( panel );
		vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		vindue.setSize(300,300);
		vindue.setVisible(true);
		while (true) {
      double v = System.currentTimeMillis()*0.001;
      for (Tegnbar t : panel.tegnbareObjekter) {
        int x = (int) (Math.cos(v)*100)+100;
        int y = (int) (Math.sin(v)*100)+100;
        t.sætPosition(x,y);
        v = v*1.5;
      }
			vindue.repaint();                               // gentegn skærm
			try { Thread.sleep(10); } catch (Exception e) {}// vent lidt
		}
	}	
}