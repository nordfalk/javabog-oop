package kapitel_03;

public class Opg_3_5_7__1 {
	public static void main(String[] args) {
		String s = "Hej alle sammen";
		int i = 0;
		i = s.indexOf(" ");
		if (i == -1) {
			System.out.println("Der er ingen mellemrum i linien");
		} else {
			System.out.println("Mellemrummet er på plads : " + i);
		}
	}
}
