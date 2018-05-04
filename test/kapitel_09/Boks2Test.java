package kapitel_09;

import kapitel_04.Boks2;
import org.junit.Test;
import static org.junit.Assert.*;

public class Boks2Test {

  @Test
  public void testSætMål() {

		// Opsætning af objekter og tjek af startbetingelser
    Boks2 b = new Boks2();
    assertEquals(0, b.volumen(), 0.001);

		// Positiv test - vi tjekker resultater af forventede kald
    b.sætMål(1, 1, 3);
    assertEquals(3, b.volumen(), 0.001);

		// Negativ test - vi tjekker resultater af uventede kald
    b.sætMål(1, 1, -3);
    assertEquals(1000, b.volumen(), 0.001);
  }
}
