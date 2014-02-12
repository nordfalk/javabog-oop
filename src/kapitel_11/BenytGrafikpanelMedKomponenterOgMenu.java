package kapitel_11;
import java.awt.event.*;
import javax.swing.*;

public class BenytGrafikpanelMedKomponenterOgMenu
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "GrafikpanelMedKomponenterOgMenu" ); 
		final GrafikpanelMedKomponenter panel = new GrafikpanelMedKomponenter();
		vindue.add( panel );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		vindue.setSize(350,300);

		JMenuBar  menubjælke = new JMenuBar();

		JMenu     rullegardinFil   = new JMenu();
		JMenuItem menupunktOpdat   = new JMenuItem();
		JMenuItem menupunktAfslut  = new JMenuItem();

		JMenu     rullegardinHjælp = new JMenu();

		rullegardinFil.setText("Fil");
		rullegardinFil.setMnemonic(KeyEvent.VK_F);
		menupunktOpdat.setText("Opdater");
		menupunktAfslut.setText("Afslut");
		menupunktAfslut.setMnemonic(KeyEvent.VK_A);

		rullegardinHjælp.setText("Hjælp");

		rullegardinFil.add(menupunktOpdat);
		rullegardinFil.add(menupunktAfslut);
		menubjælke.add(rullegardinFil);
		menubjælke.add(rullegardinHjælp);

		vindue.setJMenuBar(menubjælke);

		menupunktOpdat.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				panel.buttonOpdater_actionPerformed(e);
			}
		});

		menupunktAfslut.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				System.out.println("Farvel!");
				System.exit(0);
			}
		});

		vindue.setVisible(true); // som det allersidste: vis vinduet
	}
}