package kapitel_10;
import kapitel_09.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Kurvetegningsapplet extends JApplet
{
	ArrayList<Color> farver; // felt kendt i både init() og paint()
	int forskydning = 50;    // en forskydning i farvevalget

	public Kurvetegningsapplet()
	{
		System.out.println("Konstruktør kaldt - bredden er her: "+getSize().width);
	}

	public void init()     // Forbered punkterne i init(), ikke i konstruktøren
	{
		System.out.println("init()    kaldt   - bredden er her: "+getSize().width);
		System.out.println("               URL: "+getDocumentBase());

		farver = new ArrayList<Color>();
		for (int i=0; i<400; i++)
		{
			Color farve = new Color(i%256, (i*2)%256, (i*4)%256);
			farver.add(farve);
		}
	}

	public void start()
	{
		System.out.println("start()   kaldt");
	}

	public void paint(Graphics g)                 // ikke  paintComponent()
	{
		System.out.println("paint()   kaldt");
		showStatus("Dette er statuslinjen "+new Date());
		g.drawString("Kurvetegning", forskydning%400, forskydning%300);
		for (int x=0; x<farver.size(); x++)
		{
			int y = 150 - (int) (120*Math.sin(0.05*x));
			int i = (x+forskydning)%400;
			Color farve = farver.get(i);
			g.setColor(farve);
			g.fillRect(x, y, 5, 5);
		}
	}

	public void stop()
	{
		System.out.println("stop()    kaldt");
	}

	public void destroy()
	{
		System.out.println("destroy() kaldt");
	}
}