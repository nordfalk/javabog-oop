package kapitel_08;
public class ArrayEksempel
{
	public static void main(String[] arg)
	{
		int[] arr = new int[6];
		arr[0] = 28;
		arr[2] = 13;

		arr[3] = arr[0] + arr[1] + arr[2];

		int længde = arr.length;    // = 6, da vi oprettede det med new int[6]

		for (int i=0; i<længde; i=i+1) System.out.print( arr[i] + " " );
		System.out.println();
	}
}