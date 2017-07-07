package Visao;

import Controle.ProfessorDAO;
import Modelo.Professor;
import Modelo.Turma;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


/* 
DADOS PARA TURMAS

     int codTurma;
     Curso curso;
     Periodo periodo;
     int sala;
     String horario;
     Disciplina disciplina;
     Professor professor;

*/


public class JFrameListarTurma extends javax.swing.JFrame {
    
    /**
     *Turma que contém dados para a listagem
     */
    
    private ArrayList<Turma> aLTurma;
    private Professor professor;
    private ProfessorDAO professorDAO;

    private DefaultTableModel modeloTable;
    
    
    
    public JFrameListarTurma() throws SQLException {
        initComponents();
        getContentPane().setBackground(Color.white);
        
       this.aLTurma = professorDAO.buscarProfTurma(professor.getSiape());
        
        
        //configura tabela
        this.configTable();       
        
        
    }
    
    public void invisivel(){
        

    }
    
    public void configTable(){
        String cod, nome, sala, horario, dados_linha;
        modeloTable = (DefaultTableModel) jTListaTurmas.getModel();
        jTListaTurmas.getColumnModel().getColumn(0).setHeaderValue("Disciplinas");
        jTListaTurmas.getColumnModel().getColumn(1).setHeaderValue("Local(Sala)");
        jTListaTurmas.getColumnModel().getColumn(2).setHeaderValue("Horário");
        
        jTListaTurmas.getTableHeader().setResizingAllowed(false);
        jTListaTurmas.getTableHeader().setReorderingAllowed(false);
        jTListaTurmas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTListaTurmas.isCellEditable(1, 1);
        
        
        
        for (Turma turma: aLTurma){
            
            modeloTable.addRow(new Object[] {turma.getDisciplina().getDescricao(), turma.getSala(), turma.getHorario()});
        }
        
        jTListaTurmas.updateUI();
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jB_confirmarExcluirDisciplina = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        int linhas = 10;
        int colunas = 3;
        jTListaTurmas = new javax.swing.JTable(linhas, colunas ){
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            }

        };

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/curso.fw.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 10, 32, 32);

        jLabel1.setBackground(new java.awt.Color(36, 44, 68));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista Turmas");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 50);

        jB_confirmarExcluirDisciplina.setBackground(new java.awt.Color(0, 204, 51));
        jB_confirmarExcluirDisciplina.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_confirmarExcluirDisciplina.setForeground(new java.awt.Color(255, 255, 255));
        jB_confirmarExcluirDisciplina.setText("Fechar");
        jB_confirmarExcluirDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_confirmarExcluirDisciplinaActionPerformed(evt);
            }
        });
        getContentPane().add(jB_confirmarExcluirDisciplina);
        jB_confirmarExcluirDisciplina.setBounds(630, 460, 110, 34);

        jTListaTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTListaTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTListaTurmasMouseClicked(evt);
            }
        });
        jTListaTurmas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTListaTurmasComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(jTListaTurmas);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 70, 730, 380);

        setSize(new java.awt.Dimension(773, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_confirmarExcluirDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_confirmarExcluirDisciplinaActionPerformed

    }//GEN-LAST:event_jB_confirmarExcluirDisciplinaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "teste");
    }//GEN-LAST:event_formWindowOpened

    private void jTListaTurmasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTListaTurmasComponentShown
        
 
        

    }//GEN-LAST:event_jTListaTurmasComponentShown

    private void jTListaTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTListaTurmasMouseClicked
        // TODO add your handling code here:
        
        if (evt.getClickCount() == 2){
            
            JOptionPane.showMessageDialog(rootPane, jTListaTurmas.getSelectedRow()+","+jTListaTurmas.getSelectedColumn());
        }
        
        
        
    }//GEN-LAST:event_jTListaTurmasMouseClicked

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new JFrameListarTurma().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(JFrameListarTurma.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_confirmarExcluirDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTListaTurmas;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
