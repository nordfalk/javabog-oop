//Malene Andersen
package loesninger.konti1;

import java.util.Date;

public class Postering {
	private int m_beløb = 0;
	private String m_tekst;
	private Date dato;

	public Postering(int l_beløb, String l_tekst) {
		m_beløb = l_beløb;
		m_tekst = l_tekst;
		dato = new Date();
	}

	public String toString() {
		return m_tekst + " " + m_beløb + " kroner. Dato: " + dato;
	}
}
