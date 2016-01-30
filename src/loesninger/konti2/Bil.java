package loesninger.konti2;

import java.util.ArrayList;
import java.util.List;


public class Bil {
	public Person ejer;
	public int værdi;

    /**
     * @associates <{Hjul}>
     */
    private ArrayList<Person> hjul;

    public Bil(Person e, int v) {
		ejer = e;
		værdi = v;
	}

	@Override
	public String toString() {
		return ejer.fornavn + " har en bil med værdien " + værdi + " kr.";
	}
}
