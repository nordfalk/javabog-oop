package xtra;

import java.io.*;
import java.util.Arrays;
import javax.print.*;
import javax.print.attribute.*;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.Sides;

/**
 *
 * @author j
 */
public class Udskrivning {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws Exception {
		FileInputStream textstream = new FileInputStream("skrevet fil.txt");

		DocFlavor dokumentformat = DocFlavor.INPUT_STREAM.TEXT_PLAIN_UTF_8;

		Doc myDoc = new SimpleDoc(textstream, dokumentformat, null);
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
		aset.add(new Copies(2));
//		aset.add(MediaSize.ISO.A4);
//		aset.add(Sides.DUPLEX);

		PrintService[] printerliste = PrintServiceLookup.lookupPrintServices(dokumentformat, aset);
		System.out.println("services = " + Arrays.toString(printerliste));
		if (printerliste.length > 0) {
			DocPrintJob job = printerliste[0].createPrintJob();
			job.print(myDoc, aset);
			System.out.println("Job udskrevet på "+printerliste[0]);
		}
	}
}
