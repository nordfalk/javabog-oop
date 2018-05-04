package kapitel_09;

import kapitel_04.Billetautomat;
import org.junit.Test;
import static org.junit.Assert.*;

public class BilletautomatTest {

	@Test
	public void testGetBilletpris() {
		System.out.println("getBilletpris");
		Billetautomat instance = new Billetautomat(10);
		assertEquals(10, instance.getBilletpris());
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

	@Test
	public void tjekNegativtBeløb()
  {
		Billetautomat automat = new Billetautomat(10);
    automat.indsætPenge(-10);
		int retur = automat.getBalance();
		assertEquals(0, retur);
	}
}
