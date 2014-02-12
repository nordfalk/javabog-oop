package kapitel_15;
import java.io.*;

public class KopierFil
{
	public static void main(String[] arg) throws IOException
	{
		InputStream is = new FileInputStream("bog.html");
		OutputStream os = new FileOutputStream("kopieretBog.html");

		// brug evt. buffere i læsning og skrivning (mere effektivt)        punkt A
		// is = new BufferedInputStream(is);
		// os = new BufferedOutputStream(os);

		// husk starttidpunkt, så vi kan måle hvor lang tid det teger
		long starttid = System.currentTimeMillis();

		// læs og skriv én byte ad gangen (ret ineffektivt)                 punkt B
		int b = is.read();
		while (b != -1)
		{
			os.write(b);
			b = is.read();
		}

		is.close();
		os.close();
		long sluttid = System.currentTimeMillis();
		System.out.println("Kopiering tog "+ (sluttid-starttid)*0.001 +" sek.");

	}
}