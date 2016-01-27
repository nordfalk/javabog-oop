package kapitel_02;
public class BenytOpremsning
{

	public enum Ugedag
	{
		MANDAG(false), TIRSDAG(false), ONSDAG(false), TORSDAG(false),
		FREDAG(false), LØRDAG(true), SØNDAG(true);         // brug konstruktør

		private boolean fri;                               // variabel (felt)

		Ugedag(boolean weekend) { fri = weekend; } // konstruktør

		public boolean harFri() { return fri; }            // metode
	}

	public static void main(String[] arg)
	{
		Ugedag dag = Ugedag.ONSDAG;
		System.out.println("Har fri "+dag+": "+dag.harFri());
	}
}