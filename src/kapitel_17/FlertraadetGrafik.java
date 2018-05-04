package kapitel_17;
import java.awt.*;
import javax.swing.*;

public class FlertraadetGrafik
{
	public static void main(String[] arg)
	{
		JFrame f = new JFrame();
		f.setSize(400,150);
		f.setBackground(Color.WHITE);
		f.setVisible(true);
		Graphics g = f.getGraphics();
		new Thread(new Bold(g,  0, 0)).start();
		new Thread(new Bold(g, 50,10)).start();
		new Thread(new Bold(g,100,50)).start();
		new Thread(new Bold(g,150,90)).start();
		System.out.println("Boldene er startet");
  }
}