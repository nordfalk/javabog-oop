/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_11_struktur_i_en_gui;

import kapitel_04.Billetautomat;

/**
 *
 * @author j
 */
public class UdskrivBilletPanel extends javax.swing.JPanel {

	private FanerPanel fanerPanel;

	/**
	 * Creates new form UdskrivBillet
	 */
	public UdskrivBilletPanel() {
		initComponents();
	}


	public void setFanerPanel(FanerPanel ejer) {
		fanerPanel = ejer;
	}

	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jButtonUdskriv = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();
    jLabelStatus = new javax.swing.JLabel();

    jLabel1.setText("Du kan nu udskrive dine biletter");

    jButtonUdskriv.setText("Udskriv en billet");
    jButtonUdskriv.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonUdskrivActionPerformed(evt);
      }
    });

    jButton1.setText("Afslut");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jLabelStatus.setText("Status vises her");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jButton1))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addComponent(jButtonUdskriv)
              .addComponent(jLabelStatus))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(jButtonUdskriv)
        .addGap(18, 18, 18)
        .addComponent(jLabelStatus)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jButton1)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jButtonUdskrivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUdskrivActionPerformed
		Billetautomat automat = fanerPanel.getAutomatlogik();
		if (automat.getBalance()>=automat.getBilletpris()) {
			automat.udskrivBillet();
			jLabelStatus.setText("OK. En billet blev udskrevet af printeren");
		} else {
			jLabelStatus.setText("Der er ikke kastet penge nok ind");
		}

  }//GEN-LAST:event_jButtonUdskrivActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
		fanerPanel.skiftTilFane(0);
  }//GEN-LAST:event_jButton1ActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButtonUdskriv;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabelStatus;
  // End of variables declaration//GEN-END:variables
}
