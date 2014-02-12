package kapitel_02;
public class SyvtabelDoWhile
{
	public static void main(String[] arg) 
	{
		int n = 1;
		do 
		{
			System.out.println(n+" : "+ 7*n);
			n = n + 1;
		}
		while (n < 11);
	}
}