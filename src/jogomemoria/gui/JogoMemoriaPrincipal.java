/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import java.awt.Component;

/**
 *
 * @author isamo
 */
public class JogoMemoriaPrincipal extends javax.swing.JFrame {

    private JogoMemoriaJPanelDificil jpd=new JogoMemoriaJPanelDificil();
    private JogoMemoriaJPanelFacil jpf=new JogoMemoriaJPanelFacil();
    private JogoMemoriaJPanelMedio jpm=new JogoMemoriaJPanelMedio();
    
    public JogoMemoriaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sppPrincipal = new javax.swing.JSplitPane();
        pnlPrincipal = new javax.swing.JPanel();
        lblTempo = new javax.swing.JLabel();
        cmbNivel = new javax.swing.JComboBox<String>();
        lblNivel = new javax.swing.JLabel();
        bntIniciar = new javax.swing.JButton();
        spnTempo = new javax.swing.JSpinner();
        pnlPrincipal2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sppPrincipal.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        lblTempo.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblTempo.setText("Tempo");

        cmbNivel.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fácil", "Intermediário", "Difícil" }));

        lblNivel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblNivel.setText("Nível");

        bntIniciar.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        bntIniciar.setText("Iniciar");
        bntIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntIniciarActionPerformed(evt);
            }
        });

        spnTempo.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTempo)
                .addGap(18, 18, 18)
                .addComponent(spnTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lblNivel)
                .addGap(18, 18, 18)
                .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                .addComponent(bntIniciar)
                .addGap(57, 57, 57))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempo)
                    .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNivel)
                    .addComponent(spnTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntIniciar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sppPrincipal.setLeftComponent(pnlPrincipal);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/capa.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlPrincipal2Layout = new javax.swing.GroupLayout(pnlPrincipal2);
        pnlPrincipal2.setLayout(pnlPrincipal2Layout);
        pnlPrincipal2Layout.setHorizontalGroup(
            pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(lblImage)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        pnlPrincipal2Layout.setVerticalGroup(
            pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblImage)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        sppPrincipal.setRightComponent(pnlPrincipal2);

        getContentPane().add(sppPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIniciarActionPerformed
        String op = (String) cmbNivel.getSelectedItem();
            if (op.equals("Fácil")) {
                sppPrincipal.setRightComponent(jpf);
                 this.setSize(600, 600);
            }
            if (((String) cmbNivel.getSelectedItem()).equals("Intermediário")) 
                sppPrincipal.setRightComponent(jpm);
            if (op.equals("Difícil")) 
                sppPrincipal.setRightComponent(jpd);
            
            this.repaint();
    }//GEN-LAST:event_bntIniciarActionPerformed

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
    private javax.swing.JComboBox<String> cmbNivel;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlPrincipal2;
    private javax.swing.JSpinner spnTempo;
    private javax.swing.JSplitPane sppPrincipal;
    // End of variables declaration//GEN-END:variables
}
