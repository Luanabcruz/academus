/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelo.Curso;
import Controle.CursoDAO;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Anderson
 */
public class JFrameCadastrarCurso extends javax.swing.JFrame {
    Curso model = new Curso();
    CursoDAO controle = new CursoDAO();
   
    /**
     * Creates new form cadastrarCurso
     */
    public JFrameCadastrarCurso() {
        initComponents();
        getContentPane().setBackground(Color.white);
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        Jt_nomeCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jt_cargaHoraria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jT_conceito = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jB_cancelarCadCurso = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jT_descricaoCurso = new javax.swing.JTextPane();
        jB_cadastrar1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 44, 68));
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(25, 104, 64, 27);

        Jt_nomeCurso.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        Jt_nomeCurso.setForeground(new java.awt.Color(36, 44, 68));
        getContentPane().add(Jt_nomeCurso);
        Jt_nomeCurso.setBounds(25, 137, 349, 36);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/curso.fw.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 10, 32, 32);

        jLabel1.setBackground(new java.awt.Color(36, 44, 68));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Curso");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 57);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 44, 68));
        jLabel3.setText("Carga Horária");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 104, 110, 27);

        Jt_cargaHoraria.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        Jt_cargaHoraria.setForeground(new java.awt.Color(36, 44, 68));
        getContentPane().add(Jt_cargaHoraria);
        Jt_cargaHoraria.setBounds(450, 137, 100, 36);

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 44, 68));
        jLabel5.setText("Descrição");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(25, 200, 90, 27);

        jT_conceito.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_conceito.setForeground(new java.awt.Color(36, 44, 68));
        getContentPane().add(jT_conceito);
        jT_conceito.setBounds(450, 230, 100, 36);

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 44, 68));
        jLabel6.setText("Conceito");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 200, 110, 27);

        jB_cancelarCadCurso.setBackground(new java.awt.Color(255, 51, 51));
        jB_cancelarCadCurso.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_cancelarCadCurso.setForeground(new java.awt.Color(255, 255, 255));
        jB_cancelarCadCurso.setText("Cancelar");
        jB_cancelarCadCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cancelarCadCursoActionPerformed(evt);
            }
        });
        getContentPane().add(jB_cancelarCadCurso);
        jB_cancelarCadCurso.setBounds(260, 350, 130, 36);

        jT_descricaoCurso.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_descricaoCurso.setForeground(new java.awt.Color(36, 44, 68));
        jT_descricaoCurso.setAlignmentX(0.0F);
        jT_descricaoCurso.setAlignmentY(0.0F);
        jScrollPane3.setViewportView(jT_descricaoCurso);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 230, 360, 70);

        jB_cadastrar1.setBackground(new java.awt.Color(0, 204, 51));
        jB_cadastrar1.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_cadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        jB_cadastrar1.setText("Cadastrar");
        jB_cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cadastrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jB_cadastrar1);
        jB_cadastrar1.setBounds(400, 350, 140, 36);

        setSize(new java.awt.Dimension(724, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_cancelarCadCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cancelarCadCursoActionPerformed
        Object[] options = { "Sim", "Não" };
        int opcao = JOptionPane.showOptionDialog(null, "Deseja realmente cancelar o cadastro?", "Cancelar Cadastro", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE , null, options, options[0]);
        System.out.println("opcao "+opcao);
        
        if(opcao==0){
            dispose();
            System.exit(0);
            //setDefaultCloseOperation(JFrameCadastrarAluno.DISPOSE_ON_CLOSE);
        }else{}
    }//GEN-LAST:event_jB_cancelarCadCursoActionPerformed

    private void jB_cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cadastrar1ActionPerformed
       
        ValidaNumero(Jt_cargaHoraria);
      try { 
        if((Jt_nomeCurso.getText().trim().equals("") || jT_conceito.getText().trim().isEmpty()||
            Jt_cargaHoraria.getText().trim().isEmpty() || jT_descricaoCurso.getText().trim().equals(""))
          ){ 
              JOptionPane.showMessageDialog(null, "Todos os campos tem que estar preenchidos!");
           }
        else{
       model.setNomeCurso(Jt_nomeCurso.getText());
       model.setConceitoCurso(Float.parseFloat(jT_conceito.getText()));
       model.setCargaCurso(Integer.parseInt(Jt_cargaHoraria.getText()));
       model.setDescricao(jT_descricaoCurso.getText());
       
       controle.cadastrarCurso(model,model.getAdministrador().getCodAdm(),model.getAdministrador().getNome());
        }
        } catch (SQLException ex) {
            Logger.getLogger(JFrameCadastrarCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jB_cadastrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameCadastrarCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jt_cargaHoraria;
    private javax.swing.JTextField Jt_nomeCurso;
    private javax.swing.JButton jB_cadastrar1;
    private javax.swing.JButton jB_cancelarCadCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_conceito;
    private javax.swing.JTextPane jT_descricaoCurso;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
