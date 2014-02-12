package kapitel_15;
import java.io.*;
import java.util.zip.*;

public class UndersoegFil
{
	public static void main(String[] arg) throws IOException
	{
		FileInputStream fil = new FileInputStream("skrevet fil.txt");
		BufferedInputStream bstrøm = new BufferedInputStream(fil);
		CRC32 checksum = new CRC32();
		CheckedInputStream chkstrøm = new CheckedInputStream(bstrøm,checksum);
		InputStreamReader txtstrøm  = new InputStreamReader(chkstrøm);
		LineNumberReader ind        = new LineNumberReader(txtstrøm);

		String linje;
		while ((linje=ind.readLine())!= null) System.out.println("Læst: "+linje);

		System.out.println("Antal linjer: "  +ind.getLineNumber());
		System.out.println("Checksum (CRC):" +checksum.getValue());
	}
}