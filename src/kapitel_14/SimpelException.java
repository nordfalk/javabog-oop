package kapitel_14;
import java.util.ArrayList;

public class SimpelException
{
	public static void main(String[] arg)
	{
		System.out.println("Punkt A");       // punkt A
		ArrayList l = new ArrayList();
		System.out.println("Punkt B");       // punkt B
		l.get(5);
		System.out.println("Punkt C");       // punkt C
	}
}