package kapitel_12;
import java.awt.*;
public class Rektangel extends Rectangle implements Tegnbar {

  public Rektangel(int w1, int h1) {
    super(w1, h1);
  }

  public void sætPosition(int x1, int y1) {
    x = x1;
    y = y1;
  }

  public void tegn(Graphics g) {
    g.drawRect(x, y, width, height);
  }
}
