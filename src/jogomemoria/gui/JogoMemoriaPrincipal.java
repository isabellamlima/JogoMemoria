/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jogomemoria.control.JogoMemoriaCtrl;
import jogomemoria.model.PecaTabuleiro;

/**
 *
 * @author isamo
 */
public class JogoMemoriaPrincipal extends javax.swing.JFrame {

    private JogoMemoriaJtabuleiro tb = new JogoMemoriaJtabuleiro();
    private JogoMemoriaJPanelDificil jpd = new JogoMemoriaJPanelDificil();
    private JogoMemoriaJPanelFacil jpf;
    private JogoMemoriaJPanelIntermediario jpi = new JogoMemoriaJPanelIntermediario();
    private JogoMemoriaCtrl controle;

    public JogoMemoriaPrincipal() {
        initComponents();
        controle = new JogoMemoriaCtrl();
        jpf = new JogoMemoriaJPanelFacil(controle);
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
                .addContainerGap(491, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sppPrincipal.setLeftComponent(pnlPrincipal);

        pnlPrincipal2.setBackground(new java.awt.Color(0, 255, 255));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/capa.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlPrincipal2Layout = new javax.swing.GroupLayout(pnlPrincipal2);
        pnlPrincipal2.setLayout(pnlPrincipal2Layout);
        pnlPrincipal2Layout.setHorizontalGroup(
            pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lblImage)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        pnlPrincipal2Layout.setVerticalGroup(
            pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblImage)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        sppPrincipal.setRightComponent(pnlPrincipal2);

        getContentPane().add(sppPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIniciarActionPerformed
        int nivelS = 0;
        String op = (String) cmbNivel.getSelectedItem();
        if (op.equals("Fácil")) {
            nivelS = controle.FACIL;

        }
        if (op.equals("Intermediário")) {
            nivelS = controle.INTERMEDIARIO;
        }
        if (op.equals("Difícil")) {
            nivelS = controle.DIFICIL;
        }
        int tempoL = (((Integer) cgTempo.getValue()).intValue());
        sppPrincipal.setRightComponent(tb);
        this.repaint();
        controle.iniciarPartida(nivelS, tempoL);

        mostrarTabuleiro(true);
        int resp = JOptionPane.showConfirmDialog(this, "O jogo pode ser iniciado?", "Confirme inicio", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION){
            mostrarTabuleiro(false);
        }
        
    }//GEN-LAST:event_bntIniciarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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

    public void mostrarTabuleiro(boolean inicioJogo) {
        int nivelA = controle.getNivelAtual();
        PecaTabuleiro pctb[][] = controle.getTabuleiro();
        int idImg;
        ImageIcon imgDuvida = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"));

        if (controle.getNivelAtual() == 0) {
            if (controle.FACIL == nivelA) {
                tb.getsppTabuleiro().setLeftComponent(jpf);
                this.setSize(800, 600);
                jpf.mostrar(inicioJogo);
            }

            //}
            //if (controle.INTERMEDIARIO == nivelA) {
            //tb.getSPPTabuleiro().setLeftComponent(jpi);
            //}
            //if (controle.DIFICIL == nivelA) {
            //tb.getSPPTabuleiro().setLeftComponent(jpd);
            //}
            //}
            //}
            if (controle.getNivelAtual() == controle.INTERMEDIARIO) {

                if (inicioJogo || pctb[0][0].isVirado()) {
                    idImg = pctb[0][0].getIdImagem();
                    ImageIcon img00 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg00()).setIcon(img00);
                } else {
                    (jpi.getLblImg00()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[0][1].isVirado()) {
                    idImg = pctb[0][1].getIdImagem();
                    ImageIcon img01 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg01()).setIcon(img01);
                } else {
                    (jpi.getLblImg01()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[0][2].isVirado()) {
                    idImg = pctb[0][2].getIdImagem();
                    ImageIcon img02 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg02()).setIcon(img02);
                } else {
                    (jpi.getLblImg02()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[0][3].isVirado()) {
                    idImg = pctb[0][3].getIdImagem();
                    ImageIcon img03 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg03()).setIcon(img03);
                } else {
                    (jpi.getLblImg03()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[0][4].isVirado()) {
                    idImg = pctb[0][4].getIdImagem();
                    ImageIcon img04 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg04()).setIcon(img04);
                } else {
                    (jpi.getLblImg04()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[0][5].isVirado()) {
                    idImg = pctb[0][5].getIdImagem();
                    ImageIcon img05 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg05()).setIcon(img05);
                } else {
                    (jpi.getLblImg05()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[1][0].isVirado()) {
                    idImg = pctb[1][0].getIdImagem();
                    ImageIcon img10 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg10()).setIcon(img10);
                } else {
                    (jpi.getLblImg10()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[1][1].isVirado()) {
                    idImg = pctb[1][1].getIdImagem();
                    ImageIcon img11 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg11()).setIcon(img11);
                } else {
                    (jpi.getLblImg11()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[1][2].isVirado()) {
                    idImg = pctb[1][2].getIdImagem();
                    ImageIcon img12 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg12()).setIcon(img12);
                } else {
                    (jpi.getLblImg12()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[1][3].isVirado()) {
                    idImg = pctb[1][3].getIdImagem();
                    ImageIcon img13 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg13()).setIcon(img13);
                } else {
                    (jpi.getLblImg13()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[1][4].isVirado()) {
                    idImg = pctb[1][4].getIdImagem();
                    ImageIcon img14 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg14()).setIcon(img14);
                } else {
                    (jpi.getLblImg14()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[1][5].isVirado()) {
                    idImg = pctb[1][5].getIdImagem();
                    ImageIcon img15 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg15()).setIcon(img15);
                } else {
                    (jpi.getLblImg15()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[2][0].isVirado()) {
                    idImg = pctb[2][0].getIdImagem();
                    ImageIcon img20 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg20()).setIcon(img20);
                } else {
                    (jpi.getLblImg20()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[2][1].isVirado()) {
                    idImg = pctb[2][1].getIdImagem();
                    ImageIcon img21 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg21()).setIcon(img21);
                } else {
                    (jpi.getLblImg21()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[2][2].isVirado()) {
                    idImg = pctb[2][2].getIdImagem();
                    ImageIcon img22 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg22()).setIcon(img22);
                } else {
                    (jpi.getLblImg22()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[2][3].isVirado()) {
                    idImg = pctb[2][3].getIdImagem();
                    ImageIcon img23 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg23()).setIcon(img23);
                } else {
                    (jpi.getLblImg23()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[2][4].isVirado()) {
                    idImg = pctb[2][4].getIdImagem();
                    ImageIcon img24 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg24()).setIcon(img24);
                } else {
                    (jpi.getLblImg24()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[2][5].isVirado()) {
                    idImg = pctb[2][5].getIdImagem();
                    ImageIcon img25 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg25()).setIcon(img25);
                } else {
                    (jpi.getLblImg25()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][0].isVirado()) {
                    idImg = pctb[3][0].getIdImagem();
                    ImageIcon img30 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg30()).setIcon(img30);
                } else {
                    (jpi.getLblImg30()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][1].isVirado()) {
                    idImg = pctb[3][1].getIdImagem();
                    ImageIcon img31 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg31()).setIcon(img31);
                } else {
                    (jpi.getLblImg31()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][2].isVirado()) {
                    idImg = pctb[3][2].getIdImagem();
                    ImageIcon img32 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg32()).setIcon(img32);
                } else {
                    (jpi.getLblImg32()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][3].isVirado()) {
                    idImg = pctb[3][3].getIdImagem();
                    ImageIcon img33 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg33()).setIcon(img33);
                } else {
                    (jpi.getLblImg33()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][4].isVirado()) {
                    idImg = pctb[3][4].getIdImagem();
                    ImageIcon img34 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg34()).setIcon(img34);
                } else {
                    (jpi.getLblImg34()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][5].isVirado()) {
                    idImg = pctb[3][5].getIdImagem();
                    ImageIcon img35 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg35()).setIcon(img35);
                } else {
                    (jpi.getLblImg35()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[4][0].isVirado()) {
                    idImg = pctb[4][0].getIdImagem();
                    ImageIcon img40 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg40()).setIcon(img40);
                } else {
                    (jpi.getLblImg40()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[4][1].isVirado()) {
                    idImg = pctb[4][1].getIdImagem();
                    ImageIcon img41 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg41()).setIcon(img41);
                } else {
                    (jpi.getLblImg41()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[4][2].isVirado()) {
                    idImg = pctb[4][2].getIdImagem();
                    ImageIcon img42 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg42()).setIcon(img42);
                } else {
                    (jpi.getLblImg42()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[4][3].isVirado()) {
                    idImg = pctb[4][3].getIdImagem();
                    ImageIcon img43 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg43()).setIcon(img43);
                } else {
                    (jpi.getLblImg43()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[4][4].isVirado()) {
                    idImg = pctb[4][4].getIdImagem();
                    ImageIcon img44 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg44()).setIcon(img44);
                } else {
                    (jpi.getLblImg44()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[4][5].isVirado()) {
                    idImg = pctb[4][5].getIdImagem();
                    ImageIcon img45 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg45()).setIcon(img45);
                } else {
                    (jpi.getLblImg45()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][0].isVirado()) {
                    idImg = pctb[5][0].getIdImagem();
                    ImageIcon img50 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg50()).setIcon(img50);
                } else {
                    (jpi.getLblImg50()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][1].isVirado()) {
                    idImg = pctb[5][1].getIdImagem();
                    ImageIcon img51 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg51()).setIcon(img51);
                } else {
                    (jpi.getLblImg51()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][2].isVirado()) {
                    idImg = pctb[5][2].getIdImagem();
                    ImageIcon img52 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg52()).setIcon(img52);
                } else {
                    (jpi.getLblImg52()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][3].isVirado()) {
                    idImg = pctb[5][3].getIdImagem();
                    ImageIcon img53 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg53()).setIcon(img53);
                } else {
                    (jpi.getLblImg53()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][4].isVirado()) {
                    idImg = pctb[5][4].getIdImagem();
                    ImageIcon img54 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg54()).setIcon(img54);
                } else {
                    (jpi.getLblImg54()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][5].isVirado()) {
                    idImg = pctb[5][5].getIdImagem();
                    ImageIcon img55 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpi.getLblImg55()).setIcon(img55);
                } else {
                    (jpi.getLblImg55()).setIcon(imgDuvida);
                }

                sppPrincipal.setRightComponent(jpi);
                this.setSize(1024, 768);
            }
            if (controle.getNivelAtual() == controle.DIFICIL) {

                if (inicioJogo || pctb[0][0].isVirado()) {
                    idImg = pctb[0][0].getIdImagem();
                    ImageIcon img00 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg00()).setIcon(img00);
                } else {
                    (jpd.getLblImg00()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[0][1].isVirado()) {
                    idImg = pctb[0][1].getIdImagem();
                    ImageIcon img01 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg01()).setIcon(img01);
                } else {
                    (jpd.getLblImg01()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[0][2].isVirado()) {
                    idImg = pctb[0][2].getIdImagem();
                    ImageIcon img02 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg02()).setIcon(img02);
                } else {
                    (jpd.getLblImg02()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[0][3].isVirado()) {
                    idImg = pctb[0][3].getIdImagem();
                    ImageIcon img03 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg03()).setIcon(img03);
                } else {
                    (jpd.getLblImg03()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[0][4].isVirado()) {
                    idImg = pctb[0][4].getIdImagem();
                    ImageIcon img04 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg04()).setIcon(img04);
                } else {
                    (jpd.getLblImg04()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[0][5].isVirado()) {
                    idImg = pctb[0][5].getIdImagem();
                    ImageIcon img05 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg05()).setIcon(img05);
                } else {
                    (jpd.getLblImg05()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[0][6].isVirado()) {
                    idImg = pctb[0][6].getIdImagem();
                    ImageIcon img06 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg06()).setIcon(img06);
                } else {
                    (jpd.getLblImg06()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[0][7].isVirado()) {
                    idImg = pctb[0][7].getIdImagem();
                    ImageIcon img07 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg07()).setIcon(img07);
                } else {
                    (jpd.getLblImg07()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[1][0].isVirado()) {
                    idImg = pctb[1][0].getIdImagem();
                    ImageIcon img10 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg10()).setIcon(img10);
                } else {
                    (jpd.getLblImg10()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[1][1].isVirado()) {
                    idImg = pctb[1][1].getIdImagem();
                    ImageIcon img11 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg11()).setIcon(img11);
                } else {
                    (jpd.getLblImg11()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[1][2].isVirado()) {
                    idImg = pctb[1][2].getIdImagem();
                    ImageIcon img12 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg12()).setIcon(img12);
                } else {
                    (jpd.getLblImg12()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[1][3].isVirado()) {
                    idImg = pctb[1][3].getIdImagem();
                    ImageIcon img13 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg13()).setIcon(img13);
                } else {
                    (jpd.getLblImg13()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[1][4].isVirado()) {
                    idImg = pctb[1][4].getIdImagem();
                    ImageIcon img14 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg14()).setIcon(img14);
                } else {
                    (jpd.getLblImg14()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[1][5].isVirado()) {
                    idImg = pctb[1][5].getIdImagem();
                    ImageIcon img15 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg15()).setIcon(img15);
                } else {
                    (jpd.getLblImg15()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[1][6].isVirado()) {
                    idImg = pctb[1][6].getIdImagem();
                    ImageIcon img16 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg16()).setIcon(img16);
                } else {
                    (jpd.getLblImg16()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[1][7].isVirado()) {
                    idImg = pctb[1][7].getIdImagem();
                    ImageIcon img17 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg17()).setIcon(img17);
                } else {
                    (jpd.getLblImg17()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[2][0].isVirado()) {
                    idImg = pctb[2][0].getIdImagem();
                    ImageIcon img20 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg20()).setIcon(img20);
                } else {
                    (jpd.getLblImg20()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[2][1].isVirado()) {
                    idImg = pctb[2][1].getIdImagem();
                    ImageIcon img21 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg21()).setIcon(img21);
                } else {
                    (jpd.getLblImg21()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[2][2].isVirado()) {
                    idImg = pctb[2][2].getIdImagem();
                    ImageIcon img22 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg22()).setIcon(img22);
                } else {
                    (jpd.getLblImg22()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[2][3].isVirado()) {
                    idImg = pctb[2][3].getIdImagem();
                    ImageIcon img23 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg23()).setIcon(img23);
                } else {
                    (jpd.getLblImg23()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[2][4].isVirado()) {
                    idImg = pctb[2][4].getIdImagem();
                    ImageIcon img24 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg24()).setIcon(img24);
                } else {
                    (jpd.getLblImg24()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[2][5].isVirado()) {
                    idImg = pctb[2][5].getIdImagem();
                    ImageIcon img25 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg25()).setIcon(img25);
                } else {
                    (jpd.getLblImg25()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[2][6].isVirado()) {
                    idImg = pctb[2][6].getIdImagem();
                    ImageIcon img26 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg26()).setIcon(img26);
                } else {
                    (jpd.getLblImg26()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[2][7].isVirado()) {
                    idImg = pctb[2][7].getIdImagem();
                    ImageIcon img27 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg27()).setIcon(img27);
                } else {
                    (jpd.getLblImg27()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][0].isVirado()) {
                    idImg = pctb[3][0].getIdImagem();
                    ImageIcon img30 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg30()).setIcon(img30);
                } else {
                    (jpd.getLblImg30()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][1].isVirado()) {
                    idImg = pctb[3][1].getIdImagem();
                    ImageIcon img31 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg31()).setIcon(img31);
                } else {
                    (jpd.getLblImg31()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][2].isVirado()) {
                    idImg = pctb[3][2].getIdImagem();
                    ImageIcon img32 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg32()).setIcon(img32);
                } else {
                    (jpd.getLblImg32()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][3].isVirado()) {
                    idImg = pctb[3][3].getIdImagem();
                    ImageIcon img33 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg33()).setIcon(img33);
                } else {
                    (jpd.getLblImg33()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][4].isVirado()) {
                    idImg = pctb[3][4].getIdImagem();
                    ImageIcon img34 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg34()).setIcon(img34);
                } else {
                    (jpd.getLblImg34()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][5].isVirado()) {
                    idImg = pctb[3][5].getIdImagem();
                    ImageIcon img35 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg35()).setIcon(img35);
                } else {
                    (jpd.getLblImg35()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][6].isVirado()) {
                    idImg = pctb[3][6].getIdImagem();
                    ImageIcon img36 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg36()).setIcon(img36);
                } else {
                    (jpd.getLblImg36()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[3][7].isVirado()) {
                    idImg = pctb[3][7].getIdImagem();
                    ImageIcon img37 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg37()).setIcon(img37);
                } else {
                    (jpd.getLblImg37()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[4][0].isVirado()) {
                    idImg = pctb[4][0].getIdImagem();
                    ImageIcon img40 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg40()).setIcon(img40);
                } else {
                    (jpd.getLblImg40()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[4][1].isVirado()) {
                    idImg = pctb[4][1].getIdImagem();
                    ImageIcon img41 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg41()).setIcon(img41);
                } else {
                    (jpd.getLblImg41()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[4][2].isVirado()) {
                    idImg = pctb[4][2].getIdImagem();
                    ImageIcon img42 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg42()).setIcon(img42);
                } else {
                    (jpd.getLblImg42()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[4][3].isVirado()) {
                    idImg = pctb[4][3].getIdImagem();
                    ImageIcon img43 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg43()).setIcon(img43);
                } else {
                    (jpd.getLblImg43()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[4][4].isVirado()) {
                    idImg = pctb[4][4].getIdImagem();
                    ImageIcon img44 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg44()).setIcon(img44);
                } else {
                    (jpd.getLblImg44()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[4][5].isVirado()) {
                    idImg = pctb[4][5].getIdImagem();
                    ImageIcon img45 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg45()).setIcon(img45);
                } else {
                    (jpd.getLblImg45()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[4][6].isVirado()) {
                    idImg = pctb[4][6].getIdImagem();
                    ImageIcon img46 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg46()).setIcon(img46);
                } else {
                    (jpd.getLblImg46()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[4][7].isVirado()) {
                    idImg = pctb[4][7].getIdImagem();
                    ImageIcon img47 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg47()).setIcon(img47);
                } else {
                    (jpd.getLblImg47()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][0].isVirado()) {
                    idImg = pctb[5][0].getIdImagem();
                    ImageIcon img50 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg50()).setIcon(img50);
                } else {
                    (jpd.getLblImg50()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][1].isVirado()) {
                    idImg = pctb[5][1].getIdImagem();
                    ImageIcon img51 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg51()).setIcon(img51);
                } else {
                    (jpd.getLblImg51()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][2].isVirado()) {
                    idImg = pctb[5][2].getIdImagem();
                    ImageIcon img52 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg52()).setIcon(img52);
                } else {
                    (jpd.getLblImg52()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][3].isVirado()) {
                    idImg = pctb[5][3].getIdImagem();
                    ImageIcon img53 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg53()).setIcon(img53);
                } else {
                    (jpd.getLblImg53()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][4].isVirado()) {
                    idImg = pctb[5][4].getIdImagem();
                    ImageIcon img54 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg54()).setIcon(img54);
                } else {
                    (jpd.getLblImg54()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][5].isVirado()) {
                    idImg = pctb[5][5].getIdImagem();
                    ImageIcon img55 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg55()).setIcon(img55);
                } else {
                    (jpd.getLblImg55()).setIcon(imgDuvida);
                }

                if (inicioJogo || pctb[5][6].isVirado()) {
                    idImg = pctb[5][6].getIdImagem();
                    ImageIcon img56 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg56()).setIcon(img56);
                } else {
                    (jpd.getLblImg56()).setIcon(imgDuvida);
                }
                if (inicioJogo || pctb[5][7].isVirado()) {
                    idImg = pctb[5][7].getIdImagem();
                    ImageIcon img57 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
                    (jpd.getLblImg57()).setIcon(img57);
                } else {
                    (jpd.getLblImg57()).setIcon(imgDuvida);
                }

                sppPrincipal.setRightComponent(jpd);
                this.setSize(1600, 980);
            }
        }
    }
}
