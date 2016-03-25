package kapitel_04;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author j
 */
public class BilletautomatTest2 {
  
  @Test
  public void testGetBilletpris() {
    System.out.println("getBilletpris");
    Billetautomat instance = new Billetautomat(412);
    int expResult = 412;
    int result = instance.getBilletpris();
    assertEquals(expResult, result);
  }



  @Test
  public void testIndsætPengeUdskrivBillet() {
    Billetautomat instance = new Billetautomat(100);
    instance.indsætPenge(99);
    int bal = instance.getBalance();
    assertEquals(99, bal);
    instance.udskrivBillet();
    assertEquals(99, instance.getBalance());
    instance.indsætPenge(1);
    assertEquals(100, instance.getBalance());
    instance.udskrivBillet();
    assertEquals(0, instance.getBalance());
  }


  @Test
  public void testGetBalance() {
    System.out.println("getBalance");
		Billetautomat instance = new Billetautomat(10);
		assertEquals(0, instance.getBalance());
  }

  @Test
  public void testUdskrivBillet() {
    System.out.println("udskrivBillet");
		Billetautomat instance = new Billetautomat(10);
		instance.indsætPenge(10);
    instance.udskrivBillet();
		assertEquals(0, instance.getBalance());
  }

}
