package kapitel_08;
public class Kommandolinje 
{
	public static void main(String[] arg)
	{ 
		System.out.println("Antallet af argumenter er: " + arg.length);

		for (int i=0; i< arg.length; i=i+1)
			System.out.println("Argument "+i+" er: " + arg[i]);
	}
}