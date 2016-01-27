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
public class BilletautomatTest {

	public BilletautomatTest() {
	}

	@Test
	public void testGetBilletpris() {
		System.out.println("getBilletpris");
		Billetautomat instance = new Billetautomat(10);
		int expResult = 10;
		int result = instance.getBilletpris();
		assertEquals(expResult, result);
	}


	@Test
	public void testGetBalance() {
		System.out.println("getBalance");
		Billetautomat instance = new Billetautomat(10);
		int expResult = 0;
		int result = instance.getBalance();
		assertEquals(expResult, result);		
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
