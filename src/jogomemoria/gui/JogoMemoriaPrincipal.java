/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import java.awt.Component;
import jogomemoria.control.JogoMemoriaCtrl;

/**
 *
 * @author isamo
 */
public class JogoMemoriaPrincipal extends javax.swing.JFrame {

    private JogoMemoriaJtabuleiro tb = new JogoMemoriaJtabuleiro();
    private JogoMemoriaJPanelDificil jpd = new JogoMemoriaJPanelDificil();
    private JogoMemoriaJPanelFacil jpf = new JogoMemoriaJPanelFacil();
    private JogoMemoriaJPanelMedio jpm = new JogoMemoriaJPanelMedio();
    JogoMemoriaCtrl controle = new JogoMemoriaCtrl();

    public JogoMemoriaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sppPrincipal = new javax.swing.JSplitPane();
        pnlPrincipal = new javax.swing.JPanel();
        lblTempo = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        cmbNivel = new javax.swing.JComboBox();
        cgTempo = new javax.swing.JSpinner();
        bntIniciar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pnlPrincipal2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sppPrincipal.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        pnlPrincipal.setBackground(new java.awt.Color(0, 255, 255));

        lblTempo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTempo.setText("Tempo");

        lblNivel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNivel.setText("Nível");

        cmbNivel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fácil", "Intermediário", "Difícil" }));
        cmbNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelActionPerformed(evt);
            }
        });

        cgTempo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        bntIniciar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bntIniciar.setText("Iniciar");
        bntIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntIniciarMouseClicked(evt);
            }
        });
        bntIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntIniciarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cgTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(573, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cgTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        sppPrincipal.setLeftComponent(pnlPrincipal);

        pnlPrincipal2.setBackground(new java.awt.Color(0, 255, 255));

        lblImage.setText("jLabel1");

        javax.swing.GroupLayout pnlPrincipal2Layout = new javax.swing.GroupLayout(pnlPrincipal2);
        pnlPrincipal2.setLayout(pnlPrincipal2Layout);
        pnlPrincipal2Layout.setHorizontalGroup(
            pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipal2Layout.createSequentialGroup()
                .addContainerGap(444, Short.MAX_VALUE)
                .addComponent(lblImage)
                .addGap(435, 435, 435))
        );
        pnlPrincipal2Layout.setVerticalGroup(
            pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblImage)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        sppPrincipal.setRightComponent(pnlPrincipal2);

        getContentPane().add(sppPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIniciarActionPerformed
        String op = (String) cmbNivel.getSelectedItem();
        if (op.equals("Fácil")) {
            tb.getSPPTabuleiro().setLeftComponent(jpf);
            this.setSize(500, 500);
        }
        if (op.equals("Intermediário")) {
            tb.getSPPTabuleiro().setLeftComponent(jpm);
        }
        if (op.equals("Difícil")) {
            tb.getSPPTabuleiro().setLeftComponent(jpd);
        }
        sppPrincipal.setRightComponent(tb);
        this.repaint();
    }//GEN-LAST:event_bntIniciarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bntIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntIniciarMouseClicked
        int nivelS = Integer.parseInt((String) cmbNivel.getSelectedItem());

        int tempoL = (((Integer) cgTempo.getValue()).intValue());

        //int tempoL = ((int)cgTempo.getComponentCount());
        controle.iniciarPartida(nivelS, tempoL);
    }//GEN-LAST:event_bntIniciarMouseClicked

    private void cmbNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNivelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoMemoriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoMemoriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoMemoriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoMemoriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoMemoriaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntIniciar;
    private javax.swing.JSpinner cgTempo;
    private javax.swing.JComboBox cmbNivel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlPrincipal2;
    private javax.swing.JSplitPane sppPrincipal;
    // End of variables declaration//GEN-END:variables
}
