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
public class IndkastPengePanel extends javax.swing.JPanel {

	private FanerPanel fanerPanel;

	/**
	 * Creates new form IndkastPengePanel
	 */
	public IndkastPengePanel() {
		initComponents();
	}


	public void setFanerPanel(FanerPanel ejer) {
		fanerPanel = ejer;
	}


	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jButtonVidere = new javax.swing.JButton();
    jButtonTilbage = new javax.swing.JButton();
    jButton1Kr = new javax.swing.JButton();
    jButton10kr = new javax.swing.JButton();
    jLabelBalance = new javax.swing.JLabel();

    jLabel1.setText("Her kan du indkaste penge i automaten");

    jButtonVidere.setText("Videre til køb");
    jButtonVidere.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonVidereActionPerformed(evt);
      }
    });

    jButtonTilbage.setText("Tilbage");
    jButtonTilbage.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonTilbageActionPerformed(evt);
      }
    });

    jButton1Kr.setText("Indkast 1 kr");
    jButton1Kr.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1KrActionPerformed(evt);
      }
    });

    jButton10kr.setText("Indkast 10 kr");
    jButton10kr.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton10krActionPerformed(evt);
      }
    });

    jLabelBalance.setText("Saldo er på x kr");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButtonTilbage)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonVidere))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1Kr)
                .addGap(18, 18, 18)
                .addComponent(jButton10kr))
              .addComponent(jLabelBalance))
            .addGap(0, 105, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1Kr)
          .addComponent(jButton10kr))
        .addGap(18, 18, 18)
        .addComponent(jLabelBalance)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButtonVidere)
          .addComponent(jButtonTilbage))
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jButtonTilbageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTilbageActionPerformed
		fanerPanel.skiftTilFane(0);
  }//GEN-LAST:event_jButtonTilbageActionPerformed

  private void jButtonVidereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVidereActionPerformed
		fanerPanel.skiftTilFane(2);
  }//GEN-LAST:event_jButtonVidereActionPerformed

  private void jButton1KrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1KrActionPerformed
		Billetautomat automat = fanerPanel.getAutomatlogik();
		automat.indsætPenge(1);
		jLabelBalance.setText("1 kr indkastet. Balance er nu på "+automat.getBalance()+" kr.");
  }//GEN-LAST:event_jButton1KrActionPerformed

  private void jButton10krActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10krActionPerformed
		Billetautomat automat = fanerPanel.getAutomatlogik();
		automat.indsætPenge(10);
		jLabelBalance.setText("10 kr indkastet. Balance er nu på "+automat.getBalance()+" kr.");
  }//GEN-LAST:event_jButton10krActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton10kr;
  private javax.swing.JButton jButton1Kr;
  private javax.swing.JButton jButtonTilbage;
  private javax.swing.JButton jButtonVidere;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabelBalance;
  // End of variables declaration//GEN-END:variables
}
