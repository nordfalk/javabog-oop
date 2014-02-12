package kapitel_08;
public class Maaneder
{	
	public static void main(String[] arg)
	{ 
		int[] månedesLgd = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println("Januar har " + månedesLgd[0] + " dage.");
		System.out.println("April har " + månedesLgd[3] + " dage.");

		// med foreach-løkke, se afsnit 3.6.1.
		for (int lgd : månedesLgd) System.out.print(lgd + " ");

		System.out.println();
	}
}