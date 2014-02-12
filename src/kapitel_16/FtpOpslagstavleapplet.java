package kapitel_16;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FtpOpslagstavleapplet extends JApplet implements ActionListener {
	BorderLayout borderLayout1 = new BorderLayout();
	JTextArea textAreaOpslag = new JTextArea();
	JPanel panelBundlinje = new JPanel();
	JLabel labelKode = new JLabel();
	JPasswordField passwordField = new JPasswordField();
	JButton buttonOk = new JButton();
	FtpForbindelse f;

	public void init() {
		this.setLayout(borderLayout1);
		textAreaOpslag.setText("Opslagstavlen\n\nSkriv koden og tryk OK");
		labelKode.setText("Kode:");
		passwordField.setColumns(8);
		passwordField.setEchoChar('*'); // Skjul adgangskoden
		buttonOk.setText("OK");
		buttonOk.addActionListener(this);
		panelBundlinje.add(labelKode);
		panelBundlinje.add(passwordField);
		panelBundlinje.add(buttonOk);
		this.add(textAreaOpslag, BorderLayout.CENTER);
		this.add(panelBundlinje, BorderLayout.SOUTH);
	}

	public void actionPerformed(java.awt.event.ActionEvent e) {
		try {
			if (f == null) {
				f = new FtpForbindelse();
				String vært = getCodeBase().getHost();
				if (vært.length()==0) vært = "pingo.cv.ihk.dk"; // test-vært
				f.forbind(vært,"jano",new String(passwordField.getPassword()));
				textAreaOpslag.setText(f.modtagTekst("RETR opslag.txt"));
			} else {
				f.sendTekst("STOR opslag.txt",textAreaOpslag.getText());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			textAreaOpslag.setText("Fejl: "+ex);
		}
	}
}