package kapitel_15;
import java.io.*;
public class OpretMappeOgSkrivFil
{
	public static void main(String[] arg) {
		File minMappe = new File("minMappe");  // repræsenterer mappen 'minMappe'
		minMappe.mkdirs();  // opret mappen hvis den ikke allerede er oprettet

		for (File fil : minMappe.listFiles()) {
			System.out.println("Mappen har filen " + fil);
		}

		File minFil = new File(minMappe, "minFil.txt"); // "minMappe/minFil.txt"
		try (FileWriter fw = new FileWriter(minFil)) {
			fw.append("Hej verden\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}