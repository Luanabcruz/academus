package Controle;

import Modelo.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisciplinaDAO {
    
    public void cadastrarDisciplina(Disciplina disciplina) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "INSERT INTO disciplina(cod_disciplina, curso_cod, nome_disc, credito, descricao, status)VALUES(default,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, disciplina.getCurso().getCodCurso());
            stmt.setString(2, disciplina.getNomeDisc());
            stmt.setInt(3, disciplina.getCredito());
            stmt.setString(4, disciplina.getDescricao());
            stmt.setBoolean(5, disciplina.getStatus());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }
    
    public Disciplina buscarDisciplina(int codDisciplina) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM disciplina WHERE cod_disciplina =1" + codDisciplina;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Disciplina disciplina = null;

        if (result.next()) {
            CursoDAO cdao = new CursoDAO();
            int cursoCod = result.getInt("curso_cod");
            String nomeDisciplina = result.getString("nome_disc");
            int credito = result.getInt("credito");
            String descricao = result.getString("descricao");
            Boolean status = result.getBoolean("status");
            disciplina = new Disciplina(codDisciplina, cdao.buscarCurso(result.getInt("curso_cod")), nomeDisciplina, credito, descricao, status);
        }
        result.close();
        stmt.close();
        con.close();

        return disciplina;
    }
    
    public void alterarDisciplina(Disciplina disciplina) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "UPDATE disciplina SET curso_cod = ?, nome_disc = ?, credito = ?, descricao = ?, status = ? where cod_disciplina"+disciplina.getCodDisciplina();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, disciplina.getCurso().getCodCurso());
            stmt.setString(2, disciplina.getNomeDisc());
            stmt.setInt(3, disciplina.getCredito());
            stmt.setString(4, disciplina.getDescricao());
            stmt.setBoolean(5, disciplina.getStatus());
            stmt.execute();
            System.out.println("Alterado no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }
    
}
