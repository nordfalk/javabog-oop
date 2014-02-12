package kapitel_02;
public class BenytOpremsning
{

	public enum Ugedag
	{
	  MANDAG, TIRSDAG, ONSDAG, TORSDAG, FREDAG, LøRDAG, SøNDAG;
	}

	public static void main(String[] arg) 
	{
		Ugedag dag = Ugedag.ONSDAG;

		switch (dag) {
			case LøRDAG:
			case SøNDAG:
				System.out.println("Hurra, det er "+dag);
				break;
			default:
				System.out.println("øv, det er "+dag);
		}
		int n = Ugedag.LøRDAG.ordinal()-dag.ordinal();
		System.out.println("Der er "+n+" dage til weekend.");
	}
}