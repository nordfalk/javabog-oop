package kapitel_02;
public class Metoder1
{
	public static void hils(String navn)
	{
		System.out.println("Kære "+navn+", du aner ikke hvor glad jeg er for at");
		System.out.println("møde en med "+navn.length()+" bogstaver i sit navn!");
	}

	public static void main(String[] arg)
	{
		hils("Bo");
		hils("Jacob");
		hils("Christoffer");
	}
}