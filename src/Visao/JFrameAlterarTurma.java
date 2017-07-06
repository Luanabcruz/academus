/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelo.Curso;
import Controle.CursoDAO;
import Controle.DisciplinaDAO;
import Controle.PeriodoDAO;
import Controle.ProfessorDAO;
import Controle.TurmaDAO;
import Modelo.Disciplina;
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
public class JFrameAlterarTurma extends javax.swing.JFrame {
    Turma model = new Turma();
    TurmaDAO control = new TurmaDAO();
    int buscou=0;
    int codigoCursoMudado=-1;
    int codigoSiapeMudado=-1;
    int codigoPeriodoMudado=-1;
    /**
     * Creates new form cadastrarCurso
     */
    public JFrameAlterarTurma() {
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
        jT_codigocursoAlterarTurma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jB_cancelarAlterarCurso = new javax.swing.JButton();
        jB_buscarAlterarTurma = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jT_codigoperiodoAlterarTurma = new javax.swing.JTextField();
        jT_buscarAlterarTurma = new javax.swing.JTextField();
        jB_confirmarAlterarTurma = new javax.swing.JButton();
        jT_siapeprofessorAlterarTurma = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jT_salaAlterarTurma = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jT_horarioAlterarTurma = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jT_codigodisciplinaAlterarTurma = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 44, 68));
        jLabel2.setText("Código do Curso");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 140, 110, 27);

        jT_codigocursoAlterarTurma.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_codigocursoAlterarTurma.setForeground(new java.awt.Color(36, 44, 68));
        jT_codigocursoAlterarTurma.setText(" ");
        jT_codigocursoAlterarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_codigocursoAlterarTurmaActionPerformed(evt);
            }
        });
        getContentPane().add(jT_codigocursoAlterarTurma);
        jT_codigocursoAlterarTurma.setBounds(20, 170, 349, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/curso.fw.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 10, 32, 32);

        jLabel1.setBackground(new java.awt.Color(36, 44, 68));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alterar dados da Turma");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 708, 57);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 44, 68));
        jLabel3.setText("Buscar Código da Turma");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 220, 27);

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 44, 68));
        jLabel5.setText("SIAPE do professor da turma");
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

        jB_buscarAlterarTurma.setBackground(new java.awt.Color(0, 204, 51));
        jB_buscarAlterarTurma.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_buscarAlterarTurma.setForeground(new java.awt.Color(255, 255, 255));
        jB_buscarAlterarTurma.setText("Buscar");
        jB_buscarAlterarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscarAlterarTurmaActionPerformed(evt);
            }
        });
        getContentPane().add(jB_buscarAlterarTurma);
        jB_buscarAlterarTurma.setBounds(160, 100, 110, 33);

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 44, 68));
        jLabel7.setText("Sala da Turma");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(420, 200, 200, 27);

        jT_codigoperiodoAlterarTurma.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_codigoperiodoAlterarTurma.setForeground(new java.awt.Color(36, 44, 68));
        jT_codigoperiodoAlterarTurma.setText(" ");
        getContentPane().add(jT_codigoperiodoAlterarTurma);
        jT_codigoperiodoAlterarTurma.setBounds(420, 170, 190, 30);

        jT_buscarAlterarTurma.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_buscarAlterarTurma.setForeground(new java.awt.Color(36, 44, 68));
        getContentPane().add(jT_buscarAlterarTurma);
        jT_buscarAlterarTurma.setBounds(20, 100, 100, 30);

        jB_confirmarAlterarTurma.setBackground(new java.awt.Color(0, 204, 51));
        jB_confirmarAlterarTurma.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_confirmarAlterarTurma.setForeground(new java.awt.Color(255, 255, 255));
        jB_confirmarAlterarTurma.setText("Confirmar");
        jB_confirmarAlterarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_confirmarAlterarTurmaActionPerformed(evt);
            }
        });
        getContentPane().add(jB_confirmarAlterarTurma);
        jB_confirmarAlterarTurma.setBounds(460, 350, 110, 33);

        jT_siapeprofessorAlterarTurma.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_siapeprofessorAlterarTurma.setForeground(new java.awt.Color(36, 44, 68));
        jT_siapeprofessorAlterarTurma.setText(" ");
        jT_siapeprofessorAlterarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_siapeprofessorAlterarTurmaActionPerformed(evt);
            }
        });
        getContentPane().add(jT_siapeprofessorAlterarTurma);
        jT_siapeprofessorAlterarTurma.setBounds(20, 230, 349, 30);

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 44, 68));
        jLabel8.setText("Código do periodo da turma");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 140, 200, 27);

        jT_salaAlterarTurma.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_salaAlterarTurma.setForeground(new java.awt.Color(36, 44, 68));
        jT_salaAlterarTurma.setText(" ");
        getContentPane().add(jT_salaAlterarTurma);
        jT_salaAlterarTurma.setBounds(420, 230, 190, 30);

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 44, 68));
        jLabel10.setText("Horário da Turma");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(420, 260, 200, 27);

        jT_horarioAlterarTurma.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_horarioAlterarTurma.setForeground(new java.awt.Color(36, 44, 68));
        jT_horarioAlterarTurma.setText(" ");
        getContentPane().add(jT_horarioAlterarTurma);
        jT_horarioAlterarTurma.setBounds(420, 290, 190, 30);

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 44, 68));
        jLabel6.setText("Código da Disciplina");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 260, 210, 27);

        jT_codigodisciplinaAlterarTurma.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_codigodisciplinaAlterarTurma.setForeground(new java.awt.Color(36, 44, 68));
        jT_codigodisciplinaAlterarTurma.setText(" ");
        jT_codigodisciplinaAlterarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_codigodisciplinaAlterarTurmaActionPerformed(evt);
            }
        });
        getContentPane().add(jT_codigodisciplinaAlterarTurma);
        jT_codigodisciplinaAlterarTurma.setBounds(20, 290, 349, 30);

        setSize(new java.awt.Dimension(724, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_cancelarAlterarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cancelarAlterarCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_cancelarAlterarCursoActionPerformed

    private void jB_buscarAlterarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscarAlterarTurmaActionPerformed
         if(!(jT_buscarAlterarTurma.getText().equals(""))){
             int codTurma =(Integer.parseInt(jT_buscarAlterarTurma.getText()));
             try {
                 model = control.buscarTurma(codTurma);
                    if(model!=null){
                        jT_codigoperiodoAlterarTurma.setText(String.valueOf(model.getPeriodoCod()));
                        jT_siapeprofessorAlterarTurma.setText(String.valueOf(model.getSiape()));
                        jT_codigocursoAlterarTurma.setText(String.valueOf(model.getCursoCod()));
                        jT_salaAlterarTurma.setText(String.valueOf(model.getSala()));
                        jT_horarioAlterarTurma.setText(String.valueOf(model.getHorario()));
                        codigoCursoMudado=model.getCursoCod();
                        codigoPeriodoMudado=model.getPeriodoCod();
                        codigoSiapeMudado=model.getSiape();
                        buscou=1;
                    }else{
                        jT_codigoperiodoAlterarTurma.setText("");
                        jT_siapeprofessorAlterarTurma.setText("");
                        jT_codigocursoAlterarTurma.setText("");
                        jT_buscarAlterarTurma.setText("");
                        jT_salaAlterarTurma.setText("");
                        jT_horarioAlterarTurma.setText("");
                        codigoCursoMudado=-1;
                        codigoPeriodoMudado=-1;
                        codigoSiapeMudado=-1;
                        buscou=0;
                        JOptionPane.showMessageDialog(null, "Esta Turma não existe!");
                    }
             } catch (SQLException ex) {
                 Logger.getLogger(JFrameAlterarTurma.class.getName()).log(Level.SEVERE, null, ex);
             }
        }else{
            JOptionPane.showMessageDialog(null, "Insira algum número no campo para buscar uma Turma!");
            jT_codigoperiodoAlterarTurma.setText("");
            jT_siapeprofessorAlterarTurma.setText("");
            jT_codigocursoAlterarTurma.setText("");
            jT_buscarAlterarTurma.setText("");
            jT_salaAlterarTurma.setText("");
            jT_horarioAlterarTurma.setText("");
            codigoCursoMudado=-1;
            codigoPeriodoMudado=-1;
            codigoSiapeMudado=-1;
            buscou=0;
         }
    }//GEN-LAST:event_jB_buscarAlterarTurmaActionPerformed

    private void jB_confirmarAlterarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_confirmarAlterarTurmaActionPerformed
        if(buscou==1){
            /*}else if(model.getUniversidadeCod()!=(Integer.parseInt(jT_universidadeAlterarCurso.getText()))){
                    JOptionPane.showMessageDialog(null,"Número da universidade não pode ser alterado!");*/
                if((jT_horarioAlterarTurma.getText().equals(""))||(jT_salaAlterarTurma.getText().equals(""))||(jT_codigocursoAlterarTurma.getText().equals(""))||(jT_codigoperiodoAlterarTurma.getText().equals(""))||(jT_siapeprofessorAlterarTurma.getText().equals("")))
                {
                    JOptionPane.showMessageDialog(null,"Todos os campos devem ser preenchidos!");
                }else{
                    Curso modelVerifica = new Curso();
                    CursoDAO controlVerifica = new CursoDAO();
                    Periodo modelVerificaPeriodo = new Periodo();
                    PeriodoDAO controlVerificaPeriodo = new PeriodoDAO();
                    Professor modelVerificaSiape = new Professor();
                    ProfessorDAO controlVerificaSiape = new ProfessorDAO();
                        if(codigoCursoMudado!=Integer.parseInt(jT_codigocursoAlterarTurma.getText())){
                            try {
                                modelVerifica = controlVerifica.buscarCurso(Integer.parseInt(jT_codigocursoAlterarTurma.getText()));
                            } catch (SQLException ex) {
                                Logger.getLogger(JFrameAlterarTurma.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(codigoPeriodoMudado!=Integer.parseInt(jT_codigoperiodoAlterarTurma.getText())){
                            try {
                                modelVerificaPeriodo = controlVerificaPeriodo.buscarPeriodo(Integer.parseInt(jT_codigoperiodoAlterarTurma.getText()));
                            } catch (SQLException ex) {
                                Logger.getLogger(JFrameAlterarTurma.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(codigoSiapeMudado!=Integer.parseInt(jT_siapeprofessorAlterarTurma.getText())){
                            try {
                                modelVerificaSiape = controlVerificaSiape.buscarProfessor(Integer.parseInt(jT_siapeprofessorAlterarTurma.getText()));
                            } catch (SQLException ex) {
                                Logger.getLogger(JFrameAlterarTurma.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    if(modelVerifica!=null){
                        if(modelVerificaSiape!=null){
                            if(modelVerificaPeriodo!=null){
                                try {
                                    model.setCursoCod((Integer.parseInt(jT_codigocursoAlterarTurma.getText())));
                                    model.setSiape(Integer.parseInt(jT_siapeprofessorAlterarTurma.getText()));
                                    model.setHorario(jT_horarioAlterarTurma.getText());
                                    model.setPeriodoCod(Integer.parseInt(jT_codigoperiodoAlterarTurma.getText()));
                                    model.setSala(Integer.parseInt(jT_salaAlterarTurma.getText()));
                                    control.alterarTurma(model);
                                    JOptionPane.showMessageDialog(null,"Turma alterada com sucesso!");
                                    jT_codigoperiodoAlterarTurma.setText("");
                                    jT_siapeprofessorAlterarTurma.setText("");
                                    jT_codigocursoAlterarTurma.setText("");
                                    jT_buscarAlterarTurma.setText("");
                                    jT_salaAlterarTurma.setText("");
                                    jT_horarioAlterarTurma.setText("");  
                                    codigoCursoMudado=-1;
                                    codigoPeriodoMudado=-1;
                                    codigoSiapeMudado=-1;
                                    buscou=0;
                                } catch (SQLException ex) {
                                    Logger.getLogger(JFrameAlterarTurma.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"O Código do período o qual você digitou, não existe!");
                                codigoPeriodoMudado=-1;
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"O SIAPE o qual você digitou, não existe!");
                            codigoSiapeMudado=-1;
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"O código do curso o qual você digitou, não existe!");
                        codigoCursoMudado=-1;
                    }
                }
        }else{
            JOptionPane.showMessageDialog(null, "Você deve buscar uma Turma primeiro!");
            jT_codigoperiodoAlterarTurma.setText("");
            jT_siapeprofessorAlterarTurma.setText("");
            jT_codigocursoAlterarTurma.setText("");
            jT_buscarAlterarTurma.setText("");
            jT_salaAlterarTurma.setText("");
            jT_horarioAlterarTurma.setText("");  
            jT_buscarAlterarTurma.setText("");
            codigoCursoMudado=-1;
            codigoPeriodoMudado=-1;
            codigoSiapeMudado=-1;
            buscou=0;
        }
    }//GEN-LAST:event_jB_confirmarAlterarTurmaActionPerformed

    private void jT_codigocursoAlterarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_codigocursoAlterarTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_codigocursoAlterarTurmaActionPerformed

    private void jT_siapeprofessorAlterarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_siapeprofessorAlterarTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_siapeprofessorAlterarTurmaActionPerformed

    private void jT_codigodisciplinaAlterarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_codigodisciplinaAlterarTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_codigodisciplinaAlterarTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAlterarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAlterarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAlterarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAlterarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAlterarTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_buscarAlterarTurma;
    private javax.swing.JButton jB_cancelarAlterarCurso;
    private javax.swing.JButton jB_confirmarAlterarTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_buscarAlterarTurma;
    private javax.swing.JTextField jT_codigocursoAlterarTurma;
    private javax.swing.JTextField jT_codigodisciplinaAlterarTurma;
    private javax.swing.JTextField jT_codigoperiodoAlterarTurma;
    private javax.swing.JTextField jT_horarioAlterarTurma;
    private javax.swing.JTextField jT_salaAlterarTurma;
    private javax.swing.JTextField jT_siapeprofessorAlterarTurma;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
