/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.AlunoDAO;
import Modelo.Curso;
import Controle.CursoDAO;
import Controle.DisciplinaDAO;
import Controle.NotaDAO;
import Controle.PeriodoDAO;
import Controle.ProfessorDAO;
import Controle.TurmaDAO;
import Modelo.Aluno;
import Modelo.Disciplina;
import Modelo.Nota;
import Modelo.Periodo;
import Modelo.Professor;
import Modelo.Turma;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class JFrame_alterarNota extends javax.swing.JFrame {
    Nota model = new Nota();
    NotaDAO control = new NotaDAO();
    int buscou=0;
    int codigoMatriculaMudado=-1;
    int codigoTurmaMudado=-1;
    
    /**
     * Creates new form cadastrarCurso
     */
    public JFrame_alterarNota() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }
    
    public void invisivel(){
        

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
        jT_codigoturmaAlterarNota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jB_cancelarAlterarCurso = new javax.swing.JButton();
        jB_buscarAlterarNota = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jT_nota1AlterarNota = new javax.swing.JTextField();
        jT_buscarAlterarNota = new javax.swing.JTextField();
        jB_confirmarAlterarNota = new javax.swing.JButton();
        jT_matriculaalunoAlterarNota = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jT_nota2AlterarNota = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jT_nota3AlterarNota = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 44, 68));
        jLabel2.setText("Código da turma");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 140, 110, 27);

        jT_codigoturmaAlterarNota.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_codigoturmaAlterarNota.setForeground(new java.awt.Color(36, 44, 68));
        jT_codigoturmaAlterarNota.setText(" ");
        jT_codigoturmaAlterarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_codigoturmaAlterarNotaActionPerformed(evt);
            }
        });
        getContentPane().add(jT_codigoturmaAlterarNota);
        jT_codigoturmaAlterarNota.setBounds(20, 170, 349, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/curso.fw.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 10, 32, 32);

        jLabel1.setBackground(new java.awt.Color(36, 44, 68));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alterar dados da Nota");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 708, 57);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 44, 68));
        jLabel3.setText("Buscar Código da Nota");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 220, 27);

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 44, 68));
        jLabel5.setText("Matricula do Aluno");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 200, 210, 27);

        jB_cancelarAlterarCurso.setBackground(new java.awt.Color(255, 51, 51));
        jB_cancelarAlterarCurso.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_cancelarAlterarCurso.setForeground(new java.awt.Color(255, 255, 255));
        jB_cancelarAlterarCurso.setText("Cancelar");
        jB_cancelarAlterarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cancelarAlterarCursoActionPerformed(evt);
            }
        });
        getContentPane().add(jB_cancelarAlterarCurso);
        jB_cancelarAlterarCurso.setBounds(330, 350, 110, 33);

        jB_buscarAlterarNota.setBackground(new java.awt.Color(0, 204, 51));
        jB_buscarAlterarNota.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_buscarAlterarNota.setForeground(new java.awt.Color(255, 255, 255));
        jB_buscarAlterarNota.setText("Buscar");
        jB_buscarAlterarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscarAlterarNotaActionPerformed(evt);
            }
        });
        getContentPane().add(jB_buscarAlterarNota);
        jB_buscarAlterarNota.setBounds(160, 100, 110, 33);

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 44, 68));
        jLabel7.setText("Nota 2");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(420, 200, 200, 27);

        jT_nota1AlterarNota.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_nota1AlterarNota.setForeground(new java.awt.Color(36, 44, 68));
        jT_nota1AlterarNota.setText(" ");
        getContentPane().add(jT_nota1AlterarNota);
        jT_nota1AlterarNota.setBounds(420, 170, 190, 30);

        jT_buscarAlterarNota.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_buscarAlterarNota.setForeground(new java.awt.Color(36, 44, 68));
        getContentPane().add(jT_buscarAlterarNota);
        jT_buscarAlterarNota.setBounds(20, 100, 100, 30);

        jB_confirmarAlterarNota.setBackground(new java.awt.Color(0, 204, 51));
        jB_confirmarAlterarNota.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_confirmarAlterarNota.setForeground(new java.awt.Color(255, 255, 255));
        jB_confirmarAlterarNota.setText("Confirmar");
        jB_confirmarAlterarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_confirmarAlterarNotaActionPerformed(evt);
            }
        });
        getContentPane().add(jB_confirmarAlterarNota);
        jB_confirmarAlterarNota.setBounds(460, 350, 110, 33);

        jT_matriculaalunoAlterarNota.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_matriculaalunoAlterarNota.setForeground(new java.awt.Color(36, 44, 68));
        jT_matriculaalunoAlterarNota.setText(" ");
        jT_matriculaalunoAlterarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_matriculaalunoAlterarNotaActionPerformed(evt);
            }
        });
        getContentPane().add(jT_matriculaalunoAlterarNota);
        jT_matriculaalunoAlterarNota.setBounds(20, 230, 349, 30);

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 44, 68));
        jLabel8.setText("Nota 1");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 140, 200, 27);

        jT_nota2AlterarNota.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_nota2AlterarNota.setForeground(new java.awt.Color(36, 44, 68));
        jT_nota2AlterarNota.setText(" ");
        getContentPane().add(jT_nota2AlterarNota);
        jT_nota2AlterarNota.setBounds(420, 230, 190, 30);

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 44, 68));
        jLabel10.setText("Nota 3");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(420, 260, 200, 27);

        jT_nota3AlterarNota.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_nota3AlterarNota.setForeground(new java.awt.Color(36, 44, 68));
        jT_nota3AlterarNota.setText(" ");
        getContentPane().add(jT_nota3AlterarNota);
        jT_nota3AlterarNota.setBounds(420, 290, 190, 30);

        setSize(new java.awt.Dimension(724, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_cancelarAlterarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cancelarAlterarCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_cancelarAlterarCursoActionPerformed

    private void jB_buscarAlterarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscarAlterarNotaActionPerformed
         if(!(jT_buscarAlterarNota.getText().equals(""))){
             int codNota =(Integer.parseInt(jT_buscarAlterarNota.getText()));
             try {
                 model = control.buscarNota(codNota);
                    if(model!=null){
                        jT_nota1AlterarNota.setText(String.valueOf(model.getNota1()));
                        jT_matriculaalunoAlterarNota.setText(String.valueOf(model.getMatricula()));
                        jT_codigoturmaAlterarNota.setText(String.valueOf(model.getTurmaCod()));
                        jT_nota2AlterarNota.setText(String.valueOf(model.getNota2()));
                        jT_nota3AlterarNota.setText(String.valueOf(model.getNota3()));
                        codigoMatriculaMudado=model.getMatricula();
                        codigoTurmaMudado=model.getTurmaCod();
                        buscou=1;
                    }else{
                        jT_nota1AlterarNota.setText("");
                        jT_matriculaalunoAlterarNota.setText("");
                        jT_codigoturmaAlterarNota.setText("");
                        jT_buscarAlterarNota.setText("");
                        jT_nota2AlterarNota.setText("");
                        jT_nota3AlterarNota.setText("");
                        codigoMatriculaMudado=-1;
                        codigoTurmaMudado=-1;
                        buscou=0;
                        JOptionPane.showMessageDialog(null, "Esta Nota não existe!");
                    }
             } catch (SQLException ex) {
                 Logger.getLogger(JFrame_alterarNota.class.getName()).log(Level.SEVERE, null, ex);
             }
        }else{
            JOptionPane.showMessageDialog(null, "Insira algum número no campo para buscar uma Nota!");
            jT_nota1AlterarNota.setText("");
            jT_matriculaalunoAlterarNota.setText("");
            jT_codigoturmaAlterarNota.setText("");
            jT_buscarAlterarNota.setText("");
            jT_nota2AlterarNota.setText("");
            jT_nota3AlterarNota.setText("");
            codigoMatriculaMudado=-1;
            codigoTurmaMudado=-1;
            buscou=0;
         }
    }//GEN-LAST:event_jB_buscarAlterarNotaActionPerformed

    private void jB_confirmarAlterarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_confirmarAlterarNotaActionPerformed
        if(buscou==1){
            /*}else if(model.getUniversidadeCod()!=(Integer.parseInt(jT_universidadeAlterarCurso.getText()))){
                    JOptionPane.showMessageDialog(null,"Número da universidade não pode ser alterado!");*/
                if((jT_codigoturmaAlterarNota.getText().equals(""))||(jT_matriculaalunoAlterarNota.getText().equals("")))
                {
                    JOptionPane.showMessageDialog(null,"Os campos do codigo da turma e da matricula do aluno devem ser preenchidos!");
                }else{
                    Turma modelVerifica = new Turma();
                    TurmaDAO controlVerifica = new TurmaDAO();
                    Aluno modelVerificaAluno = new Aluno();
                    AlunoDAO controlVerificaAluno = new AlunoDAO();
                        if(codigoTurmaMudado!=Integer.parseInt(jT_codigoturmaAlterarNota.getText())){
                            try {
                                modelVerifica = controlVerifica.buscarTurma(Integer.parseInt(jT_codigoturmaAlterarNota.getText()));
                            } catch (SQLException ex) {
                                Logger.getLogger(JFrame_alterarNota.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(codigoMatriculaMudado!=Integer.parseInt(jT_matriculaalunoAlterarNota.getText())){
                            try {
                                modelVerificaAluno = controlVerificaAluno.buscarAluno(Integer.parseInt(jT_matriculaalunoAlterarNota.getText()));
                            } catch (SQLException ex) {
                                Logger.getLogger(JFrame_alterarNota.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    if(modelVerifica!=null){
                        if(modelVerificaAluno!=null){
                                try {
                                    model.setTurmaCod((Integer.parseInt(jT_codigoturmaAlterarNota.getText())));
                                    model.setMatricula(Integer.parseInt(jT_matriculaalunoAlterarNota.getText()));
                                        if(jT_nota3AlterarNota.getText().equals("")){
                                             model.setNota3(0);
                                        }else{
                                            model.setNota3(Float.parseFloat(jT_nota3AlterarNota.getText()));
                                        }
                                        if(jT_nota2AlterarNota.getText().equals("")){
                                             model.setNota2(0);
                                        }else{
                                            model.setNota2(Float.parseFloat(jT_nota2AlterarNota.getText()));
                                        }
                                        if(jT_nota1AlterarNota.getText().equals("")){
                                             model.setNota1(0);
                                        }else{
                                            model.setNota1(Float.parseFloat(jT_nota1AlterarNota.getText()));
                                        }
                                    control.alterarNota(model);
                                    JOptionPane.showMessageDialog(null,"Notas alteradas com sucesso!");
                                    jT_nota1AlterarNota.setText("");
                                    jT_matriculaalunoAlterarNota.setText("");
                                    jT_codigoturmaAlterarNota.setText("");
                                    jT_buscarAlterarNota.setText("");
                                    jT_nota2AlterarNota.setText("");
                                    jT_nota3AlterarNota.setText("");  
                                    codigoMatriculaMudado=-1;
                                    codigoTurmaMudado=-1;                        
                                    buscou=0;
                                } catch (SQLException ex) {
                                    Logger.getLogger(JFrame_alterarNota.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        }else{
                            JOptionPane.showMessageDialog(null,"A matricula a qual você digitou, não existe!");
                            codigoMatriculaMudado=-1;
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"O código da turma o qual você digitou, não existe!");
                        codigoTurmaMudado=-1;
                    }
                }
        }else{
            JOptionPane.showMessageDialog(null, "Você deve buscar um código de nota primeiro!");
            jT_nota1AlterarNota.setText("");
            jT_matriculaalunoAlterarNota.setText("");
            jT_codigoturmaAlterarNota.setText("");
            jT_buscarAlterarNota.setText("");
            jT_nota2AlterarNota.setText("");
            jT_nota3AlterarNota.setText("");  
            jT_buscarAlterarNota.setText("");
            codigoMatriculaMudado=-1;
            codigoTurmaMudado=-1;
            buscou=0;
        }
    }//GEN-LAST:event_jB_confirmarAlterarNotaActionPerformed

    private void jT_codigoturmaAlterarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_codigoturmaAlterarNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_codigoturmaAlterarNotaActionPerformed

    private void jT_matriculaalunoAlterarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_matriculaalunoAlterarNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_matriculaalunoAlterarNotaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_cadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_cadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_cadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_cadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_alterarNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_buscarAlterarNota;
    private javax.swing.JButton jB_cancelarAlterarCurso;
    private javax.swing.JButton jB_confirmarAlterarNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_buscarAlterarNota;
    private javax.swing.JTextField jT_codigoturmaAlterarNota;
    private javax.swing.JTextField jT_matriculaalunoAlterarNota;
    private javax.swing.JTextField jT_nota1AlterarNota;
    private javax.swing.JTextField jT_nota2AlterarNota;
    private javax.swing.JTextField jT_nota3AlterarNota;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
