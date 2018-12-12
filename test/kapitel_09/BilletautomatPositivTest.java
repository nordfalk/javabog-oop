package kapitel_09;

import kapitel_04.Billetautomat;
import org.junit.Test;
import static org.junit.Assert.*;

public class BilletautomatPositivTest
{
	@Test
	public void testNormaltKøb() {
		Billetautomat automat = new Billetautomat(10);
		assertEquals(10, automat.getBilletpris());
		assertEquals(0, automat.getBalance());
		automat.indsætPenge(10);
		assertEquals(10, automat.getBalance());
		automat.udskrivBillet();
		assertEquals(0, automat.getBalance());
	}

	@Test
	public void testSetBilletpris()
	{
		Billetautomat automat = new Billetautomat(10);
		automat.setBilletpris("1234", 20);
		assertEquals(20, automat.getBilletpris());
	}

	@Test
	public void testGetSamletSalgsbeløb()
	{
		Billetautomat automat = new Billetautomat(10);
		automat.indsætPenge(10);
		assertEquals(0, automat.getSamletSalgsbeløb("1234"));
		automat.udskrivBillet();
		assertEquals(10, automat.getSamletSalgsbeløb("1234"));
	}
}
