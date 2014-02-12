package kapitel_12;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class TegnbareObjekter extends JPanel
{
	ArrayList<Tegnbar> tegnbare = new ArrayList<Tegnbar>();
	GrafiskRaflebaeger bæger = new GrafiskRaflebaeger();

	public void sætPositioner()
	{
		for (Tegnbar t : tegnbare) {
			int x = (int) (Math.random()*200);
			int y = (int) (Math.random()*200);
			t.sætPosition(x,y);
		}
	}

	public TegnbareObjekter()
	{
		Stjerne s = new Stjerne();
		tegnbare.add(s);
		
		tegnbare.add( new Rektangel(10,10,30,30) );
		tegnbare.add( new Rektangel(15,15,20,20) );

		GrafiskTerning t;
		t = new GrafiskTerning();
		bæger.tilføjTerning(t);
		tegnbare.add(t);

		t = new GrafiskTerning();
		bæger.tilføjTerning(t);
		tegnbare.add(t);

		tegnbare.add(bæger);

		sætPositioner();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		sætPositioner();

		for (Tegnbar t : tegnbare) t.tegn(g);
	}
}