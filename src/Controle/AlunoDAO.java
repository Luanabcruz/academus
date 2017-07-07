package Controle;

import Modelo.Aluno;
import Modelo.Nota;
import Modelo.Turma;
import Visao.JFrameAlterarAluno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class AlunoDAO {

    Aluno aluno = null;
    LogDAO log = new LogDAO();
    String tabela, func;

    public Vector Pesquisar(String pesq) throws Exception {
        Vector tb = new Vector();
        String url = "SELECT * FROM aluno where nome like '" + pesq + "%'";
        Connection con = Conexao.getConnection();
        PreparedStatement ps = con.prepareStatement(url);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Vector nl = new Vector();
            nl.add(rs.getString("nome"));
            nl.add(rs.getInt("matricula"));
            tb.add(nl);
        }
        return tb;
    }

    public void cadastrarAluno(Aluno aluno, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "aluno";
        func = "Cadastrar Aluno";
        log.inserirLog(codUsuario, nomeUsuario, tabela, aluno.getMatricula(), func);

        String sql = "INSERT INTO aluno(matricula, nome, senha, cpf, data_nascimento, cidade, uf, rua, bairro, cep, telefone, email, status, cra, ano_ingressante, curso_cod)VALUES(default,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getSenha());
            stmt.setString(3, aluno.getCpf());
            stmt.setDate(4, aluno.getDataNascimento());
            stmt.setString(5, aluno.getCidade());
            stmt.setString(6, aluno.getUf());
            stmt.setString(7, aluno.getRua());
            stmt.setString(8, aluno.getBairro());
            stmt.setString(9, aluno.getCep());
            stmt.setString(10, aluno.getTelefone());
            stmt.setString(11, aluno.getEmail());
            stmt.setBoolean(12, aluno.getStatus());
            stmt.setFloat(13, aluno.getCra());
            stmt.setString(14, aluno.getAnoIngressante());
            stmt.setInt(15, aluno.getCurso().getCodCurso());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public void alterarAluno(Aluno aluno, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "aluno";
        func = "Alterar Aluno";
        log.inserirLog(codUsuario, nomeUsuario, tabela, aluno.getMatricula(), func);

        String sql = "UPDATE aluno SET nome = ?, senha = ?, cpf = ?, data_nascimento = ?, cidade= ?, uf = ?, rua = ?, bairro = ?, cep = ?, telefone = ?, email = ? where matricula=" + aluno.getMatricula();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getSenha());
            stmt.setString(3, aluno.getCpf());
            stmt.setDate(4, aluno.getDataNascimento());
            stmt.setString(5, aluno.getCidade());
            stmt.setString(6, aluno.getUf());
            stmt.setString(7, aluno.getRua());
            stmt.setString(8, aluno.getBairro());
            stmt.setString(9, aluno.getCep());
            stmt.setString(10, aluno.getTelefone());
            stmt.setString(11, aluno.getEmail());
            stmt.execute();
            System.out.println("Alterado no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }

    public void desativarAluno(int matricula, boolean status, int codUsuario, String nomeUsuario) throws SQLException {
        tabela = "aluno";
        func = "Desativar Aluno";
        log.inserirLog(codUsuario, nomeUsuario, tabela, matricula, func);

        Connection con = Conexao.getConnection();
        String sql = "UPDATE aluno SET  status = ? where matricula=" + matricula;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setBoolean(1, status);
            stmt.execute();
            System.out.println("Alterado status no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }

    public Aluno buscarAluno(int matricula) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM aluno WHERE matricula =" + matricula;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Aluno aluno = null;

        if (result.next()) {
            float cra = result.getFloat("cra");
            CursoDAO cdao = new CursoDAO();
            String anoIngressante = result.getString("ano_ingressante");
            String nome = result.getString("nome");
            String senha = result.getString("senha");
            String cpf = result.getString("cpf");
            Date dataNascimento = result.getDate("data_nascimento");
            String cidade = result.getString("cidade");
            String uf = result.getString("uf");
            String rua = result.getString("rua");
            String bairro = result.getString("bairro");
            String cep = result.getString("cep");
            String telefone = result.getString("telefone");
            String email = result.getString("email");
            Boolean status = result.getBoolean("status");

            aluno = new Aluno(matricula, cdao.buscarCurso(result.getInt("curso_cod")), cra, anoIngressante, nome, senha, cpf, dataNascimento, cidade, uf, rua, bairro, telefone, cep, email, status);
        }
        result.close();
        stmt.close();
        con.close();

        return aluno;
    }

    public ArrayList<Aluno> visualizarAlunos() throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM aluno";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();

        ArrayList<Aluno> alunos = new ArrayList<>();
        Curso curso = new Curso();
        while (result.next()) {
            Aluno aluno = new Aluno();
            aluno.setNome(result.getString("nome"));
            aluno.setMatricula(result.getInt("matricula"));
            aluno.getCurso().setCodCurso(result.getObject(0).getInt("curso_cod"));
            aluno.setCra(result.getFloat("cra"));
            aluno.setAnoIngressante(result.getString("ano_ingressante"));
            aluno.setCpf(result.getString("cpf"));
            aluno.setDataNascimento(result.getDate("data_nascimento"));
            aluno.setCidade(result.getString("cidade"));
            aluno.setUf(result.getString("uf"));
            aluno.setRua(result.getString("rua"));
            aluno.setBairro(result.getString("bairro"));
            aluno.setCep(result.getString("cep"));
            aluno.setTelefone(result.getString("telefone"));
            aluno.setEmail(result.getString("email"));
            alunos.add(aluno);
        }
        result.close();
        stmt.close();
        con.close();

        return alunos;
    }

    public int loginAluno(int matricula, String senha) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM aluno WHERE matricula =" + matricula + "and senha = '" + senha + "'";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        int retorno = 0;

        if (result.next()) {
            retorno = 1;
        }

        result.close();
        stmt.close();
        con.close();

        return retorno;
    }

    public ArrayList<Nota> buscarAlunoTurma(int matricula) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "select * from nota inner join turma on (turma.cod_turma=nota.turma_cod) where nota.matricula = " + matricula;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();

        ArrayList<Nota> notas = new ArrayList<>();

        while (result.next()) {
            AlunoDAO adao = new AlunoDAO();
            TurmaDAO tdao = new TurmaDAO();
            int turmaCod = result.getInt("turma_cod");
            int nota1 = result.getInt("nota_1");
            int nota2 = result.getInt("nota_2");
            int nota3 = result.getInt("nota_3");
            Nota nota = new Nota(turmaCod, adao.buscarAluno(result.getInt("matricula")), tdao.buscarTurma(result.getInt("turma_cod")), nota1, nota2, nota3);
            notas.add(nota);
        }
        result.close();
        stmt.close();
        con.close();

        return notas;
    }

    public ArrayList<Nota> turmasNotasAlunoProfessor(int codTurma, int siape) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "select distinct * from nota inner join turma on (turma.cod_turma= " + codTurma + ") inner join professor on (professor.siape=" + siape + ")";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();

        ArrayList<Nota> notas = new ArrayList<>();

        while (result.next()) {
            AlunoDAO adao = new AlunoDAO();
            TurmaDAO tdao = new TurmaDAO();
            int turmaCod = result.getInt("turma_cod");
            Float nota1 = result.getFloat("nota_1");
            Float nota2 = result.getFloat("nota_2");
            Float nota3 = result.getFloat("nota_3");
            Nota nota = new Nota(turmaCod, adao.buscarAluno(result.getInt("matricula")), tdao.buscarTurma(result.getInt("turma_cod")), nota1, nota2, nota3);
            notas.add(nota);
            System.out.println(notas.get(0).getAluno().getNome());
        }
        result.close();
        stmt.close();
        con.close();

        return notas;
    }

}
