package kapitel_15;/*
4. Ret SkrivTekstfil.java til SkrivKomprimeretTekstfil.java, der gemmer data komprimeret.
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

public class Opg_15_8__5__SkrivKomprimeretTekstfil // SkrivKomprimeretTekstfil
{
	public static void main(String[] args) throws IOException {
		GZIPOutputStream zfil = new GZIPOutputStream(new FileOutputStream("skrevet fil.txt.gz"));
		PrintWriter ud = new PrintWriter(new OutputStreamWriter(zfil));
		for (int i = 0; i < 5; i++) {
			String navn = "person" + i;
			String køn;
			if (Math.random() > 0.5) køn = "m";
			else køn = "k";
			int alder = 10 + (int) (Math.random() * 60);

			ud.println(navn + " " + køn + " " + alder);
		}
		ud.close(); // luk så alle data skrives til disken
		System.out.println("Filen er gemt.");
	}
}