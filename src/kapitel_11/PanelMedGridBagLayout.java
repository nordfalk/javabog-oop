package kapitel_11;
import java.awt.*;
import javax.swing.*;

public class PanelMedGridBagLayout extends JPanel
{
	GridBagLayout gridBagLayout1 = new GridBagLayout();
	JButton   knap1 = new JButton();
	JButton   knap2 = new JButton();
	JButton   knap3 = new JButton();
	JButton   knap4 = new JButton();
	JButton   knap5 = new JButton();
	JCheckBox chkHø = new JCheckBox();
	JCheckBox chkVe = new JCheckBox();
	JCheckBox chkCe = new JCheckBox();
	JTextArea tekst = new JTextArea();

	public PanelMedGridBagLayout() {
		try {
			jbInit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		knap1.setText("knap1 (på 3x1 celler)");
		knap2.setText("knap2 (1x2)");
		knap3.setText("knap3 (på 1x1 celle)");
		knap4.setText("knap4 (1x1)");
		knap5.setText("knap5 (1x1)");
		chkHø.setText("Højre");
		chkVe.setText("Venstre");
		chkCe.setText("Centreret");
		tekst.setColumns(15);
		tekst.setRows(2);
		tekst.setText("Tekstfelt (3x3 celler)");

		this.setLayout(gridBagLayout1);

		// til sidst skal komponenterne føjes til containeren
		this.add(knap1, new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0, 
		GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
		this.add(knap2, new GridBagConstraints(3, 0, 1, 2, 0.0, 0.0,
		GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
		this.add(knap3, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
		GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
		this.add(knap4, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
		GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
		this.add(knap5, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
		GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
		this.add(chkHø, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
		GridBagConstraints.EAST,  GridBagConstraints.NONE,new Insets(0,0,0,0),0,0));
		this.add(chkVe, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
		GridBagConstraints.WEST,  GridBagConstraints.NONE,new Insets(0,0,0,0),0,0));
		this.add(chkCe, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
		GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0));
		this.add(tekst, new GridBagConstraints(1, 2, 3, 3, 0.0, 0.0,
		GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
	}
}