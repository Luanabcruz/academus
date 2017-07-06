/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelo.Usuario;
import java.io.DataOutput;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author laercio
 */
public class JFrameCadastrarUsuario extends javax.swing.JFrame {
    Usuario model = new Usuario();
    UsuarioDAO controle = new UsuarioDAO();

    public JFrameCadastrarUsuario() {
        initComponents();
    }

    
    public void PopularUF(){
        jComboBox_ufUsuario.removeAllItems();
        UsuarioDAO user = new CursoDAO();
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

        jLabel14 = new javax.swing.JLabel();
        jLabel_nomeUsuario = new javax.swing.JLabel();
        jTextField_nomeUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField_senhaUsuario = new javax.swing.JPasswordField();
        jLabel_cpfUsuario = new javax.swing.JLabel();
        jLabel_ = new javax.swing.JLabel();
        jTextField_cpfUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_cidadeUsuario = new javax.swing.JTextField();
        jTextField_bairroUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_ufUsuario = new javax.swing.JComboBox();
        jComboBox_cidadeUsuario = new javax.swing.JComboBox();
        jLabel_foneUsuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_statusUsuario = new javax.swing.JLabel();
        jTextField_cepUsuario = new javax.swing.JTextField();
        jTextField_foneUsuario = new javax.swing.JTextField();
        jTextField_emailUsuario = new javax.swing.JTextField();
        jB_cadastrar = new javax.swing.JButton();
        jB_cadastrar1 = new javax.swing.JButton();
        jComboBox_statusUsuario = new javax.swing.JComboBox();
        jFormattedTextField_dataNascimentoUsuario = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel14.setBackground(new java.awt.Color(36, 44, 68));
        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Cadastrar Usuário");
        jLabel14.setOpaque(true);

        jLabel_nomeUsuario.setText("Nome");

        jLabel1.setText("Senha");

        jLabel_cpfUsuario.setText("CPF");

        jLabel_.setText("Data de Nascimento");

        jLabel2.setText("UF");

        jLabel3.setText("Rua");

        jLabel4.setText("Bairro");

        jLabel5.setText("Cidade");

        jComboBox_ufUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox_cidadeUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel_foneUsuario.setText("Telefone");

        jLabel7.setText("CEP");

        jLabel8.setText("e-mail");

        jLabel_statusUsuario.setText("Status");

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

        jComboBox_statusUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_emailUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_nomeUsuario)
                                    .addComponent(jTextField_nomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                    .addComponent(jLabel_cpfUsuario)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField_cidadeUsuario)
                                    .addComponent(jTextField_cpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7)
                                .addComponent(jTextField_cepUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel_)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_bairroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPasswordField_senhaUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(jFormattedTextField_dataNascimentoUsuario, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel_foneUsuario)
                            .addComponent(jTextField_foneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox_ufUsuario, 0, 105, Short.MAX_VALUE)
                            .addComponent(jComboBox_cidadeUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_statusUsuario)
                            .addComponent(jComboBox_statusUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jB_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_cadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel_cpfUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_cpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_cidadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_cepUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_nomeUsuario)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox_ufUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_cidadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel_statusUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox_statusUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField_senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_)
                                .addGap(4, 4, 4)
                                .addComponent(jFormattedTextField_dataNascimentoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_bairroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_foneUsuario)
                                .addGap(3, 3, 3)
                                .addComponent(jTextField_foneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_emailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_cadastrar)
                    .addComponent(jB_cadastrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cadastrarActionPerformed
        // TODO add your handling code here:
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
        model.setNome(jTextField_nomeUsuario.getText());
        model.setSenha(jPasswordField_senhaUsuario.getText());
        model.setCpf(jTextField_cpfUsuario.getText());
        Date out;
        model.setDataNascimento(FormatDate(jFormattedTextField_dataNascimentoUsuario.getText()));
        model.setUf((String) jComboBox_ufUsuario.getSelectedItem());
        model.setCidade((String) jComboBox_cidadeUsuario.getSelectedItem());
        model.setRua(jTextField_cidadeUsuario.getText());
        model.setBairro(jTextField_bairroUsuario.getText());
        model.setCep(jTextField_cepUsuario.getText());
        model.setTelefone(jTextField_foneUsuario.getText());
        model.setStatus((boolean) jComboBox_statusUsuario.getSelectedItem());
        model.setEmail(jTextField_emailUsuario.getText());
        
        }else {

        JOptionPane.showMessageDialog(null, "Novo usuario cadastrado com sucesso!");
        
        jTextField_nomeUsuario.setText("");
        jPasswordField_senhaUsuario.setText("");
        jTextField_cpfUsuario.setText("");
        jFormattedTextField_dataNascimentoUsuario.setText("");
        jComboBox_ufUsuario.getSelectedItem();
        jComboBox_cidadeUsuario.getSelectedItem();
        jTextField_cidadeUsuario.setText("");
        jTextField_bairroUsuario.setText("");
        jTextField_cepUsuario.setText("");
        jTextField_foneUsuario.setText("");
        jComboBox_statusUsuario.getSelectedItem();
        jTextField_emailUsuario.setText("");
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
            java.util.logging.Logger.getLogger(JFrameCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_cadastrar;
    private javax.swing.JButton jB_cadastrar1;
    private javax.swing.JComboBox jComboBox_cidadeUsuario;
    private javax.swing.JComboBox jComboBox_statusUsuario;
    private javax.swing.JComboBox jComboBox_ufUsuario;
    private javax.swing.JFormattedTextField jFormattedTextField_dataNascimentoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_;
    private javax.swing.JLabel jLabel_cpfUsuario;
    private javax.swing.JLabel jLabel_foneUsuario;
    private javax.swing.JLabel jLabel_nomeUsuario;
    private javax.swing.JLabel jLabel_statusUsuario;
    private javax.swing.JPasswordField jPasswordField_senhaUsuario;
    private javax.swing.JTextField jTextField_bairroUsuario;
    private javax.swing.JTextField jTextField_cepUsuario;
    private javax.swing.JTextField jTextField_cidadeUsuario;
    private javax.swing.JTextField jTextField_cpfUsuario;
    private javax.swing.JTextField jTextField_emailUsuario;
    private javax.swing.JTextField jTextField_foneUsuario;
    private javax.swing.JTextField jTextField_nomeUsuario;
    // End of variables declaration//GEN-END:variables
}
