package kapitel_04;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author j
 */
public class BilletautomatTestNegativPenge {
  
  public BilletautomatTestNegativPenge() {
  }

  @Test
  public void testIndsætPengeUdskrivBillet() {
    System.out.println("inds\u00e6tPenge");
    Billetautomat instance = new Billetautomat(100);
    instance.indsætPenge(-99);
    int bal = instance.getBalance();
    assertEquals(0, bal);
  }


}
