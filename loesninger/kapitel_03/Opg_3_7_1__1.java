package kapitel_03;

import java.util.*;

public class Opg_3_7_1__1 {
	public static void main(String[] args) {
		Date netopNu;
		Date jacob;
		Date halvAlder;

		netopNu = new Date();
		jacob = new Date(71, 0, 1, 12, 00);

		System.out.println("Dags dato. " + netopNu.toString());
		System.out.println("Jacob blev født " + jacob);

		long nuMs;
		long jacobMs;
		long alderMs;

		nuMs = netopNu.getTime();
		jacobMs = jacob.getTime();
		alderMs = nuMs - jacobMs;

		halvAlder = new Date(nuMs - alderMs / 2);
		System.out.println("Jacob var halvt så gammel " + halvAlder);
	}
}
