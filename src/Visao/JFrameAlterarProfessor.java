package Visao;

import Controle.AlunoDAO;
import Modelo.Curso;
import Controle.CursoDAO;
import Controle.DisciplinaDAO;
import Controle.ProfessorDAO;
import Modelo.Administrador;
import Modelo.Aluno;
import Modelo.Disciplina;
import Modelo.Professor;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;

public class JFrame_alterarProfessor extends javax.swing.JFrame {
    Professor model = new Professor();
    ProfessorDAO controle = new ProfessorDAO();
    int buscou=0;
    int codigoCursoMudado=-1;

    public JFrame_alterarProfessor() {
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
        jT_codigocursoAlterarProfessor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jT_nomeprofessorAlterarProfessor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jB_cancelarAlterarCurso = new javax.swing.JButton();
        jB_buscarAlterarDisciplina = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jT_cidadeAlterarProfessor = new javax.swing.JTextField();
        jT_buscarAlterarProfessor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jB_confirmarAlterarProfessor = new javax.swing.JButton();
        jT_senhaAlterarProfessor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jT_cpfAlterarProfessor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jT_nascimentoAlterarProfessor = new javax.swing.JTextField();
        jT_ufAlterarProfessor = new javax.swing.JTextField();
        jT_bairroAlterarProfessor = new javax.swing.JTextField();
        jT_cepAlterarProfessor = new javax.swing.JTextField();
        jT_telefoneAlterarProfessor = new javax.swing.JTextField();
        jT_emailAlterarProfessor = new javax.swing.JTextField();
        jT_tituloAlterarProfessor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jT_ruaAlterarProfessor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jT_statusAlterarProfessor = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 44, 68));
        jLabel2.setText("Código do Curso");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 180, 110, 30);

        jT_codigocursoAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_codigocursoAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_codigocursoAlterarProfessor.setText(" ");
        jT_codigocursoAlterarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_codigocursoAlterarProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(jT_codigocursoAlterarProfessor);
        jT_codigocursoAlterarProfessor.setBounds(20, 210, 110, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/curso.fw.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 10, 32, 32);

        jLabel1.setBackground(new java.awt.Color(36, 44, 68));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alterar dados do Professor");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 708, 57);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 44, 68));
        jLabel3.setText("Buscar SIAPE Professor");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 220, 27);

        jT_nomeprofessorAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_nomeprofessorAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_nomeprofessorAlterarProfessor.setText(" ");
        getContentPane().add(jT_nomeprofessorAlterarProfessor);
        jT_nomeprofessorAlterarProfessor.setBounds(20, 160, 280, 20);

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 44, 68));
        jLabel5.setText("Data de nascimento");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 310, 150, 20);

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

        jB_buscarAlterarDisciplina.setBackground(new java.awt.Color(0, 204, 51));
        jB_buscarAlterarDisciplina.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_buscarAlterarDisciplina.setForeground(new java.awt.Color(255, 255, 255));
        jB_buscarAlterarDisciplina.setText("Buscar");
        jB_buscarAlterarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscarAlterarDisciplinaActionPerformed(evt);
            }
        });
        getContentPane().add(jB_buscarAlterarDisciplina);
        jB_buscarAlterarDisciplina.setBounds(160, 100, 110, 33);

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 44, 68));
        jLabel7.setText("Email");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 350, 60, 20);

        jT_cidadeAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_cidadeAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_cidadeAlterarProfessor.setText(" ");
        getContentPane().add(jT_cidadeAlterarProfessor);
        jT_cidadeAlterarProfessor.setBounds(390, 120, 180, 20);

        jT_buscarAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_buscarAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        getContentPane().add(jT_buscarAlterarProfessor);
        jT_buscarAlterarProfessor.setBounds(20, 100, 120, 30);

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(36, 44, 68));
        jLabel9.setText("Nome do Aluno");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 140, 160, 20);

        jB_confirmarAlterarProfessor.setBackground(new java.awt.Color(0, 204, 51));
        jB_confirmarAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_confirmarAlterarProfessor.setForeground(new java.awt.Color(255, 255, 255));
        jB_confirmarAlterarProfessor.setText("Confirmar");
        jB_confirmarAlterarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_confirmarAlterarProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(jB_confirmarAlterarProfessor);
        jB_confirmarAlterarProfessor.setBounds(460, 350, 110, 33);

        jT_senhaAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_senhaAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_senhaAlterarProfessor.setText(" ");
        jT_senhaAlterarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_senhaAlterarProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(jT_senhaAlterarProfessor);
        jT_senhaAlterarProfessor.setBounds(20, 250, 180, 20);

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 44, 68));
        jLabel6.setText("Senha");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 230, 90, 20);

        jT_cpfAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_cpfAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_cpfAlterarProfessor.setText(" ");
        jT_cpfAlterarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_cpfAlterarProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(jT_cpfAlterarProfessor);
        jT_cpfAlterarProfessor.setBounds(20, 290, 180, 20);

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 44, 68));
        jLabel8.setText("CPF");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 270, 90, 20);

        jT_nascimentoAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_nascimentoAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_nascimentoAlterarProfessor.setText(" ");
        getContentPane().add(jT_nascimentoAlterarProfessor);
        jT_nascimentoAlterarProfessor.setBounds(20, 330, 180, 20);

        jT_ufAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_ufAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        getContentPane().add(jT_ufAlterarProfessor);
        jT_ufAlterarProfessor.setBounds(390, 160, 180, 20);

        jT_bairroAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_bairroAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_bairroAlterarProfessor.setText(" ");
        getContentPane().add(jT_bairroAlterarProfessor);
        jT_bairroAlterarProfessor.setBounds(390, 240, 180, 20);

        jT_cepAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_cepAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_cepAlterarProfessor.setText(" ");
        getContentPane().add(jT_cepAlterarProfessor);
        jT_cepAlterarProfessor.setBounds(390, 280, 180, 20);

        jT_telefoneAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_telefoneAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_telefoneAlterarProfessor.setText(" ");
        getContentPane().add(jT_telefoneAlterarProfessor);
        jT_telefoneAlterarProfessor.setBounds(390, 320, 180, 20);

        jT_emailAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_emailAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_emailAlterarProfessor.setText(" ");
        getContentPane().add(jT_emailAlterarProfessor);
        jT_emailAlterarProfessor.setBounds(20, 370, 180, 20);

        jT_tituloAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_tituloAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_tituloAlterarProfessor.setText(" ");
        getContentPane().add(jT_tituloAlterarProfessor);
        jT_tituloAlterarProfessor.setBounds(220, 210, 150, 20);

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 44, 68));
        jLabel10.setText("Uf");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(390, 140, 60, 20);

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(36, 44, 68));
        jLabel11.setText("Rua");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(390, 180, 40, 20);

        jLabel12.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(36, 44, 68));
        jLabel12.setText("Bairro");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(390, 220, 60, 20);

        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(36, 44, 68));
        jLabel13.setText("Cep");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(390, 260, 60, 20);

        jLabel14.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(36, 44, 68));
        jLabel14.setText("Telefone");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(390, 300, 60, 20);

        jT_ruaAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_ruaAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_ruaAlterarProfessor.setText(" ");
        getContentPane().add(jT_ruaAlterarProfessor);
        jT_ruaAlterarProfessor.setBounds(390, 200, 180, 20);

        jLabel15.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(36, 44, 68));
        jLabel15.setText("Cidade");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(390, 100, 60, 20);

        jLabel16.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(36, 44, 68));
        jLabel16.setText("Status");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(220, 240, 60, 20);

        jLabel17.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(36, 44, 68));
        jLabel17.setText("Titulo");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(220, 190, 60, 20);

        jT_statusAlterarProfessor.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_statusAlterarProfessor.setForeground(new java.awt.Color(36, 44, 68));
        jT_statusAlterarProfessor.setText(" ");
        jT_statusAlterarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_statusAlterarProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(jT_statusAlterarProfessor);
        jT_statusAlterarProfessor.setBounds(220, 260, 150, 20);

        setSize(new java.awt.Dimension(724, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_cancelarAlterarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cancelarAlterarCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_cancelarAlterarCursoActionPerformed

    private void jB_buscarAlterarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscarAlterarDisciplinaActionPerformed
         if(!(jT_buscarAlterarProfessor.getText().equals(""))){
             int codprofessor =(Integer.parseInt(jT_buscarAlterarProfessor.getText()));
             try {
                 model = controle.buscarProfessor(codprofessor);
                    if(model!=null){
                        jT_cidadeAlterarProfessor.setText(String.valueOf(model.getCidade()));
                        jT_senhaAlterarProfessor.setText(String.valueOf(model.getSenha()));
                        jT_codigocursoAlterarProfessor.setText(String.valueOf(model.getCursoCod()));
                        jT_nomeprofessorAlterarProfessor.setText(String.valueOf(model.getNome()));
                        jT_bairroAlterarProfessor.setText(model.getBairro());
                        jT_cepAlterarProfessor.setText(model.getCep());
                        jT_cpfAlterarProfessor.setText(model.getCpf());
                        jT_emailAlterarProfessor.setText(model.getEmail());
                        jT_nascimentoAlterarProfessor.setText(String.valueOf(model.getDataNascimento()));
                        jT_ruaAlterarProfessor.setText(model.getRua());
                        jT_senhaAlterarProfessor.setText(model.getSenha());
                        jT_tituloAlterarProfessor.setText(String.valueOf(model.getTitulo()));
                        jT_statusAlterarProfessor.setText(String.valueOf(model.getStatus()));
                        jT_telefoneAlterarProfessor.setText(model.getTelefone());
                        jT_ufAlterarProfessor.setText(model.getUf());
                        codigoCursoMudado=model.getCursoCod();
                        buscou=1;
                    }else{
                        jT_cidadeAlterarProfessor.setText("");
                        jT_senhaAlterarProfessor.setText("");
                        jT_codigocursoAlterarProfessor.setText("");
                        jT_nomeprofessorAlterarProfessor.setText("");
                        jT_bairroAlterarProfessor.setText("");
                        jT_cepAlterarProfessor.setText("");
                        jT_cpfAlterarProfessor.setText("");
                        jT_emailAlterarProfessor.setText("");
                        jT_nascimentoAlterarProfessor.setText("");
                        jT_ruaAlterarProfessor.setText("");
                        jT_senhaAlterarProfessor.setText("");
                        jT_tituloAlterarProfessor.setText("");
                        jT_telefoneAlterarProfessor.setText("");
                        jT_ufAlterarProfessor.setText("");
                        codigoCursoMudado=-1;
                        buscou=0;
                        JOptionPane.showMessageDialog(null, "Este Professor não existe!");
                    }
             } catch (SQLException ex) {
                 Logger.getLogger(JFrame_alterarProfessor.class.getName()).log(Level.SEVERE, null, ex);
             }
        }else{
            JOptionPane.showMessageDialog(null, "Insira algum número no campo para buscar um Professor");
            jT_cidadeAlterarProfessor.setText("");
            jT_senhaAlterarProfessor.setText("");
            jT_codigocursoAlterarProfessor.setText("");
            jT_nomeprofessorAlterarProfessor.setText("");
            jT_bairroAlterarProfessor.setText("");
            jT_cepAlterarProfessor.setText("");
            jT_cpfAlterarProfessor.setText("");
            jT_emailAlterarProfessor.setText("");
            jT_nascimentoAlterarProfessor.setText("");
            jT_ruaAlterarProfessor.setText("");
            jT_senhaAlterarProfessor.setText("");
            jT_tituloAlterarProfessor.setText("");
            jT_telefoneAlterarProfessor.setText("");
            jT_ufAlterarProfessor.setText("");
            codigoCursoMudado=-1;
            buscou=0;
         }
    }//GEN-LAST:event_jB_buscarAlterarDisciplinaActionPerformed

    private void jB_confirmarAlterarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_confirmarAlterarProfessorActionPerformed
        if(buscou==1){
            /*}else if(model.getUniversidadeCod()!=(Integer.parseInt(jT_universidadeAlterarCurso.getText()))){
                    JOptionPane.showMessageDialog(null,"Número da universidade não pode ser alterado!");*/
                if((jT_codigocursoAlterarProfessor.getText().equals(""))||(jT_cidadeAlterarProfessor.getText().equals(""))||(jT_senhaAlterarProfessor.getText().equals(""))||(jT_nomeprofessorAlterarProfessor.getText().equals(""))||jT_bairroAlterarProfessor.getText().equals("")||jT_cepAlterarProfessor.getText().equals("")||jT_cidadeAlterarProfessor.getText().equals("")||jT_codigocursoAlterarProfessor.getText().equals("")||jT_cpfAlterarProfessor.getText().equals("")||jT_emailAlterarProfessor.getText().equals("")||jT_nascimentoAlterarProfessor.getText().equals("")||jT_nomeprofessorAlterarProfessor.getText().equals("")||jT_tituloAlterarProfessor.getText().equals("")||jT_ruaAlterarProfessor.getText().equals("")||jT_senhaAlterarProfessor.getText().equals("")||jT_tituloAlterarProfessor.getText().equals("")||jT_telefoneAlterarProfessor.getText().equals("")||jT_ufAlterarProfessor.getText().equals(""))
                {   
                    JOptionPane.showMessageDialog(null,"Todos os campos devem ser preenchidos!");
                }else{
                    Curso modelVerifica = new Curso();
                    CursoDAO controlVerifica = new CursoDAO();
                        if(codigoCursoMudado!=Integer.parseInt(jT_codigocursoAlterarProfessor.getText())){
                            try {
                                modelVerifica = controlVerifica.buscarCurso(Integer.parseInt(jT_codigocursoAlterarProfessor.getText()));
                            } catch (SQLException ex) {
                                Logger.getLogger(JFrame_alterarProfessor.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    if(modelVerifica!=null){
                        try {
                            model.setCidade(jT_cidadeAlterarProfessor.getText());
                            model.setSenha(jT_senhaAlterarProfessor.getText());
                            model.setCursoCod(Integer.parseInt(jT_codigocursoAlterarProfessor.getText()));
                            model.setNome(jT_nomeprofessorAlterarProfessor.getText());
                            model.setBairro(jT_bairroAlterarProfessor.getText());
                            model.setCep(jT_cepAlterarProfessor.getText());
                            model.setCpf(jT_cpfAlterarProfessor.getText());
                            model.setTitulo(jT_tituloAlterarProfessor.getText());
                            model.setEmail(jT_emailAlterarProfessor.getText());
                            //SimpleDateFormat formatter = new SimpleDateFormat(jT_nascimentoAlterarProfessor.getText());
                            //model.setDataNascimento((java.sql.Date)formatter.parse(jT_nascimentoAlterarProfessor.getText()));
                            model.setRua(jT_ruaAlterarProfessor.getText());
                            model.setStatus(Boolean.parseBoolean(jT_tituloAlterarProfessor.getText()));
                            model.setTelefone(jT_telefoneAlterarProfessor.getText());
                            model.setUf(jT_ufAlterarProfessor.getText());
                            codigoCursoMudado=-1;
                            buscou=0;
                            controle.alterarProfessor(model);
                            JOptionPane.showMessageDialog(null,"Professor alterado com sucesso!");
                            jT_cidadeAlterarProfessor.setText("");
                            jT_senhaAlterarProfessor.setText("");
                            jT_codigocursoAlterarProfessor.setText("");
                            jT_nomeprofessorAlterarProfessor.setText("");
                            jT_bairroAlterarProfessor.setText("");
                            jT_cepAlterarProfessor.setText("");
                            jT_cpfAlterarProfessor.setText("");
                            jT_tituloAlterarProfessor.setText("");
                            jT_emailAlterarProfessor.setText("");
                            jT_nascimentoAlterarProfessor.setText("");
                            jT_ruaAlterarProfessor.setText("");
                            jT_senhaAlterarProfessor.setText("");
                            jT_tituloAlterarProfessor.setText("");
                            jT_telefoneAlterarProfessor.setText("");
                            jT_ufAlterarProfessor.setText("");
                            codigoCursoMudado=-1;
                            buscou=0;
                                        } catch (SQLException ex) {
                            Logger.getLogger(JFrame_alterarProfessor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"O código do curso o qual você digitou, não existe!");
                        codigoCursoMudado=-1;
                    }
                }
        }else{
            JOptionPane.showMessageDialog(null, "Você deve buscar um professor primeiro!");
            jT_cidadeAlterarProfessor.setText("");
            jT_senhaAlterarProfessor.setText("");
            jT_codigocursoAlterarProfessor.setText("");
            jT_nomeprofessorAlterarProfessor.setText("");
            jT_bairroAlterarProfessor.setText("");
            jT_cepAlterarProfessor.setText("");
            jT_cpfAlterarProfessor.setText("");
            jT_tituloAlterarProfessor.setText("");
            jT_emailAlterarProfessor.setText("");
            jT_nascimentoAlterarProfessor.setText("");
            jT_ruaAlterarProfessor.setText("");
            jT_senhaAlterarProfessor.setText("");
            jT_tituloAlterarProfessor.setText("");
            jT_telefoneAlterarProfessor.setText("");
            jT_ufAlterarProfessor.setText("");
            codigoCursoMudado=-1;
            buscou=0;
        }
    }//GEN-LAST:event_jB_confirmarAlterarProfessorActionPerformed

    private void jT_codigocursoAlterarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_codigocursoAlterarProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_codigocursoAlterarProfessorActionPerformed

    private void jT_senhaAlterarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_senhaAlterarProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_senhaAlterarProfessorActionPerformed

    private void jT_cpfAlterarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_cpfAlterarProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_cpfAlterarProfessorActionPerformed

    private void jT_statusAlterarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_statusAlterarProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_statusAlterarProfessorActionPerformed

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
                new JFrame_alterarProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_buscarAlterarDisciplina;
    private javax.swing.JButton jB_cancelarAlterarCurso;
    private javax.swing.JButton jB_confirmarAlterarProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_bairroAlterarProfessor;
    private javax.swing.JTextField jT_buscarAlterarProfessor;
    private javax.swing.JTextField jT_cepAlterarProfessor;
    private javax.swing.JTextField jT_cidadeAlterarProfessor;
    private javax.swing.JTextField jT_codigocursoAlterarProfessor;
    private javax.swing.JTextField jT_cpfAlterarProfessor;
    private javax.swing.JTextField jT_emailAlterarProfessor;
    private javax.swing.JTextField jT_nascimentoAlterarProfessor;
    private javax.swing.JTextField jT_nomeprofessorAlterarProfessor;
    private javax.swing.JTextField jT_ruaAlterarProfessor;
    private javax.swing.JTextField jT_senhaAlterarProfessor;
    private javax.swing.JTextField jT_statusAlterarProfessor;
    private javax.swing.JTextField jT_telefoneAlterarProfessor;
    private javax.swing.JTextField jT_tituloAlterarProfessor;
    private javax.swing.JTextField jT_ufAlterarProfessor;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
