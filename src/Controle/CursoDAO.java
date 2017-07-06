package Controle;

import Modelo.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CursoDAO {

    LogDAO log = new LogDAO();
    String tabela, func;

    public void cadastrarCurso(Curso curso, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "curso";
        func = "Cadastrar Curso";        
        log.inserirLog(codUsuario, nomeUsuario, tabela, curso.getCodCurso(), func);
        
        String sql = "INSERT INTO curso(cod_curso, adm_cod, universidade_cod, nome_curso, conceito_curso, descricao, carga_curso, status_curso)VALUES(default,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, curso.getAdministrador().getCodAdm());
            stmt.setInt(2, curso.getUniversidade().getCodUniversidade());
            stmt.setString(3, curso.getNomeCurso());
            stmt.setFloat(4, curso.getConceitoCurso());
            stmt.setString(5, curso.getDescricao());
            stmt.setInt(6, curso.getCargaCurso());
            stmt.setBoolean(7, curso.getStatusCurso());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public void alterarCurso(Curso curso, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "curso";
        func = "Alterar Curso";
        log.inserirLog(codUsuario, nomeUsuario, tabela, curso.getCodCurso(), func);
        
        String sql = "UPDATE curso SET nome_curso = ?, conceito_curso = ?, descricao = ?, carga_curso=?, status_curso=?, universidade_cod=? where cod_curso = " + curso.getCodCurso();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, curso.getNomeCurso());
            stmt.setFloat(2, curso.getConceitoCurso());
            stmt.setString(3, curso.getDescricao());
            stmt.setInt(4, curso.getCargaCurso());
            stmt.setBoolean(5, curso.getStatusCurso());
            stmt.setInt(6, curso.getUniversidade().getCodUniversidade());
            stmt.execute();
            System.out.println("Alterado no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }

    public Curso buscarCurso(int codCurso) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM curso WHERE cod_curso =" + codCurso;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Curso curso = null;

        if (result.next()) {
            UniversidadeDAO udao = new UniversidadeDAO();
            AdmDAO adao = new AdmDAO();
            String nomeCurso = result.getString("nome_curso");
            Float conceitoCurso = result.getFloat("conceito_curso");
            String descricao = result.getString("descricao");
            int cargaCurso = result.getInt("carga_curso");
            Boolean statusCurso = result.getBoolean("status_curso");
            curso = new Curso(codCurso, adao.buscarAdministrador(result.getInt("adm_cod")), udao.buscarUniversidade(result.getInt("universidade_cod")), nomeCurso, conceitoCurso, descricao, cargaCurso, statusCurso);
        }
        result.close();
        stmt.close();
        con.close();

        return curso;
    }

    public ArrayList<Curso> visualizarCursos() throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM curso";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();

        ArrayList<Curso> cursos = new ArrayList<>();

        while (result.next()) {
            Curso curso = new Curso();
            curso.setCodCurso(result.getInt("cod_curso"));
            curso.setCodCurso(result.getInt("adm_cod"));
            curso.getUniversidade().setCodUniversidade(result.getInt("universidade_cod"));
            curso.setNomeCurso(result.getString("nome_curso"));
            curso.setConceitoCurso(result.getFloat("conceito_curso"));
            curso.setDescricao(result.getString("descricao"));
            curso.setCargaCurso(result.getInt("carga_curso"));
            curso.setStatusCurso(result.getBoolean("status_curso"));
            cursos.add(curso);
        }

        result.close();
        stmt.close();
        con.close();

        return cursos;
    }

    public void desativarCurso(int cod_curso, boolean status, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "curso";
        func = "Cadastrar Curso";        
        log.inserirLog(codUsuario, nomeUsuario, tabela, cod_curso, func);
        
        String sql = "UPDATE curso SET status_curso = ? where cod_curso= " + cod_curso;
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

}
