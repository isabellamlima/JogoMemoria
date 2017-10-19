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

/**
 *
 * @author Aluno
 */
public class JogoMemoriaJPanelFacil extends javax.swing.JPanel {

    /**
     * Creates new form JogoMemoriaJPanelFacil
     */
    public JogoMemoriaJPanelFacil() {
        initComponents();
    }

    List<String> caminhoImagens = Arrays.asList("JM1.jpg", "JM2.jpg", "JM3.jpg", "JM4.jpg", "JM5.jpg", "JM6.jpg", "JM7.jpg", "JM8.png");
    Set<Integer> sorteados = new TreeSet<Integer>();

    public int sorteio() {
        Random img = new Random();
        final int ter = 7;
        final int com = 0;
        int result;
        do {
            result = img.nextInt(ter + 1) + com;
        } while (!sorteados.add(Integer.valueOf(result)));

        return result;
    }

    @SuppressWarnings("unchecked")

    // public String sorteioDeImagem() {
    // return new Random().nextInt(caminhoImagens.size());
    //}
    public void trocaIMG() {
        ImageIcon novaIMG = new ImageIcon(getClass().getResource("/imagens/JM1.jpg"));
        getLblImg1().setIcon(novaIMG);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblImg1 = new javax.swing.JLabel();
        lblImg3 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        lblImg5 = new javax.swing.JLabel();
        lblImg4 = new javax.swing.JLabel();
        lblImg6 = new javax.swing.JLabel();
        lblImg8 = new javax.swing.JLabel();
        lblImg7 = new javax.swing.JLabel();
        lblImg11 = new javax.swing.JLabel();
        lblImg10 = new javax.swing.JLabel();
        lblImg13 = new javax.swing.JLabel();
        lblImg12 = new javax.swing.JLabel();
        lblImg14 = new javax.swing.JLabel();
        lblImg16 = new javax.swing.JLabel();
        lblImg15 = new javax.swing.JLabel();
        lblImg9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblTitulo.setText("Jogo da Memória");

        lblTime.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 0, 0));
        lblTime.setText("Last Time");

        lblImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        lblImg9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

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
                        .addComponent(lblImg1)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg2)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg3)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImg5)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg6)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg7)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImg9)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg10)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg11)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImg13)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg14)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg15)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg16)))
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
                    .addComponent(lblImg2)
                    .addComponent(lblImg1)
                    .addComponent(lblImg3)
                    .addComponent(lblImg4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg5)
                    .addComponent(lblImg6)
                    .addComponent(lblImg8)
                    .addComponent(lblImg7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImg10)
                    .addComponent(lblImg9)
                    .addComponent(lblImg11)
                    .addComponent(lblImg12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg13)
                    .addComponent(lblImg14)
                    .addComponent(lblImg16)
                    .addComponent(lblImg15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImg1;
    private javax.swing.JLabel lblImg10;
    private javax.swing.JLabel lblImg11;
    private javax.swing.JLabel lblImg12;
    private javax.swing.JLabel lblImg13;
    private javax.swing.JLabel lblImg14;
    private javax.swing.JLabel lblImg15;
    private javax.swing.JLabel lblImg16;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JLabel lblImg3;
    private javax.swing.JLabel lblImg4;
    private javax.swing.JLabel lblImg5;
    private javax.swing.JLabel lblImg6;
    private javax.swing.JLabel lblImg7;
    private javax.swing.JLabel lblImg8;
    private javax.swing.JLabel lblImg9;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the lblImg1
     */
    public javax.swing.JLabel getLblImg1() {
        return lblImg1;
    }

    /**
     * @param lblImg1 the lblImg1 to set
     */
    public void setLblImg1(javax.swing.JLabel lblImg1) {
        this.lblImg1 = lblImg1;
    }

    /**
     * @return the lblImg10
     */
    public javax.swing.JLabel getLblImg10() {
        return lblImg10;
    }

    /**
     * @param lblImg10 the lblImg10 to set
     */
    public void setLblImg10(javax.swing.JLabel lblImg10) {
        this.lblImg10 = lblImg10;
    }

    /**
     * @return the lblImg11
     */
    public javax.swing.JLabel getLblImg11() {
        return lblImg11;
    }

    /**
     * @param lblImg11 the lblImg11 to set
     */
    public void setLblImg11(javax.swing.JLabel lblImg11) {
        this.lblImg11 = lblImg11;
    }

    /**
     * @return the lblImg12
     */
    public javax.swing.JLabel getLblImg12() {
        return lblImg12;
    }

    /**
     * @param lblImg12 the lblImg12 to set
     */
    public void setLblImg12(javax.swing.JLabel lblImg12) {
        this.lblImg12 = lblImg12;
    }

    /**
     * @return the lblImg13
     */
    public javax.swing.JLabel getLblImg13() {
        return lblImg13;
    }

    /**
     * @param lblImg13 the lblImg13 to set
     */
    public void setLblImg13(javax.swing.JLabel lblImg13) {
        this.lblImg13 = lblImg13;
    }

    /**
     * @return the lblImg14
     */
    public javax.swing.JLabel getLblImg14() {
        return lblImg14;
    }

    /**
     * @param lblImg14 the lblImg14 to set
     */
    public void setLblImg14(javax.swing.JLabel lblImg14) {
        this.lblImg14 = lblImg14;
    }

    /**
     * @return the lblImg15
     */
    public javax.swing.JLabel getLblImg15() {
        return lblImg15;
    }

    /**
     * @param lblImg15 the lblImg15 to set
     */
    public void setLblImg15(javax.swing.JLabel lblImg15) {
        this.lblImg15 = lblImg15;
    }

    /**
     * @return the lblImg16
     */
    public javax.swing.JLabel getLblImg16() {
        return lblImg16;
    }

    /**
     * @param lblImg16 the lblImg16 to set
     */
    public void setLblImg16(javax.swing.JLabel lblImg16) {
        this.lblImg16 = lblImg16;
    }

    /**
     * @return the lblImg2
     */
    public javax.swing.JLabel getLblImg2() {
        return lblImg2;
    }

    /**
     * @param lblImg2 the lblImg2 to set
     */
    public void setLblImg2(javax.swing.JLabel lblImg2) {
        this.lblImg2 = lblImg2;
    }

    /**
     * @return the lblImg3
     */
    public javax.swing.JLabel getLblImg3() {
        return lblImg3;
    }

    /**
     * @param lblImg3 the lblImg3 to set
     */
    public void setLblImg3(javax.swing.JLabel lblImg3) {
        this.lblImg3 = lblImg3;
    }

    /**
     * @return the lblImg4
     */
    public javax.swing.JLabel getLblImg4() {
        return lblImg4;
    }

    /**
     * @param lblImg4 the lblImg4 to set
     */
    public void setLblImg4(javax.swing.JLabel lblImg4) {
        this.lblImg4 = lblImg4;
    }

    /**
     * @return the lblImg5
     */
    public javax.swing.JLabel getLblImg5() {
        return lblImg5;
    }

    /**
     * @param lblImg5 the lblImg5 to set
     */
    public void setLblImg5(javax.swing.JLabel lblImg5) {
        this.lblImg5 = lblImg5;
    }

    /**
     * @return the lblImg6
     */
    public javax.swing.JLabel getLblImg6() {
        return lblImg6;
    }

    /**
     * @param lblImg6 the lblImg6 to set
     */
    public void setLblImg6(javax.swing.JLabel lblImg6) {
        this.lblImg6 = lblImg6;
    }

    /**
     * @return the lblImg7
     */
    public javax.swing.JLabel getLblImg7() {
        return lblImg7;
    }

    /**
     * @param lblImg7 the lblImg7 to set
     */
    public void setLblImg7(javax.swing.JLabel lblImg7) {
        this.lblImg7 = lblImg7;
    }

    /**
     * @return the lblImg8
     */
    public javax.swing.JLabel getLblImg8() {
        return lblImg8;
    }

    /**
     * @param lblImg8 the lblImg8 to set
     */
    public void setLblImg8(javax.swing.JLabel lblImg8) {
        this.lblImg8 = lblImg8;
    }

    /**
     * @return the lblImg9
     */
    public javax.swing.JLabel getLblImg9() {
        return lblImg9;
    }

    /**
     * @param lblImg9 the lblImg9 to set
     */
    public void setLblImg9(javax.swing.JLabel lblImg9) {
        this.lblImg9 = lblImg9;
    }

}
