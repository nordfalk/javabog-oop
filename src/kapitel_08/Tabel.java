package kapitel_08;
public class Tabel
{		
	public static void main(String[] arg)
	{
		int[][] tabel = new int[20][10];

		for (int i = 0; i < 20; i=i+1) 
			for (int j = 0; j < 10; j=j+1) 
				tabel[i][j] = i*j;

		System.out.println("4*5 = " + tabel[4][5]);
		System.out.println("9*8 = " + tabel[9][8]);
		System.out.println("2*6 = " + tabel[2][6]);
	}
}