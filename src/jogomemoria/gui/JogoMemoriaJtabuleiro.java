/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import javax.swing.JSplitPane;

/**
 *
 * @author Aluno
 */
public class JogoMemoriaJtabuleiro extends javax.swing.JPanel {

    /**
     * Creates new form JogoMemoriaJtabuleiro
     */
    public JogoMemoriaJtabuleiro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jogoMemoriaJInfo2 = new jogomemoria.gui.JogoMemoriaJInfo();
        spptabuleiro = new javax.swing.JSplitPane();

        javax.swing.GroupLayout jogoMemoriaJInfo2Layout = new javax.swing.GroupLayout(jogoMemoriaJInfo2);
        jogoMemoriaJInfo2.setLayout(jogoMemoriaJInfo2Layout);
        jogoMemoriaJInfo2Layout.setHorizontalGroup(
            jogoMemoriaJInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jogoMemoriaJInfo2Layout.setVerticalGroup(
            jogoMemoriaJInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new java.awt.BorderLayout());
        add(spptabuleiro, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
public JSplitPane getSPPTabuleiro(){
    return spptabuleiro;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jogomemoria.gui.JogoMemoriaJInfo jogoMemoriaJInfo2;
    private javax.swing.JSplitPane spptabuleiro;
    // End of variables declaration//GEN-END:variables
}
