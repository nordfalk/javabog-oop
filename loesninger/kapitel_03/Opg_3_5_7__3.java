package kapitel_03;

public class Opg_3_5_7__3 {
	public static void main(String[] args) {
		String s = "måskeHej måske alle måske sammen måske";
		String s2 = "måske";

		int i = s.indexOf(s2);

		while (i != -1) {
			String før, efter;

			efter = s.substring(i + 5);
			før = s.substring(0, i);
			s = før + efter;

			System.out.println(s);

			i = s.indexOf(s2);
		}
	}
}
