/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.AlunoDAO;
import Controle.Conexao;
import Modelo.Aluno;
import Modelo.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class JFrame_login extends javax.swing.JFrame {
    
    Aluno model = new Aluno();
    AlunoDAO control = new AlunoDAO();
    /**
     * Creates new form login
     */
    public JFrame_login() {
        initComponents();
        setLocationRelativeTo(null);
        //setSize(500, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtn_entrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jT_usuario = new javax.swing.JTextField();
        jT_senha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(234, 234, 234));
        setMaximumSize(new java.awt.Dimension(500, 600));
        setSize(new java.awt.Dimension(750, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 46, 68));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/icone.fw.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(icon)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(icon)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        jLabel1.setBackground(new java.awt.Color(36, 46, 68));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(234, 234, 234));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Identifique-se");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 440, 28));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 46, 68));
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 46, 68));
        jLabel3.setText("Usuário");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jBtn_entrar.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jBtn_entrar.setForeground(new java.awt.Color(36, 46, 68));
        jBtn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/btn_entrar.fw.png"))); // NOI18N
        jBtn_entrar.setText("Entrar");
        jBtn_entrar.setContentAreaFilled(false);
        jBtn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jButton2.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(36, 46, 68));
        jButton2.setText("Esqueci a senha");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jT_usuario.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_usuario.setForeground(new java.awt.Color(36, 46, 68));
        jT_usuario.setOpaque(false);
        getContentPane().add(jT_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 380, -1));

        jT_senha.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jT_senha.setForeground(new java.awt.Color(36, 46, 68));
        jT_senha.setOpaque(false);
        getContentPane().add(jT_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 380, 30));

        jButton1.setBackground(new java.awt.Color(228, 228, 228));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/login_user.fw.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_entrarActionPerformed
    if((jT_usuario.getText()!="") || (jT_senha.getText()!="")){
        int mat =(Integer.parseInt(jT_usuario.getText()));
        String senha = (jT_senha.getText());
        try {
            int a = control.loginAluno(mat, senha);
                JOptionPane.showMessageDialog(null, "Essa porra existe "+a);
        } catch (SQLException ex) {
            Logger.getLogger(JFrame_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.setNome(jT_usuario.getText());
        model.setSenha(jT_senha.getText());
        //control.login(model)
        
    }

    }//GEN-LAST:event_jBtn_entrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon;
    private javax.swing.JButton jBtn_entrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jT_senha;
    private javax.swing.JTextField jT_usuario;
    // End of variables declaration//GEN-END:variables
}
