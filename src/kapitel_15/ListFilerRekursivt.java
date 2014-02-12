package kapitel_15;
import java.io.*;
public class ListFilerRekursivt
{
	public static void main(String[] arg)
	{
		File m = new File(".");  // repræsenterer den aktuelle mappe
		listMappe(m);
	}

	private static void listMappe(File mappe)
	{
		File[] filer = mappe.listFiles();

		for (int i=0; i<filer.length; i++) 
		{
			File f = filer[i];
			System.out.println(f);    // udskriv filens/mappens navn og sti

			if (f.isDirectory())
				listMappe(f);        // kald listMappe() rekursivt
		}
	}
}