package kapitel_04;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author j
 */
public class BilletautomatNegativPrisTest {

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
