package Visao;

import Controle.AlunoDAO;
import Modelo.Aluno;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class JFrameListarAluno extends javax.swing.JFrame {
    private Aluno model = new Aluno();
    private AlunoDAO controle = new AlunoDAO();
   
    private DefaultTableModel modeloTable;
    private ArrayList<Aluno> aLAlunos;

    public JFrameListarAluno() throws SQLException {
        initComponents();
        getContentPane().setBackground(Color.white);
        
        
        //Lista de alunos.
        try{
            this.aLAlunos = controle.visualizarAlunos();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar lista de alunos");
        }
        
        
        //Configura a tabela de lista de alunos
        this.configTable();
    }
    
    
    private void configTable(){
        String cod, nome;
        this.modeloTable = (DefaultTableModel) jTListaAluno.getModel();
        jTListaAluno.getColumnModel().getColumn(0).setHeaderValue("Matrícula");
        jTListaAluno.getColumnModel().getColumn(1).setHeaderValue("Nome");
        jTListaAluno.getTableHeader().setResizingAllowed(false);
        jTListaAluno.getTableHeader().setReorderingAllowed(false);
        jTListaAluno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //jTListaAluno.isCellEditable(1, 1);
        
        try{
            //seta dados na tabela lista de alunos usando Interators
            aLAlunos.stream().forEach((aluno) -> {
                modeloTable.addRow(new Object[] {aluno.getMatricula(), aluno.getNome()});
            });
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao listar Alunos");
        }
        
        jTListaAluno.updateUI();
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
        jB_fecharListarCoordenador = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        int linhas = 100, colunas = 2;
        jTListaAluno = new javax.swing.JTable(linhas, colunas ){
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            }
        };

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/curso.fw.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 10, 32, 32);

        jLabel1.setBackground(new java.awt.Color(36, 44, 68));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista Alunos");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 708, 57);

        jB_fecharListarCoordenador.setBackground(new java.awt.Color(0, 204, 51));
        jB_fecharListarCoordenador.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_fecharListarCoordenador.setForeground(new java.awt.Color(255, 255, 255));
        jB_fecharListarCoordenador.setText("Fechar");
        jB_fecharListarCoordenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_fecharListarCoordenadorActionPerformed(evt);
            }
        });
        getContentPane().add(jB_fecharListarCoordenador);
        jB_fecharListarCoordenador.setBounds(600, 370, 110, 34);

        jTListaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nome"
            }
        ));
        jScrollPane2.setViewportView(jTListaAluno);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 60, 710, 290);

        setSize(new java.awt.Dimension(724, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_fecharListarCoordenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_fecharListarCoordenadorActionPerformed
        this.dispose();
    }//GEN-LAST:event_jB_fecharListarCoordenadorActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new JFrameListarAluno().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(JFrameListarAluno.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_fecharListarCoordenador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTListaAluno;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}