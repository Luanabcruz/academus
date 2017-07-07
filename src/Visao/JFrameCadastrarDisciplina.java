/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.CursoDAO;
import Controle.DisciplinaDAO;
import Modelo.Curso;
import Modelo.Disciplina;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author laercio
 */
public class JFrameCadastrarDisciplina extends javax.swing.JFrame {
    
    Disciplina model = new Disciplina();
    DisciplinaDAO controle = new DisciplinaDAO();

    /**
     * Creates new form JFrame_cadastrarDisciplina
     */
    public JFrameCadastrarDisciplina() {
        initComponents();
        setLocationRelativeTo(null);
        PopularCurso(); 
    }

    /**
     *
     */
    private void PopularCurso(){
        jComboBox_listaCursos.removeAllItems();
        CursoDAO dao = new CursoDAO();
        ArrayList<Curso> listaDeCursos = new ArrayList();
        
        try {
            listaDeCursos = dao.visualizarCursos();
            Iterator it = listaDeCursos.iterator();
            for (Curso listaDeCurso : listaDeCursos) {
                jComboBox_listaCursos.addItem(listaDeCurso);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao listar combobox!");
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

        jFrame1 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        Jt_nomeCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jt_cargaHorario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jT_conceito = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jB_cadastrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jT_descricao = new javax.swing.JTextPane();
        jB_cadastrar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jT_nomeDisciplina = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jT_descricaoDisciplina = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jT_creditoDisciplina = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jB_cadastrarDisciplina = new javax.swing.JButton();
        jB_cancelarDisciplina = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jComboBox_listaCursos = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setBackground(new java.awt.Color(153, 153, 0));
        jFrame1.getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 44, 68));
        jLabel2.setText("Nome");
        jFrame1.getContentPane().add(jLabel2);
        jLabel2.setBounds(25, 104, 37, 27);

        Jt_nomeCurso.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        Jt_nomeCurso.setForeground(new java.awt.Color(36, 44, 68));
        jFrame1.getContentPane().add(Jt_nomeCurso);
        Jt_nomeCurso.setBounds(25, 137, 349, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/curso.fw.png"))); // NOI18N
        jFrame1.getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 10, 32, 32);

        jLabel1.setBackground(new java.awt.Color(36, 44, 68));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Curso");
        jLabel1.setOpaque(true);
        jFrame1.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 708, 57);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 44, 68));
        jLabel3.setText("Carga Horária");
        jFrame1.getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 104, 110, 27);

        Jt_cargaHorario.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        Jt_cargaHorario.setForeground(new java.awt.Color(36, 44, 68));
        jFrame1.getContentPane().add(Jt_cargaHorario);
        Jt_cargaHorario.setBounds(450, 137, 100, 30);

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 44, 68));
        jLabel5.setText("Descrição");
        jFrame1.getContentPane().add(jLabel5);
        jLabel5.setBounds(25, 200, 90, 27);

        jT_conceito.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_conceito.setForeground(new java.awt.Color(36, 44, 68));
        jFrame1.getContentPane().add(jT_conceito);
        jT_conceito.setBounds(450, 230, 100, 30);

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 44, 68));
        jLabel6.setText("Conceito");
        jFrame1.getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 200, 110, 27);

        jB_cadastrar.setBackground(new java.awt.Color(255, 51, 51));
        jB_cadastrar.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jB_cadastrar.setText("Cancelar");
        jB_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cadastrarActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jB_cadastrar);
        jB_cadastrar.setBounds(330, 350, 110, 33);

        jT_descricao.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_descricao.setForeground(new java.awt.Color(36, 44, 68));
        jT_descricao.setAlignmentX(0.0F);
        jT_descricao.setAlignmentY(0.0F);
        jScrollPane3.setViewportView(jT_descricao);

        jFrame1.getContentPane().add(jScrollPane3);
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
        jFrame1.getContentPane().add(jB_cadastrar1);
        jB_cadastrar1.setBounds(460, 350, 110, 33);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/curso.fw.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(36, 44, 68));
        jLabel9.setText("Nome");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 108, 37, 27);

        jT_nomeDisciplina.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_nomeDisciplina.setForeground(new java.awt.Color(36, 44, 68));
        getContentPane().add(jT_nomeDisciplina);
        jT_nomeDisciplina.setBounds(20, 141, 349, 30);

        jT_descricaoDisciplina.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_descricaoDisciplina.setForeground(new java.awt.Color(36, 44, 68));
        jT_descricaoDisciplina.setAlignmentX(0.0F);
        jT_descricaoDisciplina.setAlignmentY(0.0F);
        jScrollPane4.setViewportView(jT_descricaoDisciplina);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(20, 251, 360, 70);

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 44, 68));
        jLabel10.setText("Descrição");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(25, 221, 122, 27);

        jT_creditoDisciplina.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_creditoDisciplina.setForeground(new java.awt.Color(36, 44, 68));
        getContentPane().add(jT_creditoDisciplina);
        jT_creditoDisciplina.setBounds(636, 291, 100, 30);

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(36, 44, 68));
        jLabel11.setText("Crédito");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(636, 258, 110, 27);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(475, 251, 75, 70);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/curso.fw.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(290, 10, 32, 32);

        jLabel14.setBackground(new java.awt.Color(36, 44, 68));
        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Cadastrar Disciplina");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 851, 57);

        jB_cadastrarDisciplina.setBackground(new java.awt.Color(0, 204, 51));
        jB_cadastrarDisciplina.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_cadastrarDisciplina.setForeground(new java.awt.Color(255, 255, 255));
        jB_cadastrarDisciplina.setText("Cadastrar");
        jB_cadastrarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cadastrarDisciplinaActionPerformed(evt);
            }
        });
        getContentPane().add(jB_cadastrarDisciplina);
        jB_cadastrarDisciplina.setBounds(506, 355, 148, 33);

        jB_cancelarDisciplina.setBackground(new java.awt.Color(255, 51, 51));
        jB_cancelarDisciplina.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_cancelarDisciplina.setForeground(new java.awt.Color(255, 255, 255));
        jB_cancelarDisciplina.setText("Cancelar");
        jB_cancelarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cancelarDisciplinaActionPerformed(evt);
            }
        });
        getContentPane().add(jB_cancelarDisciplina);
        jB_cancelarDisciplina.setBounds(338, 355, 148, 33);

        jLabel15.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(36, 44, 68));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(668, 167, 110, 0);

        jComboBox_listaCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_listaCursosActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_listaCursos);
        jComboBox_listaCursos.setBounds(636, 141, 28, 20);

        jLabel16.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(36, 44, 68));
        jLabel16.setText("Curso");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(636, 108, 40, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_cadastrarActionPerformed

    private void jB_cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cadastrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_cadastrar1ActionPerformed

    private void jB_cadastrarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cadastrarDisciplinaActionPerformed
        
        model.setNomeDisc(jT_nomeDisciplina.getText());
        //model.setCursoCod((int) jComboBox_listaCursos.getSelectedItem());//Implementar o autocomplete no jTextField. 
        model.setCredito(Integer.parseInt(jT_creditoDisciplina.getText()));
        model.setDescricao(jT_descricaoDisciplina.getText());
        try {
            controle.cadastrarDisciplina(model);
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

            jT_nomeDisciplina.setText("");
            jComboBox_listaCursos.getSelectedItem();
            jT_creditoDisciplina.setText("");
            jT_descricaoDisciplina.setText("");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao cadastrar no banco de dados!");
        }
        
    }//GEN-LAST:event_jB_cadastrarDisciplinaActionPerformed

    private void jB_cancelarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cancelarDisciplinaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jB_cancelarDisciplinaActionPerformed

    private void jComboBox_listaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_listaCursosActionPerformed
        
//        jComboBox_listaCursos.removeAllItems();
//        CursoDAO dao = new CursoDAO();
//        ArrayList listaDeCursos = new ArrayList();
//        
//        try {
//            listaDeCursos = dao.visualizarCursos();
//            Iterator it = listaDeCursos.iterator();
//            while(it.hasNext()){
//                //jComboBox_listaCursos.addItem(it.next());
//               //DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(listaDeCursos.toArray());
//               //jComboBox_listaCursos.setModel(defaultComboBox);
//                jComboBox_listaCursos.addItem(it);
//                System.out.println("steste" + it);
//               
//            }
//            JOptionPane.showMessageDialog(null, "Listado com sucesso");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error ao listar combobox!");
//        }
    }//GEN-LAST:event_jComboBox_listaCursosActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCadastrarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

             //</editor-fold>
   /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
             new JFrameCadastrarDisciplina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jt_cargaHorario;
    private javax.swing.JTextField Jt_nomeCurso;
    private javax.swing.JButton jB_cadastrar;
    private javax.swing.JButton jB_cadastrar1;
    private javax.swing.JButton jB_cadastrarDisciplina;
    private javax.swing.JButton jB_cancelarDisciplina;
    private javax.swing.JComboBox<Object> jComboBox_listaCursos;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jT_conceito;
    private javax.swing.JTextField jT_creditoDisciplina;
    private javax.swing.JTextPane jT_descricao;
    private javax.swing.JTextPane jT_descricaoDisciplina;
    private javax.swing.JTextField jT_nomeDisciplina;
    // End of variables declaration//GEN-END:variables
}
