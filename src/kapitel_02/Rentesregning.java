package kapitel_02;
public class Rentesregning
{
	public static void main(String[] arg) 
	{
		System.out.println("1000 kr med 5 % i rente på 10 år giver "
		                   + 1000*Math.pow(1.05 ,10) + " kroner.");
	}
}