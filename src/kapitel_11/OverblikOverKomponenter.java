package kapitel_11;
import java.awt.*;
import javax.swing.*;

public class OverblikOverKomponenter extends JPanel
{
	// opret alle komponenterne og husk dem i nogle felter
	JLabel label1 = new JLabel();
	JButton button1 = new JButton();
	JCheckBox checkbox1 = new JCheckBox();
	JCheckBox checkbox2 = new JCheckBox();
	JCheckBox checkbox3 = new JCheckBox();
	JRadioButton radio1 = new JRadioButton();
	JRadioButton radio2 = new JRadioButton();
	ButtonGroup buttonGroup1 = new ButtonGroup();
	JTextField textField1 = new JTextField();
	JTextArea textArea1 = new JTextArea();
	JComboBox comboBox1 = new JComboBox();

	String[] listedata = {"List rød", "List grøn", "List blå"};
	JList list1 = new JList(listedata);

	FlowLayout flowLayout1 = new FlowLayout(); // layout-manager (se senere)

	public OverblikOverKomponenter() {
		try {
			jbInit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		label1.setText("En Label");

		button1.setText("OK");

		checkbox1.setText("En");    // sæt afkrydsningsfelternes navne
		checkbox2.setText("To");
		checkbox3.setText("Tre");

		radio1.setText("Radio1");   // sæt radioknappernes navne og
		radio2.setText("Radio2");
		buttonGroup1.add(radio1);   // gruppe - så de gensidigt udelukker hinanden
		buttonGroup1.add(radio2);
		radio1.setSelected(true);

		comboBox1.addItem("ComboBox Rød");
		comboBox1.addItem("ComboBox Grøn");
		comboBox1.addItem("ComboBox Blå");

		textField1.setColumns(10);
		textField1.setText("Et TextField");

		textArea1.setColumns(15);
		textArea1.setRows(5);
		textArea1.setText("Et TextArea");

		this.setLayout(flowLayout1);// sæt layout-manager (se senere)

		this.add(label1);     // til sidst skal komponenterne føjes
		this.add(button1);    // til containeren (se senere)
		this.add(checkbox1);
		this.add(checkbox2);
		this.add(checkbox3);
		this.add(radio1);
		this.add(radio2);
		this.add(textField1);
		this.add(textArea1);
		this.add(comboBox1);
		this.add(list1);
	}
}