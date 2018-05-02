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
public class Boks2Test {

  public Boks2Test() {
  }

  /**
   * Test of sætMål method, of class Boks2.
   */
  @Test
  public void testSætMål() {
    Boks2 b = new Boks2();
    b.sætMål(1, 1, 3);
    assertEquals(3, b.volumen(), 0.00001);
  }

  @Test
  public void testSætMål2() {
    Boks2 b = new Boks2();
    b.sætMål(1, 1, -3);
    assertEquals(1000, b.volumen(), 0.00001);
  }

  /**
   * Test of volumen method, of class Boks2.
   */
  @Test
  public void testVolumen() {
  }

}
