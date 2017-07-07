/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Menus;

import Controle.AdmDAO;
import Controle.AlunoDAO;
import Controle.ProfessorDAO;
import Modelo.Administrador;
import Modelo.Professor;
import static Visao.JFrame_login.user;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anderson
 */
public class JFrame_prof extends javax.swing.JFrame {

    ProfessorDAO controle = new ProfessorDAO();
    Professor model = new Professor();

    /**
     * Creates new form JFrame_aluno
     */
    public JFrame_prof() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(927, 500);
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
        jB_turma1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jB_turma4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jB_turma5 = new javax.swing.JButton();
        jB_turma6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(234, 234, 234));
        setName("Aluno"); // NOI18N
        getContentPane().setLayout(null);

        jL_bemvindoAluno.setBackground(new java.awt.Color(36, 44, 68));
        jL_bemvindoAluno.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jL_bemvindoAluno.setForeground(new java.awt.Color(255, 255, 255));
        jL_bemvindoAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_bemvindoAluno.setText("Bem-vindo");
        jL_bemvindoAluno.setOpaque(true);
        getContentPane().add(jL_bemvindoAluno);
        jL_bemvindoAluno.setBounds(0, 0, 920, 57);

        jB_turma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/Adm_Curso.fw.png"))); // NOI18N
        jB_turma1.setFocusable(false);
        jB_turma1.setOpaque(false);
        jB_turma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_turma1ActionPerformed(evt);
            }
        });
        getContentPane().add(jB_turma1);
        jB_turma1.setBounds(300, 160, 120, 70);

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 46, 68));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Frequência");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(500, 380, 120, 27);

        jB_turma4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/Prof_chamada.fw.png"))); // NOI18N
        jB_turma4.setFocusable(false);
        jB_turma4.setOpaque(false);
        jB_turma4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_turma4ActionPerformed(evt);
            }
        });
        getContentPane().add(jB_turma4);
        jB_turma4.setBounds(500, 310, 120, 70);

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(36, 46, 68));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Turma");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 380, 120, 27);

        jB_turma5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/Aluno_turma.fw.png"))); // NOI18N
        jB_turma5.setFocusable(false);
        jB_turma5.setOpaque(false);
        jB_turma5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_turma5ActionPerformed(evt);
            }
        });
        getContentPane().add(jB_turma5);
        jB_turma5.setBounds(300, 310, 120, 70);

        jB_turma6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/Aluno_historico.fw.png"))); // NOI18N
        jB_turma6.setFocusable(false);
        jB_turma6.setOpaque(false);
        jB_turma6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_turma6ActionPerformed(evt);
            }
        });
        getContentPane().add(jB_turma6);
        jB_turma6.setBounds(500, 160, 120, 70);

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 46, 68));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Notas");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(500, 230, 120, 27);

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 46, 68));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Vincular Curso");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(300, 230, 120, 27);

        setSize(new java.awt.Dimension(938, 583));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_turma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_turma1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_turma1ActionPerformed

    private void jB_turma4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_turma4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_turma4ActionPerformed

    private void jB_turma5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_turma5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_turma5ActionPerformed

    private void jB_turma6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_turma6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_turma6ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_prof().setVisible(true);

            }
        });
    }

    public void bemvindo() {
        try {
            model = controle.buscarProfessor(user);
        } catch (SQLException ex) {
            Logger.getLogger(JFrame_prof.class.getName()).log(Level.SEVERE, null, ex);
        }
        String jL_nome = null;
        if (model != null) {
            jL_nome = model.getNome();
        }
        jL_bemvindoAluno.setText("Bem vindo " + jL_nome);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_turma1;
    private javax.swing.JButton jB_turma4;
    private javax.swing.JButton jB_turma5;
    private javax.swing.JButton jB_turma6;
    private javax.swing.JLabel jL_bemvindoAluno;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
