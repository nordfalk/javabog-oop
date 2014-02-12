package kapitel_11;
import javax.swing.*;
public class BenytOverblikOverKomponenterMedHTML {
	public static void main(String[] arg) {
		OverblikOverKomponenter panel = new OverblikOverKomponenter(); 	
		JFrame vindue = new JFrame( "OverblikOverKomponenterHTML" );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

		panel.label1.setText("<html>En <font color=\"red\">rød</font> Label<br>"
		                    +"på flere linjer");
		panel.button1.setText("<html>OK<br><font size=\"1\">(måske)</font>");

		panel.comboBox1.removeAllItems();
		panel.comboBox1.addItem("<html>ComboBox <font color=\"red\">Rød</font>");
		panel.comboBox1.addItem("<html>ComboBox <font color=\"green\">Grøn</font>");
		panel.comboBox1.addItem("<html>ComboBox <font color=\"blue\">Blå</font>");

		panel.checkbox1.setText("<html><font size=\"7\">En</font>");
		panel.checkbox2.setText("<html><i>To</i>");
		panel.checkbox3.setText("<html><b>Tre</b>");

		vindue.add( panel );
		vindue.setSize(500,150);
		vindue.setVisible(true);
	}
}	