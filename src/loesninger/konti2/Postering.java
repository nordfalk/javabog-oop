package loesninger.konti2;

import java.util.Date;

public class Postering {
	private Date tid;
	private Konto konto;
	private int beløb;
	private int daværendeSaldo;

	public Postering(Konto k, int b) {
		tid = new Date();
		beløb = b;
		konto = k;
		k.saldo = k.saldo + beløb;
		daværendeSaldo = k.saldo;
	}

	@Override
	public String toString() {
		return tid.toString() + ":     " + beløb + " kr. indbetalt     Saldo: " + daværendeSaldo + " kr.";
	}
}
