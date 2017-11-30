/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import jogomemoria.control.JogoMemoriaCtrl;
import jogomemoria.model.PecaTabuleiro;

/**
 *
 * @author Aluno
 */
public class JogoMemoriaJPanelFacil extends javax.swing.JPanel {

    private JogoMemoriaCtrl controle;

    PecaTabuleiro ptSel1;
    PecaTabuleiro ptSel2;
    int pecasSelecionadas = 0;

    /**
     * Creates new form JogoMemoriaJPanelFacil
     */
    public JogoMemoriaJPanelFacil(JogoMemoriaCtrl ctrl) {
        initComponents();
        controle = ctrl;
    }

    public void mostrar(boolean inicioJogo) {

        PecaTabuleiro pctb[][] = controle.getTabuleiro();
        int idImg;
        ImageIcon imgDuvida = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"));

        if (inicioJogo || pctb[0][0].isVirado()) {
            idImg = pctb[0][0].getIdImagem();
            ImageIcon img00 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg00()).setIcon(img00);
        } else {
            (getLblImg00()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][1].isVirado()) {
            idImg = pctb[0][1].getIdImagem();
            ImageIcon img01 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg01()).setIcon(img01);
        } else {
            (getLblImg01()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[0][2].isVirado()) {
            idImg = pctb[0][2].getIdImagem();
            ImageIcon img02 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg02()).setIcon(img02);
        } else {
            (getLblImg02()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][3].isVirado()) {
            idImg = pctb[0][3].getIdImagem();
            ImageIcon img03 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg03()).setIcon(img03);
        } else {
            (getLblImg03()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][0].isVirado()) {
            idImg = pctb[1][0].getIdImagem();
            ImageIcon img10 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg10()).setIcon(img10);
        } else {
            (getLblImg10()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][1].isVirado()) {
            idImg = pctb[1][1].getIdImagem();
            ImageIcon img11 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg11()).setIcon(img11);
        } else {
            (getLblImg11()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][2].isVirado()) {
            idImg = pctb[1][2].getIdImagem();
            ImageIcon img12 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg12()).setIcon(img12);
        } else {
            (getLblImg12()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][3].isVirado()) {
            idImg = pctb[1][3].getIdImagem();
            ImageIcon img13 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg13()).setIcon(img13);
        } else {
            (getLblImg13()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][0].isVirado()) {
            idImg = pctb[2][0].getIdImagem();
            ImageIcon img20 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg20()).setIcon(img20);
        } else {
            (getLblImg20()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][1].isVirado()) {
            idImg = pctb[2][1].getIdImagem();
            ImageIcon img21 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg21()).setIcon(img21);
        } else {
            (getLblImg21()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][2].isVirado()) {
            idImg = pctb[2][2].getIdImagem();
            ImageIcon img22 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg22()).setIcon(img22);
        } else {
            (getLblImg22()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][3].isVirado()) {
            idImg = pctb[2][3].getIdImagem();
            ImageIcon img23 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg23()).setIcon(img23);
        } else {
            (getLblImg23()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][0].isVirado()) {
            idImg = pctb[3][0].getIdImagem();
            ImageIcon img30 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg30()).setIcon(img30);
        } else {
            (getLblImg30()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][1].isVirado()) {
            idImg = pctb[3][1].getIdImagem();
            ImageIcon img31 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg31()).setIcon(img31);
        } else {
            (getLblImg31()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][2].isVirado()) {
            idImg = pctb[3][2].getIdImagem();
            ImageIcon img32 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg32()).setIcon(img32);
        } else {
            (getLblImg32()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][3].isVirado()) {
            idImg = pctb[3][3].getIdImagem();
            ImageIcon img33 = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
            (getLblImg33()).setIcon(img33);
        } else {
            (getLblImg33()).setIcon(imgDuvida);
        }
    }

    private void tentarJogada(int linha, int coluna, JLabel rotuloImagem) {
        PecaTabuleiro pt[][] = controle.getTabuleiro();

        int idImg = pt[linha][coluna].getIdImagem();
        ImageIcon img = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/JM" + idImg + ".jpg"));
        rotuloImagem.setIcon(img);

        if (pecasSelecionadas == 0) {
            ptSel1 = pt[linha][coluna];
            pecasSelecionadas++;
        } else if (pecasSelecionadas == 1) {
            ptSel2 = pt[linha][coluna];
            int result = controle.realizarJogada(ptSel1, ptSel2);
            if (result == controle.JOGADA_CERTA) {
                JOptionPane.showMessageDialog(this, "Muito Bem!!!", "Resultado da Jogada", JOptionPane.INFORMATION_MESSAGE);
            } else if (result == controle.JOGADA_ERRADA) {
                JOptionPane.showMessageDialog(this, "Voce errou. Tente novamente", "Resultado da jogada", JOptionPane.INFORMATION_MESSAGE);
            } else if (result == controle.JOGADA_INVALIDA) {
                JOptionPane.showMessageDialog(this, "Isso nao vale!", "Resultado da jogada", JOptionPane.ERROR_MESSAGE);
            }
            pecasSelecionadas = 0;
            mostrar(false);
        }
    }

    //List<String> caminhoImagens = Arrays.asList("JM1.jpg", "JM2.jpg", "JM3.jpg", "JM4.jpg", "JM5.jpg", "JM6.jpg", "JM7.jpg", "JM8.png");
//   // Set<Integer> sorteados = new TreeSet<Integer>();
//
//    public int sorteio() {
//        Random img = new Random();
//        final int ter = 7;
//        final int com = 0;
//        int result;
//        do {
//            result = img.nextInt(ter + 1) + com;
//        } while (!sorteados.add(Integer.valueOf(result)));
//
//        return result;
//    }
    @SuppressWarnings("unchecked")

    // public String sorteioDeImagem() {
    // return new Random().nextInt(caminhoImagens.size());
    //}
    //// COPIEI DO LUCAS /////////////////////////////////////////////////////////
    //public void trocaIMG() {
    //ImageIcon novaIMG = new ImageIcon(getClass().getResource("/imagens/JM1.jpg"));
    //getLblImg1().setIcon(novaIMG);
    //}
    ///////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        LblImg00 = new javax.swing.JLabel();
        LblImg02 = new javax.swing.JLabel();
        LblImg01 = new javax.swing.JLabel();
        LblImg10 = new javax.swing.JLabel();
        LblImg03 = new javax.swing.JLabel();
        LblImg11 = new javax.swing.JLabel();
        LblImg13 = new javax.swing.JLabel();
        LblImg12 = new javax.swing.JLabel();
        LblImg22 = new javax.swing.JLabel();
        LblImg21 = new javax.swing.JLabel();
        LblImg30 = new javax.swing.JLabel();
        LblImg23 = new javax.swing.JLabel();
        LblImg31 = new javax.swing.JLabel();
        LblImg33 = new javax.swing.JLabel();
        LblImg32 = new javax.swing.JLabel();
        LblImg20 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblTitulo.setText("Jogo da Mem�ria");

        lblTime.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 0, 0));
        lblTime.setText("Last Time");

        LblImg00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg00MouseClicked(evt);
            }
        });

        LblImg02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg02MouseClicked(evt);
            }
        });

        LblImg01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg01MouseClicked(evt);
            }
        });

        LblImg10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg10MouseClicked(evt);
            }
        });

        LblImg03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg03MouseClicked(evt);
            }
        });

        LblImg11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg11MouseClicked(evt);
            }
        });

        LblImg13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg13MouseClicked(evt);
            }
        });

        LblImg12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg12MouseClicked(evt);
            }
        });

        LblImg22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg22MouseClicked(evt);
            }
        });

        LblImg21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg21MouseClicked(evt);
            }
        });

        LblImg30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg30MouseClicked(evt);
            }
        });

        LblImg23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg23MouseClicked(evt);
            }
        });

        LblImg31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg31MouseClicked(evt);
            }
        });

        LblImg33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg33MouseClicked(evt);
            }
        });

        LblImg32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg32MouseClicked(evt);
            }
        });

        LblImg20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N
        LblImg20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImg20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTime)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblImg00)
                        .addGap(18, 18, 18)
                        .addComponent(LblImg01)
                        .addGap(18, 18, 18)
                        .addComponent(LblImg02)
                        .addGap(18, 18, 18)
                        .addComponent(LblImg03))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblImg10)
                        .addGap(18, 18, 18)
                        .addComponent(LblImg11)
                        .addGap(18, 18, 18)
                        .addComponent(LblImg12)
                        .addGap(18, 18, 18)
                        .addComponent(LblImg13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblImg20)
                        .addGap(18, 18, 18)
                        .addComponent(LblImg21)
                        .addGap(18, 18, 18)
                        .addComponent(LblImg22)
                        .addGap(18, 18, 18)
                        .addComponent(LblImg23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblImg30)
                        .addGap(18, 18, 18)
                        .addComponent(LblImg31)
                        .addGap(18, 18, 18)
                        .addComponent(LblImg32)
                        .addGap(18, 18, 18)
                        .addComponent(LblImg33)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblImg01)
                    .addComponent(LblImg00)
                    .addComponent(LblImg02)
                    .addComponent(LblImg03))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblImg10)
                    .addComponent(LblImg11)
                    .addComponent(LblImg13)
                    .addComponent(LblImg12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblImg21)
                    .addComponent(LblImg20)
                    .addComponent(LblImg22)
                    .addComponent(LblImg23))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblImg30)
                    .addComponent(LblImg31)
                    .addComponent(LblImg33)
                    .addComponent(LblImg32))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LblImg00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg00MouseClicked
        tentarJogada(0, 0, LblImg00);
    }//GEN-LAST:event_LblImg00MouseClicked

    private void LblImg01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg01MouseClicked
        tentarJogada(0, 1, LblImg01);
    }//GEN-LAST:event_LblImg01MouseClicked

    private void LblImg02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg02MouseClicked
        tentarJogada(0, 2, LblImg02);
    }//GEN-LAST:event_LblImg02MouseClicked

    private void LblImg03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg03MouseClicked
        tentarJogada(0, 3, LblImg03);
    }//GEN-LAST:event_LblImg03MouseClicked

    private void LblImg10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg10MouseClicked
        tentarJogada(1, 0, LblImg10);
    }//GEN-LAST:event_LblImg10MouseClicked

    private void LblImg11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg11MouseClicked
        tentarJogada(1, 1, LblImg11);
    }//GEN-LAST:event_LblImg11MouseClicked

    private void LblImg12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg12MouseClicked
        tentarJogada(1, 2, LblImg12);
    }//GEN-LAST:event_LblImg12MouseClicked

    private void LblImg13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg13MouseClicked
        tentarJogada(1, 3, LblImg13);
    }//GEN-LAST:event_LblImg13MouseClicked

    private void LblImg20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg20MouseClicked
        tentarJogada(2, 0, LblImg20);
    }//GEN-LAST:event_LblImg20MouseClicked

    private void LblImg21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg21MouseClicked
        tentarJogada(2, 1, LblImg21);
    }//GEN-LAST:event_LblImg21MouseClicked

    private void LblImg22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg22MouseClicked
        tentarJogada(2, 2, LblImg22);
    }//GEN-LAST:event_LblImg22MouseClicked

    private void LblImg23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg23MouseClicked
        tentarJogada(2, 3, LblImg23);
    }//GEN-LAST:event_LblImg23MouseClicked

    private void LblImg30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg30MouseClicked
        tentarJogada(3, 0, LblImg30);
    }//GEN-LAST:event_LblImg30MouseClicked

    private void LblImg31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg31MouseClicked
        tentarJogada(3, 1, LblImg31);
    }//GEN-LAST:event_LblImg31MouseClicked

    private void LblImg32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg32MouseClicked
        tentarJogada(3, 2, LblImg32);
    }//GEN-LAST:event_LblImg32MouseClicked

    private void LblImg33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImg33MouseClicked
        tentarJogada(3, 3, LblImg33);
    }//GEN-LAST:event_LblImg33MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblImg00;
    private javax.swing.JLabel LblImg01;
    private javax.swing.JLabel LblImg02;
    private javax.swing.JLabel LblImg03;
    private javax.swing.JLabel LblImg10;
    private javax.swing.JLabel LblImg11;
    private javax.swing.JLabel LblImg12;
    private javax.swing.JLabel LblImg13;
    private javax.swing.JLabel LblImg20;
    private javax.swing.JLabel LblImg21;
    private javax.swing.JLabel LblImg22;
    private javax.swing.JLabel LblImg23;
    private javax.swing.JLabel LblImg30;
    private javax.swing.JLabel LblImg31;
    private javax.swing.JLabel LblImg32;
    private javax.swing.JLabel LblImg33;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JLabel getLblImg00() {
        return LblImg00;
    }

    /**
     * @param lblImg00 the lblImg00 to set
     */
    public void setLblImg00(javax.swing.JLabel lblImg00) {
        this.LblImg00 = lblImg00;
    }

    /**
     * @return the lblImg01
     */
    public javax.swing.JLabel getLblImg01() {
        return LblImg01;
    }

    /**
     * @param lblImg01 the lblImg01 to set
     */
    public void setLblImg01(javax.swing.JLabel lblImg01) {
        this.LblImg01 = lblImg01;
    }

    /**
     * @return the lblImg02
     */
    public javax.swing.JLabel getLblImg02() {
        return LblImg02;
    }

    /**
     * @param lblImg02 the lblImg02 to set
     */
    public void setLblImg02(javax.swing.JLabel lblImg02) {
        this.LblImg02 = lblImg02;
    }

    /**
     * @return the lblImg03
     */
    public javax.swing.JLabel getLblImg03() {
        return LblImg03;
    }

    /**
     * @param lblImg03 the lblImg03 to set
     */
    public void setLblImg03(javax.swing.JLabel lblImg03) {
        this.LblImg03 = lblImg03;
    }

    /**
     * @return the lblImg10
     */
    public javax.swing.JLabel getLblImg10() {
        return LblImg10;
    }

    /**
     * @param lblImg10 the lblImg10 to set
     */
    public void setLblImg10(javax.swing.JLabel lblImg10) {
        this.LblImg10 = lblImg10;
    }

    /**
     * @return the lblImg11
     */
    public javax.swing.JLabel getLblImg11() {
        return LblImg11;
    }

    /**
     * @param lblImg11 the lblImg11 to set
     */
    public void setLblImg11(javax.swing.JLabel lblImg11) {
        this.LblImg11 = lblImg11;
    }

    /**
     * @return the lblImg12
     */
    public javax.swing.JLabel getLblImg12() {
        return LblImg12;
    }

    /**
     * @param lblImg12 the lblImg12 to set
     */
    public void setLblImg12(javax.swing.JLabel lblImg12) {
        this.LblImg12 = lblImg12;
    }

    /**
     * @return the lblImg13
     */
    public javax.swing.JLabel getLblImg13() {
        return LblImg13;
    }

    /**
     * @param lblImg13 the lblImg13 to set
     */
    public void setLblImg13(javax.swing.JLabel lblImg13) {
        this.LblImg13 = lblImg13;
    }

    /**
     * @return the lblImg20
     */
    public javax.swing.JLabel getLblImg20() {
        return LblImg20;
    }

    /**
     * @param lblImg20 the lblImg20 to set
     */
    public void setLblImg20(javax.swing.JLabel lblImg20) {
        this.LblImg20 = lblImg20;
    }

    /**
     * @return the lblImg21
     */
    public javax.swing.JLabel getLblImg21() {
        return LblImg21;
    }

    /**
     * @param lblImg21 the lblImg21 to set
     */
    public void setLblImg21(javax.swing.JLabel lblImg21) {
        this.LblImg21 = lblImg21;
    }

    /**
     * @return the lblImg22
     */
    public javax.swing.JLabel getLblImg22() {
        return LblImg22;
    }

    /**
     * @param lblImg22 the lblImg22 to set
     */
    public void setLblImg22(javax.swing.JLabel lblImg22) {
        this.LblImg22 = lblImg22;
    }

    /**
     * @return the lblImg23
     */
    public javax.swing.JLabel getLblImg23() {
        return LblImg23;
    }

    /**
     * @param lblImg23 the lblImg23 to set
     */
    public void setLblImg23(javax.swing.JLabel lblImg23) {
        this.LblImg23 = lblImg23;
    }

    /**
     * @return the lblImg30
     */
    public javax.swing.JLabel getLblImg30() {
        return LblImg30;
    }

    /**
     * @param lblImg30 the lblImg30 to set
     */
    public void setLblImg30(javax.swing.JLabel lblImg30) {
        this.LblImg30 = lblImg30;
    }

    /**
     * @return the lblImg31
     */
    public javax.swing.JLabel getLblImg31() {
        return LblImg31;
    }

    /**
     * @param lblImg31 the lblImg31 to set
     */
    public void setLblImg31(javax.swing.JLabel lblImg31) {
        this.LblImg31 = lblImg31;
    }

    /**
     * @return the lblImg32
     */
    public javax.swing.JLabel getLblImg32() {
        return LblImg32;
    }

    /**
     * @param lblImg32 the lblImg32 to set
     */
    public void setLblImg32(javax.swing.JLabel lblImg32) {
        this.LblImg32 = lblImg32;
    }

    /**
     * @return the lblImg33
     */
    public javax.swing.JLabel getLblImg33() {
        return LblImg33;
    }

    /**
     * @param lblImg33 the lblImg33 to set
     */
    public void setLblImg33(javax.swing.JLabel lblImg33) {
        this.LblImg33 = lblImg33;
    }

    /**
     * Creates new form JPanelIniciante
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void viraCarta() {
        ImageIcon novaIMG = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm1.jpg"));
        getLblImg32().setIcon(novaIMG);
    }
}