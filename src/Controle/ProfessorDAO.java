package Controle;

import Modelo.Professor;
import Modelo.Turma;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class ProfessorDAO {

    LogDAO log = new LogDAO();
    String tabela, func;

    public Vector Pesquisar (String pesq) throws Exception{
        Vector tb = new Vector();
        String url = "SELECT DISTINCT * FROM professor where nome like '" + pesq + "%'" ;
        Connection con = Conexao.getConnection();
        PreparedStatement ps = con.prepareStatement(url);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getString("nome"));
            nl.add(rs.getInt("siape"));
            tb.add(nl);
        }     
        return tb;
    }
    
    public void cadastrarProfessor(Professor professor, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "professor";
        func = "Cadastrar Professor";
        log.inserirLog(codUsuario, nomeUsuario, tabela, professor.getSiape(), func);

        String sql = "INSERT INTO professor(siape, nome, senha, cpf, data_nascimento, cidade, uf, rua, bairro, cep, telefone, email, status, titulo, curso_cod)VALUES(default,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getSenha());
            stmt.setString(3, professor.getCpf());
            stmt.setDate(4, professor.getDataNascimento());
            stmt.setString(5, professor.getCidade());
            stmt.setString(6, professor.getUf());
            stmt.setString(7, professor.getRua());
            stmt.setString(8, professor.getBairro());
            stmt.setString(9, professor.getCep());
            stmt.setString(10, professor.getTelefone());
            stmt.setString(11, professor.getEmail());
            stmt.setBoolean(12, professor.getStatus());
            stmt.setString(11, professor.getTitulo());
            stmt.setInt(14, professor.getCurso().getCodCurso());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public void alterarProfessor(Professor professor, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "professor";
        func = "Alterar Professor";
        log.inserirLog(codUsuario, nomeUsuario, tabela, professor.getSiape(), func);
        String sql = "UPDATE professor SET nome = ?, senha = ?, cpf = ?, data_nascimento = ?, cidade= ?, uf = ?, rua = ?, bairro = ?, cep = ?, telefone = ?, email = ?, status = ?, titulo = ?, curso_cod = ? where siape=" + professor.getSiape();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getSenha());
            stmt.setString(3, professor.getCpf());
            stmt.setDate(4, professor.getDataNascimento());
            stmt.setString(5, professor.getCidade());
            stmt.setString(6, professor.getUf());
            stmt.setString(7, professor.getRua());
            stmt.setString(8, professor.getBairro());
            stmt.setString(9, professor.getCep());
            stmt.setString(10, professor.getTelefone());
            stmt.setString(11, professor.getEmail());
            stmt.setBoolean(12, professor.getStatus());
            stmt.setString(13, professor.getTitulo());
            stmt.setInt(14, professor.getCurso().getCodCurso());
            stmt.execute();
            System.out.println("Alterado no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }

    public void desativarProfessor(int siape, boolean status, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "professor";
        func = "Desativar Professor";
        log.inserirLog(codUsuario, nomeUsuario, tabela, siape, func);
        String sql = "UPDATE professor SET  status = ? where siape=" + siape;
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

    public Professor buscarProfessor(int siape) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM professor WHERE siape =" + siape;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Professor professor = null;

        if (result.next()) {
            String titulo = result.getString("titulo");
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
            CursoDAO cdao = new CursoDAO();
            professor = new Professor(siape, titulo, cdao.buscarCurso(result.getInt("curso_cod")), nome, senha, cpf, dataNascimento, cidade, uf, rua, bairro, telefone, cep, email, status);
        }
        result.close();
        stmt.close();
        con.close();

        return professor;
    }

    public ArrayList<Turma> buscarProfTurma(int siape) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "select * from turma inner join disciplina on (turma.disciplina_cod=disciplina.cod_disciplina) where turma.siape = " + siape;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();

        ArrayList<Turma> turmas = new ArrayList<>();

        while (result.next()) {
            DisciplinaDAO ddao = new DisciplinaDAO();
            PeriodoDAO pedao = new PeriodoDAO();
            CursoDAO cdao = new CursoDAO();
            ProfessorDAO pdao = new ProfessorDAO();
            int codTurma = result.getInt("cod_turma");
            int sala = result.getInt("sala");
            String horario = result.getString("horario");
            Turma turma = new Turma(codTurma, cdao.buscarCurso(result.getInt("curso_cod")), pedao.buscarPeriodo(result.getInt("periodo_cod")), sala, horario, ddao.buscarDisciplina(result.getInt("disciplina_cod")), pdao.buscarProfessor(siape));
            turmas.add(turma);
        }
        result.close();
        stmt.close();
        con.close();

        return turmas;
    }

    public ArrayList<Professor> visualizarProfessores() throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM professor";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();

        ArrayList<Professor> professores = new ArrayList<>();

        while (result.next()) {
            Professor professor = new Professor();
            professor.setNome(result.getString("nome"));
            professor.setSiape(result.getInt("siape"));
            //professor.getCurso().setCodCurso(result.getInt("curso_cod"));
            professor.setTitulo(result.getString("titulo"));
            professor.setCpf(result.getString("cpf"));
            professor.setDataNascimento(result.getDate("data_nascimento"));
            professor.setCidade(result.getString("cidade"));
            professor.setUf(result.getString("uf"));
            professor.setRua(result.getString("rua"));
            professor.setBairro(result.getString("bairro"));
            professor.setCep(result.getString("cep"));
            professor.setTelefone(result.getString("telefone"));
            professor.setEmail(result.getString("email"));
            CursoDAO dao=new CursoDAO();
            professor.setCurso(dao.buscarCurso(result.getInt("curso_cod")));
            professores.add(professor);
        }
        result.close();
        stmt.close();
        con.close();

        return professores;
    }

    public int loginProfessor(int siape, String senha) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM professor WHERE siape =" + siape + "and senha = '" + senha + "'";
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

}
