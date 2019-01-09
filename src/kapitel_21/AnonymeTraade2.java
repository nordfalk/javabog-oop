package kapitel_21;

public class AnonymeTraade2
{
	public static void main(String[] arg)
	{
		new Thread( () -> System.out.println("Hejsa") ).start();
	}
}