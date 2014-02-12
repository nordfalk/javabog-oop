package kapitel_08;
public class Labyrint
{
	public static void main(String[] arg)
	{
		int[][] labyrint = {
						{ 0, 0, 0, 1, 1, 1, 1, 1},
				 		{ 0, 1, 1, 1, 0, 0, 0, 1},
						{ 0, 0, 0, 0, 0, 1, 0, 1},
						{ 1, 1, 1, 1, 0, 1, 0, 1},
						{ 0, 1, 0, 0, 0, 1, 1, 1},
						{ 0, 0, 0, 1, 1, 1, 0, 1},
						{ 1, 1, 0, 0, 0, 0, 0, 0},
						{ 1, 1, 1, 1, 1, 1, 1, 0} };

		for (int i=0; i<8; i=i+1) {
			for (int j=0; j<8; j=j+1)
				if (labyrint[i][j] == 1) System.out.print("*");
				else System.out.print(" ");
			System.out.println();
		}
	}
}