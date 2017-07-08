package Visao;

import Controle.AlunoDAO;
import Modelo.Curso;
import Controle.CursoDAO;
import Controle.DisciplinaDAO;
import Modelo.Aluno;
import Modelo.ComboBox;
import Modelo.Disciplina;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;

public class JFrame_alterarAluno extends javax.swing.JFrame implements ActionListener {
    Aluno model = new Aluno();
    AlunoDAO controle = new AlunoDAO();
    int buscou=0;
    int codigoCursoMudado=-1;
    Curso cursoSelecionadoBox=null;
    ArrayList<Curso> cursoGeralArray = new ArrayList<>();
    CursoDAO buscaCurso = new CursoDAO();
    
    public JFrame_alterarAluno() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jT_nomealunoAlterarAluno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jB_cancelarAlterarCurso = new javax.swing.JButton();
        jB_buscarAlterarDisciplina = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jT_cidadeAlterarAluno = new javax.swing.JTextField();
        jT_buscarAlterarAluno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jB_confirmarAlterarDisciplina = new javax.swing.JButton();
        jT_senhaAlterarAluno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jT_cpfAlterarAluno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jT_nascimentoAlterarAluno = new javax.swing.JTextField();
        jT_ufAlterarAluno = new javax.swing.JTextField();
        jT_bairroAlterarAluno = new javax.swing.JTextField();
        jT_cepAlterarAluno = new javax.swing.JTextField();
        jT_telefoneAlterarAluno = new javax.swing.JTextField();
        jT_emailAlterarAluno = new javax.swing.JTextField();
        jT_statusAlterarAluno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jT_ruaAlterarAluno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jT_craAlterarAluno = new javax.swing.JTextField();
        jT_periodoAlterarAluno = new javax.swing.JTextField();
        jComboBoxTeste = new javax.swing.JComboBox<>();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 44, 68));
        jLabel2.setText("Código do Curso");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 170, 110, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/curso.fw.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 10, 32, 32);

        jLabel1.setBackground(new java.awt.Color(36, 44, 68));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alterar dados do Aluno");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 708, 57);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 44, 68));
        jLabel3.setText("Buscar Matricula Aluno");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 60, 220, 27);

        jT_nomealunoAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_nomealunoAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_nomealunoAlterarAluno.setText(" ");
        getContentPane().add(jT_nomealunoAlterarAluno);
        jT_nomealunoAlterarAluno.setBounds(20, 140, 280, 30);

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 44, 68));
        jLabel5.setText("Data de nascimento");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 330, 150, 20);

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
        jB_cancelarAlterarCurso.setBounds(270, 400, 110, 33);

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
        jB_buscarAlterarDisciplina.setBounds(150, 90, 110, 33);

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 44, 68));
        jLabel7.setText("Email");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 380, 60, 20);

        jT_cidadeAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_cidadeAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_cidadeAlterarAluno.setText(" ");
        getContentPane().add(jT_cidadeAlterarAluno);
        jT_cidadeAlterarAluno.setBounds(390, 80, 180, 30);

        jT_buscarAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_buscarAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        getContentPane().add(jT_buscarAlterarAluno);
        jT_buscarAlterarAluno.setBounds(20, 90, 120, 30);

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(36, 44, 68));
        jLabel9.setText("Nome do Aluno");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 120, 160, 20);

        jB_confirmarAlterarDisciplina.setBackground(new java.awt.Color(0, 204, 51));
        jB_confirmarAlterarDisciplina.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jB_confirmarAlterarDisciplina.setForeground(new java.awt.Color(255, 255, 255));
        jB_confirmarAlterarDisciplina.setText("Confirmar");
        jB_confirmarAlterarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_confirmarAlterarDisciplinaActionPerformed(evt);
            }
        });
        getContentPane().add(jB_confirmarAlterarDisciplina);
        jB_confirmarAlterarDisciplina.setBounds(420, 400, 110, 33);

        jT_senhaAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_senhaAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_senhaAlterarAluno.setText(" ");
        jT_senhaAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_senhaAlterarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(jT_senhaAlterarAluno);
        jT_senhaAlterarAluno.setBounds(20, 250, 180, 30);

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 44, 68));
        jLabel6.setText("Senha");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 230, 90, 20);

        jT_cpfAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_cpfAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_cpfAlterarAluno.setText(" ");
        jT_cpfAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_cpfAlterarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(jT_cpfAlterarAluno);
        jT_cpfAlterarAluno.setBounds(20, 300, 180, 30);

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 44, 68));
        jLabel8.setText("CPF");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 280, 90, 20);

        jT_nascimentoAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_nascimentoAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_nascimentoAlterarAluno.setText(" ");
        getContentPane().add(jT_nascimentoAlterarAluno);
        jT_nascimentoAlterarAluno.setBounds(20, 350, 180, 30);

        jT_ufAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_ufAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_ufAlterarAluno.setText(" ");
        getContentPane().add(jT_ufAlterarAluno);
        jT_ufAlterarAluno.setBounds(390, 130, 180, 30);

        jT_bairroAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_bairroAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_bairroAlterarAluno.setText(" ");
        getContentPane().add(jT_bairroAlterarAluno);
        jT_bairroAlterarAluno.setBounds(390, 230, 180, 30);

        jT_cepAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_cepAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_cepAlterarAluno.setText(" ");
        getContentPane().add(jT_cepAlterarAluno);
        jT_cepAlterarAluno.setBounds(390, 280, 180, 30);

        jT_telefoneAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_telefoneAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_telefoneAlterarAluno.setText(" ");
        getContentPane().add(jT_telefoneAlterarAluno);
        jT_telefoneAlterarAluno.setBounds(390, 330, 180, 30);

        jT_emailAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_emailAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_emailAlterarAluno.setText(" ");
        getContentPane().add(jT_emailAlterarAluno);
        jT_emailAlterarAluno.setBounds(20, 400, 180, 30);

        jT_statusAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_statusAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_statusAlterarAluno.setText(" ");
        getContentPane().add(jT_statusAlterarAluno);
        jT_statusAlterarAluno.setBounds(220, 200, 150, 30);

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 44, 68));
        jLabel10.setText("Uf");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(390, 110, 60, 20);

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(36, 44, 68));
        jLabel11.setText("Rua");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(390, 160, 40, 20);

        jLabel12.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(36, 44, 68));
        jLabel12.setText("Bairro");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(390, 210, 60, 20);

        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(36, 44, 68));
        jLabel13.setText("Cep");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(390, 260, 60, 20);

        jLabel14.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(36, 44, 68));
        jLabel14.setText("Telefone");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(390, 310, 60, 20);

        jT_ruaAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_ruaAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_ruaAlterarAluno.setText(" ");
        getContentPane().add(jT_ruaAlterarAluno);
        jT_ruaAlterarAluno.setBounds(390, 180, 180, 30);

        jLabel15.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(36, 44, 68));
        jLabel15.setText("Cidade");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(390, 60, 60, 20);

        jLabel16.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(36, 44, 68));
        jLabel16.setText("Status");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(220, 180, 60, 20);

        jLabel17.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(36, 44, 68));
        jLabel17.setText("CRA");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(220, 230, 110, 20);

        jLabel18.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(36, 44, 68));
        jLabel18.setText("Ano ingressante");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(220, 280, 110, 27);

        jT_craAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_craAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_craAlterarAluno.setText(" ");
        jT_craAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_craAlterarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(jT_craAlterarAluno);
        jT_craAlterarAluno.setBounds(220, 250, 150, 30);

        jT_periodoAlterarAluno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jT_periodoAlterarAluno.setForeground(new java.awt.Color(36, 44, 68));
        jT_periodoAlterarAluno.setText(" ");
        getContentPane().add(jT_periodoAlterarAluno);
        jT_periodoAlterarAluno.setBounds(220, 310, 150, 30);

        jComboBoxTeste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"\"" }));
        jComboBoxTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTesteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTeste);
        jComboBoxTeste.setBounds(20, 190, 190, 30);

        setSize(new java.awt.Dimension(698, 492));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_cancelarAlterarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cancelarAlterarCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_cancelarAlterarCursoActionPerformed

    private void jB_buscarAlterarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscarAlterarDisciplinaActionPerformed
         if(!(jT_buscarAlterarAluno.getText().equals(""))){
             int codaluno =(Integer.parseInt(jT_buscarAlterarAluno.getText()));
             try {
                 model = controle.buscarAluno(codaluno);
                    if(model!=null){
                        jT_cidadeAlterarAluno.setText(String.valueOf(model.getCidade()));
                        jT_senhaAlterarAluno.setText(String.valueOf(model.getSenha()));
                        
                //jT_codigocursoAlterarAluno.setText(String.valueOf(model.getCursoCod()));
                        jT_nomealunoAlterarAluno.setText(String.valueOf(model.getNome()));
                        jT_bairroAlterarAluno.setText(model.getBairro());
                        jT_cepAlterarAluno.setText(model.getCep());
                        jT_cpfAlterarAluno.setText(model.getCpf());
                        jT_craAlterarAluno.setText(String.valueOf(model.getCra()));
                        jT_emailAlterarAluno.setText(model.getEmail());
                        jT_nascimentoAlterarAluno.setText(String.valueOf(model.getDataNascimento()));
                        jT_periodoAlterarAluno.setText(String.valueOf(model.getAnoIngressante()));
                        jT_ruaAlterarAluno.setText(model.getRua());
                        jT_senhaAlterarAluno.setText(model.getSenha());
                        jT_statusAlterarAluno.setText(String.valueOf(model.getStatus()));
                        jT_telefoneAlterarAluno.setText(model.getTelefone());
                        jT_ufAlterarAluno.setText(model.getUf());
                        codigoCursoMudado=model.getCursoCod();
                        buscou=1;
                    }else{
                        jT_cidadeAlterarAluno.setText("");
                        jT_senhaAlterarAluno.setText("");
              //          jT_codigocursoAlterarAluno.setText("");
                        jT_nomealunoAlterarAluno.setText("");
                        jT_bairroAlterarAluno.setText("");
                        jT_cepAlterarAluno.setText("");
                        jT_cpfAlterarAluno.setText("");
                        jT_craAlterarAluno.setText("");
                        jT_emailAlterarAluno.setText("");
                        jT_nascimentoAlterarAluno.setText("");
                        jT_periodoAlterarAluno.setText("");
                        jT_ruaAlterarAluno.setText("");
                        jT_senhaAlterarAluno.setText("");
                        jT_statusAlterarAluno.setText("");
                        jT_telefoneAlterarAluno.setText("");
                        jT_ufAlterarAluno.setText("");
                        codigoCursoMudado=-1;
                        buscou=0;
                        jComboBoxTeste.removeAllItems();
                        jComboBoxTeste.addItem("");
                        JOptionPane.showMessageDialog(null, "Este aluno não existe!");
                    }
             } catch (SQLException ex) {
                 Logger.getLogger(JFrame_alterarAluno.class.getName()).log(Level.SEVERE, null, ex);
             }
        }else{
            JOptionPane.showMessageDialog(null, "Insira algum número no campo para buscar um aluno");
            jT_cidadeAlterarAluno.setText("");
            jT_senhaAlterarAluno.setText("");
            //jT_codigocursoAlterarAluno.setText("");
            jT_nomealunoAlterarAluno.setText("");
            jT_bairroAlterarAluno.setText("");
            jT_cepAlterarAluno.setText("");
            jT_cpfAlterarAluno.setText("");
            jT_craAlterarAluno.setText("");
            jT_emailAlterarAluno.setText("");
            jT_nascimentoAlterarAluno.setText("");
            jT_periodoAlterarAluno.setText("");
            jT_ruaAlterarAluno.setText("");
            jT_senhaAlterarAluno.setText("");
            jT_statusAlterarAluno.setText("");
            jT_telefoneAlterarAluno.setText("");
            jT_ufAlterarAluno.setText("");
            jComboBoxTeste.removeAllItems();
            jComboBoxTeste.addItem("");
            codigoCursoMudado=-1;
            buscou=0;
         }
    }//GEN-LAST:event_jB_buscarAlterarDisciplinaActionPerformed

    private void jB_confirmarAlterarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_confirmarAlterarDisciplinaActionPerformed
        if(buscou==1){
            /*}else if(model.getUniversidadeCod()!=(Integer.parseInt(jT_universidadeAlterarCurso.getText()))){
                    JOptionPane.showMessageDialog(null,"Número da universidade não pode ser alterado!");*/
                if((jT_cidadeAlterarAluno.getText().equals(""))||(jT_senhaAlterarAluno.getText().equals(""))||(jT_nomealunoAlterarAluno.getText().equals(""))||jT_bairroAlterarAluno.getText().equals("")||jT_cepAlterarAluno.getText().equals("")||jT_cidadeAlterarAluno.getText().equals("")||jT_cpfAlterarAluno.getText().equals("")||jT_craAlterarAluno.getText().equals("")||jT_emailAlterarAluno.getText().equals("")||jT_nascimentoAlterarAluno.getText().equals("")||jT_nomealunoAlterarAluno.getText().equals("")||jT_periodoAlterarAluno.getText().equals("")||jT_ruaAlterarAluno.getText().equals("")||jT_senhaAlterarAluno.getText().equals("")||jT_statusAlterarAluno.getText().equals("")||jT_telefoneAlterarAluno.getText().equals("")||jT_ufAlterarAluno.getText().equals(""))
                {   
                    JOptionPane.showMessageDialog(null,"Todos os campos devem ser preenchidos!");
                }else{
                    Curso modelVerifica = new Curso();
                    CursoDAO controlVerifica = new CursoDAO();
                       /* if(codigoCursoMudado!=Integer.parseInt(jT_codigocursoAlterarAluno.getText())){
                            try {
                                modelVerifica = controlVerifica.buscarCurso(Integer.parseInt(jT_codigocursoAlterarAluno.getText()));
                            } catch (SQLException ex) {
                                Logger.getLogger(JFrame_alterarAluno.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }*/
                    if(modelVerifica!=null){
                        try {
                            jComboBoxTeste.removeAllItems();
                            cursoGeralArray=buscaCurso.visualizarCursos();
                            String buscaString = (String.valueOf(model.getCursoCod())+ "--" + String.valueOf(model.getNome()));
                            for(int i=0;i<cursoGeralArray.size();i++){
                                if(buscaString.equals(String.valueOf(cursoGeralArray.get(i).getCodCurso())+ "--" + String.valueOf(cursoGeralArray.get(i).getCodCurso())))
                                    jComboBoxTeste.removeAllItems();
                                    jComboBoxTeste.addItem(buscaString);
                            }
                            model.setCidade(jT_cidadeAlterarAluno.getText());
                            model.setSenha(jT_senhaAlterarAluno.getText());
                          //  model.setCursoCod(Integer.parseInt(jT_codigocursoAlterarAluno.getText()));
                            model.setNome(jT_nomealunoAlterarAluno.getText());
                            model.setBairro(jT_bairroAlterarAluno.getText());
                            model.setCep(jT_cepAlterarAluno.getText());
                            model.setCpf(jT_cpfAlterarAluno.getText());
                            model.setCra(Float.parseFloat(jT_craAlterarAluno.getText()));
                            model.setEmail(jT_emailAlterarAluno.getText());
                            //SimpleDateFormat formatter = new SimpleDateFormat(jT_nascimentoAlterarAluno.getText());
                            //model.setDataNascimento((java.sql.Date)formatter.parse(jT_nascimentoAlterarAluno.getText()));
                            model.setAnoIngressante(jT_periodoAlterarAluno.getText());
                            model.setRua(jT_ruaAlterarAluno.getText());
                            model.setStatus(Boolean.parseBoolean(jT_statusAlterarAluno.getText()));
                            model.setTelefone(jT_telefoneAlterarAluno.getText());
                            model.setUf(jT_ufAlterarAluno.getText());
                            codigoCursoMudado=model.getCursoCod();
                            buscou=0;
                            controle.alterarAluno(model);
                            JOptionPane.showMessageDialog(null,"Aluno alterado com sucesso!");
                            jT_cidadeAlterarAluno.setText("");
                            jT_senhaAlterarAluno.setText("");
              //              jT_codigocursoAlterarAluno.setText("");
                            jT_nomealunoAlterarAluno.setText("");
                            jT_bairroAlterarAluno.setText("");
                            jT_cepAlterarAluno.setText("");
                            jT_cpfAlterarAluno.setText("");
                            jT_craAlterarAluno.setText("");
                            jT_emailAlterarAluno.setText("");
                            jT_nascimentoAlterarAluno.setText("");
                            jT_periodoAlterarAluno.setText("");
                            jT_ruaAlterarAluno.setText("");
                            jT_senhaAlterarAluno.setText("");
                            jT_statusAlterarAluno.setText("");
                            jT_telefoneAlterarAluno.setText("");
                            jT_ufAlterarAluno.setText("");
                            jComboBoxTeste.removeAllItems();
                            jComboBoxTeste.addItem("");
                            codigoCursoMudado=-1;
                            buscou=0;
                                        } catch (SQLException ex) {
                            Logger.getLogger(JFrame_alterarAluno.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"O código do curso o qual você digitou, não existe!");
                        codigoCursoMudado=-1;
                    }
                }
        }else{
            JOptionPane.showMessageDialog(null, "Você deve buscar uma disciplina primeiro!");
            jT_cidadeAlterarAluno.setText("");
            jT_senhaAlterarAluno.setText("");
            //jT_codigocursoAlterarAluno.setText("");
            jT_nomealunoAlterarAluno.setText("");
            jT_bairroAlterarAluno.setText("");
            jT_cepAlterarAluno.setText("");
            jT_cpfAlterarAluno.setText("");
            jT_craAlterarAluno.setText("");
            jT_emailAlterarAluno.setText("");
            jT_nascimentoAlterarAluno.setText("");
            jT_periodoAlterarAluno.setText("");
            jT_ruaAlterarAluno.setText("");
            jT_senhaAlterarAluno.setText("");
            jT_statusAlterarAluno.setText("");
            jT_telefoneAlterarAluno.setText("");
            jT_ufAlterarAluno.setText("");
            jComboBoxTeste.removeAllItems();
            jComboBoxTeste.addItem("");
            codigoCursoMudado=-1;
            buscou=0;
        }
    }//GEN-LAST:event_jB_confirmarAlterarDisciplinaActionPerformed

    private void jT_senhaAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_senhaAlterarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_senhaAlterarAlunoActionPerformed

    private void jT_cpfAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_cpfAlterarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_cpfAlterarAlunoActionPerformed

    private void jT_craAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_craAlterarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_craAlterarAlunoActionPerformed

    int cursoSelecionado=0;
    
    private void jComboBoxTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTesteActionPerformed
        CursoDAO cursoDAO = new CursoDAO();
        ArrayList<Curso> cursoArray = new ArrayList<>();
        ItemEvent e = null;
        //if(cursoSelecionado==0){
            try {
                cursoArray=cursoDAO.visualizarCursos();
            } catch (SQLException ex) {
                Logger.getLogger(JFrame_alterarAluno.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i=0;i<cursoArray.size();i++){
                jComboBoxTeste.addItem(String.valueOf(cursoArray.get(i).getCodCurso())+ "--" + String.valueOf(cursoArray.get(i).getNomeCurso()));
            }
            cursoSelecionado=0;
            jComboBoxTeste.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    if(e.getStateChange()==ItemEvent.SELECTED ){
                        for(int i=0;i<cursoGeralArray.size()&& cursoSelecionado==0;i++){
                            if(jComboBoxTeste.getSelectedItem().equals(String.valueOf(cursoGeralArray.get(i).getCodCurso())+ "--" + String.valueOf(cursoGeralArray.get(i).getNomeCurso()))){
                                jComboBoxTeste.removeAllItems();
                                cursoSelecionadoBox=cursoGeralArray.get(i);
                                cursoSelecionado=1;
                            }
                        }
                    }
                }
            });
            
            
        //}
        /*
        // Listener para 'fazer algo' sempre que for selecionada uma opção no JComboBox
        combobox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) // para evitar duplicações
                    System.out.println("Você escolheu a opção " + e.getItem());
            }
        });
        */
    }//GEN-LAST:event_jComboBoxTesteActionPerformed

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
                new JFrame_alterarAluno().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_buscarAlterarDisciplina;
    private javax.swing.JButton jB_cancelarAlterarCurso;
    private javax.swing.JButton jB_confirmarAlterarDisciplina;
    private javax.swing.JComboBox<String> jComboBoxTeste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_bairroAlterarAluno;
    private javax.swing.JTextField jT_buscarAlterarAluno;
    private javax.swing.JTextField jT_cepAlterarAluno;
    private javax.swing.JTextField jT_cidadeAlterarAluno;
    private javax.swing.JTextField jT_cpfAlterarAluno;
    private javax.swing.JTextField jT_craAlterarAluno;
    private javax.swing.JTextField jT_emailAlterarAluno;
    private javax.swing.JTextField jT_nascimentoAlterarAluno;
    private javax.swing.JTextField jT_nomealunoAlterarAluno;
    private javax.swing.JTextField jT_periodoAlterarAluno;
    private javax.swing.JTextField jT_ruaAlterarAluno;
    private javax.swing.JTextField jT_senhaAlterarAluno;
    private javax.swing.JTextField jT_statusAlterarAluno;
    private javax.swing.JTextField jT_telefoneAlterarAluno;
    private javax.swing.JTextField jT_ufAlterarAluno;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBorder(Border createEmptyBorder) {
       
    }
}