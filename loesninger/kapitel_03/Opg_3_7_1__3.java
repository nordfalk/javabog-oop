package kapitel_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

public class Opg_3_7_1__3 {
	public static void main(String[] args) throws Exception {
		Date netopNu = new Date();

		int dag, måned, år;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Indtast fødselsår: ");
		år = Integer.parseInt(br.readLine());

		System.out.print("Indtast fødselsmåned: ");
		måned = Integer.parseInt(br.readLine());

		System.out.print("Indtast fødselsdag: ");
		dag = Integer.parseInt(br.readLine());

		Date fødselsdage = new Date(år, måned - 1, dag);

		while (fødselsdage.getYear() < netopNu.getYear()) {
			System.out.println("Fødselsdagen er : " + fødselsdage);
			fødselsdage.setYear(fødselsdage.getYear() + 1);
		}

	}
}
