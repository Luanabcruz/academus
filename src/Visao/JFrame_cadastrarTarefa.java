/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Anderson
 */
public class JFrame_cadastrarTarefa extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_cadastrarTarefa
     */
    public JFrame_cadastrarTarefa() {
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

        jL_bemvindoAluno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jT_nomealunoAlterarAluno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(234, 234, 234));
        getContentPane().setLayout(null);

        jL_bemvindoAluno.setBackground(new java.awt.Color(36, 44, 68));
        jL_bemvindoAluno.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jL_bemvindoAluno.setForeground(new java.awt.Color(255, 255, 255));
        jL_bemvindoAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_bemvindoAluno.setText("Cadastrar Tarefa");
        jL_bemvindoAluno.setOpaque(true);
        getContentPane().add(jL_bemvindoAluno);
        jL_bemvindoAluno.setBounds(0, 0, 660, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 590, 190);

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 46, 68));
        jLabel5.setText("Prazo de entrega:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 320, 130, 27);

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 46, 68));
        jLabel6.setText("Tarefa:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 80, 50, 27);

        jT_nomealunoAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_nomealunoAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_nomealunoAlterarAluno.setText(" ");
        getContentPane().add(jT_nomealunoAlterarAluno);
        jT_nomealunoAlterarAluno.setBounds(180, 320, 120, 30);

        setSize(new java.awt.Dimension(671, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFrame_cadastrarTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_cadastrarTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_cadastrarTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_cadastrarTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_cadastrarTarefa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jL_bemvindoAluno;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_nomealunoAlterarAluno;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
