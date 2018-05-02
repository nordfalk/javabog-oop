/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_04;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author j
 */
public class Boks3Test {

  public Boks3Test() {
  }

  /**
   * Test of volumen method, of class Boks3.
   */
  @Test
  public void testVolumen() {
    Boks3 b = new Boks3();
    double vol = b.volumen();
    assertEquals(1000, vol, 0.0001);
  }

  @Test
  public void testVolumen2() {
    Boks3 b = new Boks3(5,5,2);
    double vol = b.volumen();
    assertEquals(50, vol, 0.0001);
  }


  @Test
  public void testVolumen3() {
    Boks3 b = new Boks3(-5,5,2);
    double vol = b.volumen();
    assertEquals(1000, vol, 0.0001);
  }

}
