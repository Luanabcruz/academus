/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.AlunoDAO;
import Modelo.Aluno;
import Modelo.Usuario;
import java.io.DataOutput;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author laercio
 */
public class JFrameCadastrarAluno extends javax.swing.JFrame {
    Usuario model = new Usuario();
    UsuarioDAO controle = new UsuarioDAO();

    public JFrameCadastrarAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    //Esse método preenche o JCombobox de UF de Cadastro de Aluno;
    public void PopularUF(){
        jComboBox_ufUsuario.removeAllItems();
        AlunoDAO dao = new AlunoDAO();
        ArrayList<Aluno> listaDeAlunos = new ArrayList();
        
        try {
            listaDeAlunos = dao.visualizarAlunos();
            Iterator it = listaDeAlunos.iterator();
            for (Aluno listaAlu : listaDeAlunos) {
                jComboBox_ufUsuario.addItem(listaAlu.getCep());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao listar UF!");
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

        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_matriculaCadAluno = new javax.swing.JTextField();
        jTextField_nomeCadAluno = new javax.swing.JTextField();
        jTextField_ruaCadAluno = new javax.swing.JTextField();
        jComboBox_ufUsuario = new javax.swing.JComboBox<Object>();
        jComboBox_cidadeUsuario = new javax.swing.JComboBox();
        jTextField_emailCadAluno = new javax.swing.JTextField();
        jB_cadastrar = new javax.swing.JButton();
        jB_cadastrar1 = new javax.swing.JButton();
        jT_cursoCadAluno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jT_cidadeCadAluno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jF_dataNascCadAluno = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jT_foneCadAluno = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jT_cepCadAluno = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jT_anoIngressoCadAluno = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jT_craCadAluno = new javax.swing.JTextField();

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 44, 68));
        jLabel10.setText("Matrícula");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel14.setBackground(new java.awt.Color(36, 44, 68));
        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Cadastrar Aluno");
        jLabel14.setOpaque(true);

        jComboBox_cidadeUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jB_cadastrar.setBackground(new java.awt.Color(255, 51, 51));
        jB_cadastrar.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jB_cadastrar.setText("Cancelar");
        jB_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cadastrarActionPerformed(evt);
            }
        });

        jB_cadastrar1.setBackground(new java.awt.Color(0, 204, 51));
        jB_cadastrar1.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_cadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        jB_cadastrar1.setText("Cadastrar");
        jB_cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cadastrar1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(36, 44, 68));
        jLabel11.setText("CEP");

        jLabel12.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(36, 44, 68));
        jLabel12.setText("Matrícula");

        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(36, 44, 68));
        jLabel13.setText("Nome");

        jLabel15.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(36, 44, 68));
        jLabel15.setText("e-mail");

        jLabel16.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(36, 44, 68));
        jLabel16.setText("Rua");

        jLabel17.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(36, 44, 68));
        jLabel17.setText("Cidade");

        jLabel18.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(36, 44, 68));
        jLabel18.setText("Curso");

        jLabel19.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(36, 44, 68));
        jLabel19.setText("Data de Nascimento");

        jLabel20.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(36, 44, 68));
        jLabel20.setText("Telefone");

        jLabel21.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(36, 44, 68));
        jLabel21.setText("Cra");

        jLabel22.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(36, 44, 68));
        jLabel22.setText("Ano de Ingresso");

        jLabel23.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(36, 44, 68));
        jLabel23.setText("Status");

        jLabel24.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(36, 44, 68));
        jLabel24.setText("UF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_matriculaCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jTextField_nomeCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ruaCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_cidadeCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField_emailCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_anoIngressoCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jT_cursoCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jF_dataNascCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jComboBox_ufUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_cidadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jT_foneCadAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(jT_cepCadAluno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_cadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addContainerGap(213, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jT_craCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24))
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_matriculaCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_anoIngressoCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_ufUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_nomeCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ruaCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel17)
                        .addGap(10, 10, 10)
                        .addComponent(jT_cidadeCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jT_cursoCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jF_dataNascCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jT_foneCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_cidadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel21)))))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel11)
                    .addComponent(jT_craCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_emailCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_cepCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_cadastrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_cadastrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cadastrarActionPerformed
        Object[] options = { "Sim", "Não" };
        int opcao = JOptionPane.showOptionDialog(null, "Deseja realmente cancelar o cadastro?", "Cancelar Cadastro", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE , null, options, options[0]);
        System.out.println("opcao "+opcao);
        
        if(opcao==0){
            System.exit(0);
            //setDefaultCloseOperation(JFrameCadastrarAluno.DISPOSE_ON_CLOSE);
        }else{}
    }//GEN-LAST:event_jB_cadastrarActionPerformed

    /**
     *Converte uma String para um objeto do tipo Date;
     * @param dateInput
     * @param date
     * @return
     */
    public Date FormatDate(String dateInput){

        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        Date dateOutput = null;
        try {
            dateOutput = (Date) formatDate.parse(dateInput);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
         
       
       return dateOutput;  
    }
    
    private void jB_cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cadastrar1ActionPerformed
        
        if(model==null){
        model.setNome(jTextField_matriculaCadAluno.getText());
        model.setSenha(jPasswordField_senhaUsuario.getText());
        model.setCpf(jTextField_nomeCadAluno.getText());
        Date out;
        model.setDataNascimento(FormatDate(jFormattedTextField_dataNascimentoUsuario.getText()));
        model.setUf((String) jComboBox_ufUsuario.getSelectedItem());
        model.setCidade((String) jComboBox_cidadeUsuario.getSelectedItem());
        model.setRua(jTextField_ruaCadAluno.getText());
        model.setBairro(jTextField_bairroUsuario.getText());
        model.setCep(jTextField_cepUsuario.getText());
        model.setTelefone(jTextField_foneUsuario.getText());
        model.setStatus((boolean) jComboBox_statusUsuario.getSelectedItem());
        model.setEmail(jTextField_emailCadAluno.getText());
        
        }else {

        JOptionPane.showMessageDialog(null, "Novo usuario cadastrado com sucesso!");
        
        jTextField_matriculaCadAluno.setText("");
        jPasswordField_senhaUsuario.setText("");
        jTextField_nomeCadAluno.setText("");
        jFormattedTextField_dataNascimentoUsuario.setText("");
        jComboBox_ufUsuario.getSelectedItem();
        jComboBox_cidadeUsuario.getSelectedItem();
        jTextField_ruaCadAluno.setText("");
        jTextField_bairroUsuario.setText("");
        jTextField_cepUsuario.setText("");
        jTextField_foneUsuario.setText("");
        jComboBox_statusUsuario.getSelectedItem();
        jTextField_emailCadAluno.setText("");
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
            java.util.logging.Logger.getLogger(JFrameCadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastrarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_cadastrar;
    private javax.swing.JButton jB_cadastrar1;
    private javax.swing.JComboBox jComboBox_cidadeUsuario;
    private javax.swing.JComboBox<Object> jComboBox_ufUsuario;
    private javax.swing.JFormattedTextField jF_dataNascCadAluno;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JTextField jT_anoIngressoCadAluno;
    private javax.swing.JTextField jT_cepCadAluno;
    private javax.swing.JTextField jT_cidadeCadAluno;
    private javax.swing.JTextField jT_craCadAluno;
    private javax.swing.JTextField jT_cursoCadAluno;
    private javax.swing.JTextField jT_foneCadAluno;
    private javax.swing.JTextField jTextField_emailCadAluno;
    private javax.swing.JTextField jTextField_matriculaCadAluno;
    private javax.swing.JTextField jTextField_nomeCadAluno;
    private javax.swing.JTextField jTextField_ruaCadAluno;
    // End of variables declaration//GEN-END:variables
}
