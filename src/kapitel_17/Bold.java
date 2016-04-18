package kapitel_17;
import java.awt.*;

public class Bold implements Runnable
{
	double x, y, fartx, farty;
	Graphics g;

	public Bold(Graphics g1, int x1, int y1)
	{
		g = g1;
		x = x1;
		y = y1;

		fartx = Math.random();
		farty = Math.random();
		Thread t = new Thread(this);
		t.start();
	}

	public void run()
	{
		for (int tid=0; tid<5000; tid++)
		{
        // Tegn bolden over med hvid på den gamle position
			g.setColor(Color.WHITE);
        g.drawOval((int) x, (int) y, 50, 50);

        // Opdater positionen med farten
        x = x + fartx;
        y = y + farty;

        // Tegn bolden med sort på den nye position
        g.setColor(Color.BLACK);
			g.drawOval((int) x, (int) y, 50, 50);

      // ændr boldens hastighed lidt nedad
      farty = farty + 0.1;

      // Hvis bolden er uden for det tilladte område skal den
      // rettes hen mod området
      if (x < 0) fartx = Math.abs(fartx);
      if (x > 400) fartx = -Math.abs(fartx);
      if (y < 0) farty = Math.abs(farty);
      if (y > 100) farty = -Math.abs(farty);

      // Vent lidt
      try { Thread.sleep(10); } catch (Exception e) {};
    }
	}
}