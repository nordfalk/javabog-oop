package kapitel_11_struktur_i_en_gui;
import java.util.Date;
import javax.swing.JFrame;
import kapitel_04.Billetautomat;

public class VisGrafiskBilletautomat
{
	public static void main(String[] arg) throws InterruptedException
	{
		FanerPanel panel = new FanerPanel();        // opret panelet

		Billetautomat ba = new Billetautomat(10);
		panel.setAutomatlogik(ba);

		JFrame vindue = new JFrame("Grafikpanel");    // opret et vindue på skærmen
		vindue.add( panel );                          // vis panelet i vinduet

		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
		vindue.pack();                                // sæt vinduets størrelse
//		vindue.setResizable(false);
		vindue.setVisible(true);                      // åbn vinduet

		// main()-tråden kan nu evt foretage sig andre ting
		while (true) {
			Thread.sleep(5000);
			System.out.println("Balance per " +new Date());
			System.out.println(ba.getBalance());
		}
	}
}