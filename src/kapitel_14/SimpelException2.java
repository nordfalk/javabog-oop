package kapitel_14;
import java.util.ArrayList;
public class SimpelException2
{
	public static void main(String[] arg)
	{
		System.out.println("Punkt A");	             // punkt A
		try 
		{
			ArrayList l = new ArrayList();
			System.out.println("Punkt B");           // punkt B
			l.get(5);
			System.out.println("Punkt C");           // punkt C
		}
		catch (Exception e)
		{
			System.out.println("Der opstod en exception!");
		}
		System.out.println("Punkt D");             // punkt D
	}
}