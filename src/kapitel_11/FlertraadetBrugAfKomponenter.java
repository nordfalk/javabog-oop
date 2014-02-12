package kapitel_11;
import java.util.Date;
import javax.swing.*;

public class FlertraadetBrugAfKomponenter {
	public static void main(String[] arg) throws Exception {
		final OverblikOverKomponenter panel = new OverblikOverKomponenter(); 	
		JFrame vindue = new JFrame( "FlertraadetBrugAfKomponenter" );
		vindue.add( panel );
		vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		vindue.setSize(350,300);
		vindue.setVisible(true);
		for (int t=0; t<100000; t++) {
			SwingUtilities.invokeLater(new Runnable() {  // indre anonym klasse
			public void run() {                          // med metoden run()
				panel.label1.setText("hej "+new Date());

				if (Math.random()>0.95) panel.comboBox1.removeAllItems();
				panel.comboBox1.addItem("hejsa "+new Date());
				int antal = panel.comboBox1.getItemCount();
				panel.comboBox1.setSelectedIndex( (int) (Math.random()*antal));
			}});   // slut på metoden run(), klasse og invokeLater()-kald
			try { Thread.sleep(500); } catch (Exception e) {} // Vent 1/2 sekund
		}
	}
}