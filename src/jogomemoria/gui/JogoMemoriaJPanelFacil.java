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
        lblTitulo.setText("Jogo da Memória");

        lblTime.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 0, 0));
        lblTime.setText("Last Time");

        LblImg00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

        LblImg20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/cartavirada.jpg"))); // NOI18N

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
