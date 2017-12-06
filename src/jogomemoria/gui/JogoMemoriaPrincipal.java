/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import javax.swing.JFrame;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jogomemoria.control.JogoMemoriaCtrl;
import jogomemoria.gui.sons.Sound;
import jogomemoria.model.PecaTabuleiro;

/**
 *
 * @author isamo
 */
public class JogoMemoriaPrincipal extends javax.swing.JFrame {

    private JogoMemoriaTabuleiro tb = new JogoMemoriaTabuleiro();
    private JogoMemoriaJPanelDificil jpd;
    private JogoMemoriaJPanelFacil jpf;
    private JogoMemoriaJPanelIntermediario jpi;
    private JogoMemoriaCtrl controle;

    public JogoMemoriaPrincipal() {
        initComponents();
        controle = new JogoMemoriaCtrl();
        jpf = new JogoMemoriaJPanelFacil(controle, tb.getPainelInfo());
        jpi = new JogoMemoriaJPanelIntermediario(controle, tb.getPainelInfo());
        jpd = new JogoMemoriaJPanelDificil(controle, tb.getPainelInfo());
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
        bntCancelar = new javax.swing.JButton();
        lblFig1 = new javax.swing.JLabel();
        lblFig2 = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sppPrincipal.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        pnlPrincipal.setBackground(new java.awt.Color(204, 255, 204));

        lblTempo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblTempo.setText("Tempo");

        lblNivel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblNivel.setText("Nível");

        cmbNivel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fácil", "Intermediário", "Difícil" }));
        cmbNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelActionPerformed(evt);
            }
        });

        cgTempo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        bntIniciar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bntIniciar.setText("Iniciar");
        bntIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntIniciarActionPerformed(evt);
            }
        });

        bntCancelar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bntCancelar.setText("Cancelar");
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        lblFig1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblFig1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/pri.png"))); // NOI18N

        lblFig2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblFig2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/pri2.png"))); // NOI18N

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFig1)
                .addGap(31, 31, 31)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cgTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCancelar))
                .addGap(53, 53, 53)
                .addComponent(lblFig2)
                .addGap(23, 23, 23))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFig2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFig1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cgTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        sppPrincipal.setLeftComponent(pnlPrincipal);

        pnlTitulo.setBackground(new java.awt.Color(204, 255, 204));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/capa.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(lblImage)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblImage)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        sppPrincipal.setRightComponent(pnlTitulo);

        getContentPane().add(sppPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIniciarActionPerformed
        String item = (String) cmbNivel.getSelectedItem();
        int nivelS = 0;

        //
        if (item.equals("Fácil")) {
            nivelS = controle.FACIL;
            tb.mostrarTabuleiro(jpf);
            //tb.setSize(800,600);
        }
        if (item.equals("Intermediário")) {
            nivelS = controle.INTERMEDIARIO;
            tb.mostrarTabuleiro(jpi);
            //tb.setSize(6024, 1024);
        }
        if (item.equals("Difícil")) {
            nivelS = controle.DIFICIL;
            tb.mostrarTabuleiro(jpd);
        }
        int tempoL = (((Integer) cgTempo.getValue()).intValue());
        sppPrincipal.setRightComponent(tb);
   
        controle.iniciarPartida(nivelS, tempoL);
        mostrarTabuleiro(true);
        int resp = JOptionPane.showConfirmDialog(this, "O jogo pode ser iniciado?", "Confirme inicio", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            Sound.INICIO.play();
            mostrarTabuleiro(false);
             //Sound.INICIO.play();
        } else {
            sppPrincipal.setRightComponent(pnlTitulo);
        }

    }//GEN-LAST:event_bntIniciarActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        sppPrincipal.setRightComponent(pnlTitulo);
        controle.encerrarJogo();
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void cmbNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNivelActionPerformed

      public void mostrarTabuleiro(boolean inicioJogo) {
        PecaTabuleiro pctb[][] = controle.getTabuleiro();
        int idImg;
        ImageIcon imgDuvida = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"));

        int nivelA = controle.getNivelAtual();
        if (controle.FACIL == nivelA) {
            tb.getSppTabuleiro().setLeftComponent(jpf);
            //this.setSize(800, 600);
            jpf.mostrar(inicioJogo);
        }
        if (controle.INTERMEDIARIO == nivelA) {
            tb.getSppTabuleiro().setLeftComponent(jpi);
            //this.setSize(6024, 1068);
            jpi.mostrar(inicioJogo);
        }

        if (controle.DIFICIL == nivelA) {
            tb.getSppTabuleiro().setLeftComponent(jpd);
            //this.setSize(800, 600);
            jpd.mostrar(inicioJogo);
        }

        sppPrincipal.setRightComponent(tb);
        this.repaint();
    }
      
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
    
    public void JogoEncerrado(){
        int resp = JOptionPane.showConfirmDialog(this, "O jogo pode ser iniciado?", "Confirme inicio", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            Sound.INICIO.play();
            mostrarTabuleiro(false);
             //Sound.INICIO.play();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntIniciar;
    private javax.swing.JSpinner cgTempo;
    private javax.swing.JComboBox cmbNivel;
    private javax.swing.JLabel lblFig1;
    private javax.swing.JLabel lblFig2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JSplitPane sppPrincipal;
    // End of variables declaration//GEN-END:variables

}

