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
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */
public class JFrameAlterarNota extends javax.swing.JFrame {
    Nota model = new Nota();
    NotaDAO control = new NotaDAO();
    int buscou=0;
    int codigoMatriculaMudado=-1;
    int codigoTurmaMudado=-1;
    int siape=1;
    int codTuma=3;
    
    /**
     * Creates new form cadastrarCurso
     */
    public JFrameAlterarNota() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jB_cancelarAlterarCurso = new javax.swing.JButton();
        jB_buscarAlterarNota = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jT_nota1AlterarNota = new javax.swing.JTextField();
        jT_buscarAlterarNota = new javax.swing.JTextField();
        jB_confirmarAlterarNota = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jT_nota2AlterarNota = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jT_nota3AlterarNota = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBuscaNota = new javax.swing.JTable();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        getContentPane().setLayout(null);

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
        jB_cancelarAlterarCurso.setBounds(330, 480, 110, 33);

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
        jLabel7.setBounds(30, 330, 200, 27);

        jT_nota1AlterarNota.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_nota1AlterarNota.setForeground(new java.awt.Color(36, 44, 68));
        jT_nota1AlterarNota.setText(" ");
        getContentPane().add(jT_nota1AlterarNota);
        jT_nota1AlterarNota.setBounds(30, 300, 190, 30);

        jT_buscarAlterarNota.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_buscarAlterarNota.setForeground(new java.awt.Color(36, 44, 68));
        jT_buscarAlterarNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_buscarAlterarNotaKeyReleased(evt);
            }
        });
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
        jB_confirmarAlterarNota.setBounds(460, 480, 110, 33);

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 44, 68));
        jLabel8.setText("Nota 1");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 270, 200, 27);

        jT_nota2AlterarNota.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_nota2AlterarNota.setForeground(new java.awt.Color(36, 44, 68));
        jT_nota2AlterarNota.setText(" ");
        getContentPane().add(jT_nota2AlterarNota);
        jT_nota2AlterarNota.setBounds(30, 360, 190, 30);

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 44, 68));
        jLabel10.setText("Nota 3");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 390, 200, 27);

        jT_nota3AlterarNota.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_nota3AlterarNota.setForeground(new java.awt.Color(36, 44, 68));
        jT_nota3AlterarNota.setText(" ");
        getContentPane().add(jT_nota3AlterarNota);
        jT_nota3AlterarNota.setBounds(30, 420, 190, 30);

        jTableBuscaNota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Codigo Turma", "Nota 1", "Nota 2", "Nota 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBuscaNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBuscaNotaMouseClicked(evt);
            }
        });
        jTableBuscaNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableBuscaNotaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableBuscaNota);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 140, 490, 110);

        setSize(new java.awt.Dimension(724, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_cancelarAlterarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cancelarAlterarCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_cancelarAlterarCursoActionPerformed

    private void jB_buscarAlterarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscarAlterarNotaActionPerformed
        
        
    }//GEN-LAST:event_jB_buscarAlterarNotaActionPerformed

    private void jB_confirmarAlterarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_confirmarAlterarNotaActionPerformed
        int linha = jTableBuscaNota.getSelectedRow();
        
        model=null;
        try {
            model = control.buscarNota(Integer.parseInt(jTableBuscaNota.getValueAt(linha,0).toString()));
        } catch (SQLException ex) {
            Logger.getLogger(JFrameAlterarAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(model==null){
            /*}else if(model.getUniversidadeCod()!=(Integer.parseInt(jT_universidadeAlterarCurso.getText()))){
                    JOptionPane.showMessageDialog(null,"Número da universidade não pode ser alterado!");*/
                    Turma modelVerifica = new Turma();
                    TurmaDAO controlVerifica = new TurmaDAO();
                    Aluno modelVerificaAluno = new Aluno();
                    AlunoDAO controlVerificaAluno = new AlunoDAO();
                        try {
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
                            jT_buscarAlterarNota.setText("");
                            jT_nota2AlterarNota.setText("");
                            jT_nota3AlterarNota.setText("");  
                            codigoMatriculaMudado=-1;
                            codigoTurmaMudado=-1;                        
                            buscou=0;
                        } catch (SQLException ex) {
                            Logger.getLogger(JFrameAlterarNota.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
        }
    }//GEN-LAST:event_jB_confirmarAlterarNotaActionPerformed

    private void jTableBuscaNotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBuscaNotaMouseClicked
         int codNota =(Integer.parseInt(jT_buscarAlterarNota.getText()));
             try {
                 model = control.buscarNota(codNota);
                    if(model!=null){
                        jT_nota1AlterarNota.setText(String.valueOf(model.getNota1()));
                        jT_nota2AlterarNota.setText(String.valueOf(model.getNota2()));
                        jT_nota3AlterarNota.setText(String.valueOf(model.getNota3()));
                        buscou=1;
                    }else{
                        jT_nota1AlterarNota.setText("");
                        jT_buscarAlterarNota.setText("");
                        jT_nota2AlterarNota.setText("");
                        jT_nota3AlterarNota.setText("");
                        buscou=0;
                        JOptionPane.showMessageDialog(null, "Esta Nota não existe!");
                    }
             } catch (SQLException ex) {
                 Logger.getLogger(JFrameAlterarNota.class.getName()).log(Level.SEVERE, null, ex);
             }
        int linha = jTableBuscaNota.getSelectedRow();
        model=null;
        try {
            model = control.buscarNota(Integer.parseInt(jTableBuscaNota.getValueAt(linha,0).toString()));
        } catch (SQLException ex) {
            Logger.getLogger(JFrameAlterarAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(model!=null){
            try {
                model=null;
                model = control.buscarNota(Integer.parseInt(jTableBuscaNota.getValueAt(linha,0).toString()));
                //jT_nomealunoAlterarAluno.setText(jTableBuscaAluno.getValueAt(linha,0).toString());
                jT_nota1AlterarNota.setText(String.valueOf(model.getNota1()));
                jT_nota2AlterarNota.setText(String.valueOf(model.getNota2()));
                jT_nota3AlterarNota.setText(String.valueOf(model.getNota3()));
                buscou=1;
            } catch (SQLException ex) {
                Logger.getLogger(JFrameAlterarAluno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTableBuscaNotaMouseClicked

    private void jTableBuscaNotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableBuscaNotaKeyReleased

    }//GEN-LAST:event_jTableBuscaNotaKeyReleased

    private void jT_buscarAlterarNotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_buscarAlterarNotaKeyReleased
        Vector cabecalho = new  Vector();
        Vector teste =  new  Vector();
        System.out.println("Luana show");
        ArrayList<Nota> notas = new ArrayList<>();
        cabecalho.add("Codigo de Turma");
        cabecalho.add("Nota 1");
        cabecalho.add("Nota 2");
        cabecalho.add("Nota 3");
        AlunoDAO alunoArray =  new AlunoDAO();
        try {
            notas = alunoArray.turmasNotasAlunoProfessor(codTuma, siape);
            System.out.println(notas.get(0).getAluno().getNome());
        } catch (SQLException ex) {
            Logger.getLogger(JFrameAlterarNota.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<notas.size();i++){
            teste.add(notas.get(i).getAluno().getNome());
            teste.add(notas.get(i).getNota1());
            teste.add(notas.get(i).getNota2());
            teste.add(notas.get(i).getNota3());
        }
        
        try {
             DefaultTableModel nv = new DefaultTableModel(teste,cabecalho);
             jTableBuscaNota.setModel(nv);
         } catch (Exception ex) {
             Logger.getLogger(JFrameAlterarAluno.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        if(!jT_buscarAlterarCoordenador.getText().equals("")){
            try {
                DefaultTableModel nv = new DefaultTableModel(controle.Pesquisar(jT_buscarAlterarCoordenador.getText()),cabecalho);
                jTableBuscaCoordenador.setModel(nv);
            } catch (Exception ex) {
                Logger.getLogger(JFrameAlterarAluno.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       
    }//GEN-LAST:event_jT_buscarAlterarNotaKeyReleased

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
            java.util.logging.Logger.getLogger(JFrameAlterarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAlterarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAlterarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAlterarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAlterarNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_buscarAlterarNota;
    private javax.swing.JButton jB_cancelarAlterarCurso;
    private javax.swing.JButton jB_confirmarAlterarNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jT_buscarAlterarNota;
    private javax.swing.JTextField jT_nota1AlterarNota;
    private javax.swing.JTextField jT_nota2AlterarNota;
    private javax.swing.JTextField jT_nota3AlterarNota;
    private javax.swing.JTable jTableBuscaNota;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
