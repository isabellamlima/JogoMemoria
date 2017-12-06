package jogomemoria.gui;

import java.awt.Container;
import javax.swing.JLabel;
import jogomemoria.control.JogoMemoriaCtrl;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isamo
 */
public class JogoMemoriaJInfo extends javax.swing.JPanel {
    /**
     * Creates new form JogoMemoriaJInfo
     */
    public JogoMemoriaJInfo() {
        
        initComponents();        

        }
    public void JogoMemoriaJInfo(){
        
    }
    public void atualizaScores (JogoMemoriaCtrl ctrl){
        ctrl.inserirRecordes();
        lbScore.setText(""+ctrl.getPontuacaoAtual());
        lblOuro.setText(""+ctrl.getRecordeOuro());
        lblPrata.setText(""+ctrl.getRecordePrata());
        lblBronze.setText(""+ctrl.getRecordeBronze());
                       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbScore = new javax.swing.JLabel();
        lblImgOuro = new javax.swing.JLabel();
        lblImgPrata = new javax.swing.JLabel();
        lblImgBronze = new javax.swing.JLabel();
        lblOuro = new javax.swing.JLabel();
        lblPrata = new javax.swing.JLabel();
        lblBronze = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(204, 255, 204));
        setForeground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setText("Recordes");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setText("Score:");

        lbScore.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        lbScore.setText("0");

        lblImgOuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/ouro.png"))); // NOI18N

        lblImgPrata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/prata.png"))); // NOI18N

        lblImgBronze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/bronze.png"))); // NOI18N

        lblOuro.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        lblOuro.setText("0");

        lblPrata.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        lblPrata.setText("0");

        lblBronze.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        lblBronze.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblImgPrata)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPrata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblImgOuro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblOuro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblImgBronze)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblBronze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel4)))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(lbScore, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblImgOuro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblOuro)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblImgPrata))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblPrata)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblImgBronze))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblBronze)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbScore))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbScore;
    private javax.swing.JLabel lblBronze;
    private javax.swing.JLabel lblImgBronze;
    private javax.swing.JLabel lblImgOuro;
    private javax.swing.JLabel lblImgPrata;
    private javax.swing.JLabel lblOuro;
    private javax.swing.JLabel lblPrata;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jLabel1
     */
    
}
