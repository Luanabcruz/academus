/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelo.Curso;
import Controle.CursoDAO;
import java.awt.Color;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


/**
 * 
    private int codCurso;
    private int admCod;
    private int universidadeCod;
    private String nomeCurso;
 *  private float conceitoCurso;
 *  private String descricao;
 *  private int cargaCurso;
 *  private boolean statusCurso;
 */

/**
 *
 * @author Flávio
 */
public class JFrameListarCurso extends javax.swing.JFrame {
    Curso model = new Curso();
    CursoDAO control = new CursoDAO();
   
    private DefaultTableModel modeloTable;
    /**
     * Creates new form cadastrarCurso
     */
    public JFrameListarCurso() {
        initComponents();
        getContentPane().setBackground(Color.white);
        
        
        // configura tabela de lista de cursos
        configTable();
        
    }
    
    
    public void configTable(){
        String cod, nome;
        modeloTable = (DefaultTableModel) jTListaCurso.getModel();
        jTListaCurso.getColumnModel().getColumn(0).setHeaderValue("Codigo");
        jTListaCurso.getColumnModel().getColumn(1).setHeaderValue("Nome");
        jTListaCurso.getColumnModel().getColumn(2).setHeaderValue("Conceito");
        jTListaCurso.getColumnModel().getColumn(3).setHeaderValue("Descrição");
        jTListaCurso.getColumnModel().getColumn(4).setHeaderValue("Carga Horária");
        jTListaCurso.getColumnModel().getColumn(5).setHeaderValue("Status");
        jTListaCurso.getTableHeader().setResizingAllowed(false);
        jTListaCurso.getTableHeader().setReorderingAllowed(false);
        jTListaCurso.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTListaCurso.isCellEditable(1, 1);
        
        
        jTListaCurso.updateUI();
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
        int linhas = 100, colunas = 6;
        jTListaCurso = new javax.swing.JTable(linhas, colunas ){
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
        jLabel1.setText("Lista  Cursos");
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
        jB_fecharListarCoordenador.setBounds(580, 360, 130, 34);

        jTListaCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane2.setViewportView(jTListaCurso);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 60, 710, 290);

        setSize(new java.awt.Dimension(724, 431));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_fecharListarCoordenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_fecharListarCoordenadorActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameListarCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_fecharListarCoordenador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTListaCurso;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
