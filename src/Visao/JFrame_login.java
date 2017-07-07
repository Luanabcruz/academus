/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Visao.Menus.JFrame_adm;
import Visao.Menus.JFrame_aluno;
import Controle.AdmDAO;
import Controle.AlunoDAO;
import Controle.Conexao;
import Controle.ProfessorDAO;
import Modelo.Administrador;
import Modelo.Aluno;
import Modelo.Professor;
import Modelo.Usuario;
import Visao.Menus.JFrame_prof;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Anderson
 */
public class JFrame_login extends javax.swing.JFrame {

    Aluno model = new Aluno();
    Professor model_professor = new Professor();
    Administrador model_adm = new Administrador();
    AlunoDAO control_aluno = new AlunoDAO();
    AdmDAO control_adm = new AdmDAO();
    ProfessorDAO control_professor = new ProfessorDAO();
    int retorno;

    //Variáveis Globais
    public static int user;

    /**
     * Creates new form login
     */
    public JFrame_login() {
        initComponents();
        setLocationRelativeTo(null);
        jL_tipo.setVisible(false);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtn_entrar = new javax.swing.JButton();
        jT_usuario = new javax.swing.JTextField();
        jT_senha = new javax.swing.JPasswordField();
        jR_adm = new javax.swing.JRadioButton();
        jR_prof = new javax.swing.JRadioButton();
        jR_aluno = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jL_tipo = new javax.swing.JLabel();

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

        jT_usuario.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_usuario.setForeground(new java.awt.Color(36, 46, 68));
        jT_usuario.setOpaque(false);
        jT_usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jT_usuarioFocusLost(evt);
            }
        });
        getContentPane().add(jT_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 380, -1));

        jT_senha.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jT_senha.setForeground(new java.awt.Color(36, 46, 68));
        jT_senha.setOpaque(false);
        getContentPane().add(jT_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 380, 30));

        buttonGroup1.add(jR_adm);
        getContentPane().add(jR_adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        buttonGroup1.add(jR_prof);
        getContentPane().add(jR_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        buttonGroup1.add(jR_aluno);
        getContentPane().add(jR_aluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/login_prof.fw.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/login_user.fw.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/icon_professor.fw.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        jL_tipo.setFont(new java.awt.Font("Agency FB", 2, 14)); // NOI18N
        jL_tipo.setForeground(new java.awt.Color(255, 51, 51));
        jL_tipo.setText("Selecione o tipo de usuário");
        getContentPane().add(jL_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 120, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_entrarActionPerformed
        int tipo_user;

        if (jR_adm.isSelected() == false && jR_prof.isSelected() == false && jR_aluno.isSelected() == false) {
            jL_tipo.setVisible(true);
        } else {
            if ((jT_usuario.getText() != "") || (jT_senha.getText() != "")) {
                jL_tipo.setVisible(false);
              //Atribui os  valores dos campos para as variaveis
                user = (Integer.parseInt(jT_usuario.getText()));
                String senha = (jT_senha.getText());
                //Verifica o tipo de usuário
                if (jR_adm.isSelected()) {
                    loginAdm(user, senha);
                } else if (jR_prof.isSelected()) {
                    tipo_user = 2;
                    loginProfessor(user, senha);
                } else if (jR_aluno.isSelected()) {
                    loginALuno(user, senha);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            }

        }
    }//GEN-LAST:event_jBtn_entrarActionPerformed

    private void jT_usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jT_usuarioFocusLost
        // TODO add your handling code here:
        ValidaNumero(jT_usuario);
    }//GEN-LAST:event_jT_usuarioFocusLost

    /**
     * @param args the command line arguments
     */
        
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_login().setVisible(true);
            }
        });
    }

    public void loginALuno(int user, String senha) {
        try {
            retorno = control_aluno.loginAluno(user, senha);
            if (retorno == 1) {
                JFrame_aluno frame = new JFrame_aluno();
                frame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Dados incorretos");
                jT_usuario.grabFocus();                
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrame_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loginAdm(int user, String senha) {
        try {
            retorno = control_adm.loginAdm(user, senha);
            if (retorno == 1) {
                JFrame_adm frame = new JFrame_adm();
                frame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Dados incorretos");
                jT_usuario.grabFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrame_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loginProfessor(int user, String senha) {
        try {
            retorno = control_professor.loginProfessor(user, senha);
            if (retorno == 1) {
                JFrame_prof frame = new JFrame_prof();
                frame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Dados incorretos");
                jT_usuario.grabFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrame_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Validar a matricula do usuario
    public void ValidaNumero(JTextField Numero) {
        long valor;
        if (Numero.getText().length() != 0) {
            try {
                valor = Long.parseLong(Numero.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Usuário incorreto", "Informação", JOptionPane.INFORMATION_MESSAGE);
                Numero.grabFocus();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jBtn_entrar;
    private javax.swing.JLabel jL_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jR_adm;
    private javax.swing.JRadioButton jR_aluno;
    private javax.swing.JRadioButton jR_prof;
    private javax.swing.JPasswordField jT_senha;
    private javax.swing.JTextField jT_usuario;
    // End of variables declaration//GEN-END:variables
}
