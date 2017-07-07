/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Menus;

import Controle.AdmDAO;
import Controle.AlunoDAO;
import Modelo.Administrador;
import static Visao.JFrame_login.user;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anderson
 */
public class JFrame_adm extends javax.swing.JFrame {

    AdmDAO controle = new AdmDAO();
    Administrador model = new Administrador();

    /**
     * Creates new form JFrame_aluno
     */
    public JFrame_adm() {
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
        jB_turma2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jB_turma3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jB_turma4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jB_turma5 = new javax.swing.JButton();
        jB_turma6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

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
        jB_turma1.setBounds(200, 330, 120, 70);

        jB_turma2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/Adm_Professor.fw.png"))); // NOI18N
        jB_turma2.setFocusable(false);
        jB_turma2.setOpaque(false);
        jB_turma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_turma2ActionPerformed(evt);
            }
        });
        getContentPane().add(jB_turma2);
        jB_turma2.setBounds(200, 170, 120, 70);

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 46, 68));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Administrador");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(590, 240, 120, 27);

        jB_turma3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/Adm_Administrador.fw.png"))); // NOI18N
        jB_turma3.setFocusable(false);
        jB_turma3.setOpaque(false);
        jB_turma3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_turma3ActionPerformed(evt);
            }
        });
        getContentPane().add(jB_turma3);
        jB_turma3.setBounds(590, 170, 120, 70);

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 46, 68));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Curso");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 400, 120, 27);

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 46, 68));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Professor");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 240, 120, 27);

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 46, 68));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Disciplina");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 400, 120, 27);

        jB_turma4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/Adm_Disciplina.fw.png"))); // NOI18N
        jB_turma4.setFocusable(false);
        jB_turma4.setOpaque(false);
        jB_turma4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_turma4ActionPerformed(evt);
            }
        });
        getContentPane().add(jB_turma4);
        jB_turma4.setBounds(400, 330, 120, 70);

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(36, 46, 68));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Turma");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(580, 400, 120, 27);

        jB_turma5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/Aluno_turma.fw.png"))); // NOI18N
        jB_turma5.setFocusable(false);
        jB_turma5.setOpaque(false);
        jB_turma5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_turma5ActionPerformed(evt);
            }
        });
        getContentPane().add(jB_turma5);
        jB_turma5.setBounds(580, 330, 120, 70);

        jB_turma6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/Adm_Aluno.fw.png"))); // NOI18N
        jB_turma6.setFocusable(false);
        jB_turma6.setOpaque(false);
        jB_turma6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_turma6ActionPerformed(evt);
            }
        });
        getContentPane().add(jB_turma6);
        jB_turma6.setBounds(400, 170, 120, 70);

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 46, 68));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Aluno");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(400, 240, 120, 27);

        setSize(new java.awt.Dimension(938, 583));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_turma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_turma1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_turma1ActionPerformed

    private void jB_turma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_turma2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_turma2ActionPerformed

    private void jB_turma3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_turma3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_turma3ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_adm().setVisible(true);

            }
        });
    }

    public void bemvindo() {
        try {
            model = controle.buscarAdministrador(user);
        } catch (SQLException ex) {
            Logger.getLogger(JFrame_adm.class.getName()).log(Level.SEVERE, null, ex);
        }
        String jL_nome = null;
        if (model != null) {
            jL_nome = model.getNome();
        }
        jL_bemvindoAluno.setText("Bem vindo " + jL_nome);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_turma1;
    private javax.swing.JButton jB_turma2;
    private javax.swing.JButton jB_turma3;
    private javax.swing.JButton jB_turma4;
    private javax.swing.JButton jB_turma5;
    private javax.swing.JButton jB_turma6;
    private javax.swing.JLabel jL_bemvindoAluno;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}