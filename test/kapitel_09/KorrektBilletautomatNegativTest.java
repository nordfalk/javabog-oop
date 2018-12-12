package kapitel_09;

import kapitel_04.Billetautomat;
import org.junit.*;
import static org.junit.Assert.*;

public class KorrektBilletautomatNegativTest {

	Billetautomat automat;

	@Before
	public void setOp() { // Køres før hver testmetode
		automat = new Billetautomat(10);
	}

	@Test
	public void testUdskrivBilletForFåPenge() {
		automat.indsætPenge(9);             // 1 krone for lidt
		automat.udskrivBillet();            // kaldet bør ignoreres
		assertEquals(9, automat.getBalance());// 9 kr stadigvæk
	}


	@Test
	public void testUdskrivBilletForMangePenge() {
		automat.indsætPenge(11);             // 1 krone for meget
		automat.udskrivBillet();
		assertEquals(1, automat.getBalance()); // 1 krone i rest
	}


	@Test
	public void testUdskrivMangeBiletter()
	{
		automat.indsætPenge(100);
		automat.udskrivBillet();
		automat.udskrivBillet();
		automat.udskrivBillet();
		automat.udskrivBillet();
		assertEquals(60, automat.getBalance());
		assertEquals(40, automat.getSamletSalgsbeløb("1234"));
	}

	@Test
	public void testBeskyttedeFunktioner()
	{
		automat.setBilletpris("1111", 20);        // forkert kode
		assertEquals(10, automat.getBilletpris());  // prisen er uændret
		automat.setBilletpris("1234", 20);        // korrekt kode
		assertEquals(20, automat.getBilletpris());  // prisen er ændret

		automat.indsætPenge(100);
		automat.udskrivBillet();
		automat.udskrivBillet();
		assertEquals(40, automat.getSamletSalgsbeløb("1234"));// korrekt kode
		assertEquals( 0, automat.getSamletSalgsbeløb("1111"));// forkert kode
	}


	@Test
	public void testNegativtBeløb()
	{
		automat.indsætPenge(-10);           // kaldet bør ignoreres
		assertEquals(0, automat.getBalance());
	}


	@Test
	public void testAutomatMedStartbalance() {
		Billetautomat automat = new Billetautomat(10, 20);
		assertEquals(20, automat.getBalance());
		assertEquals(10, automat.getBilletpris());
	}
}
