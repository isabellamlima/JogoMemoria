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
        lblImg1.setIcon(novaIMG);
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

}
