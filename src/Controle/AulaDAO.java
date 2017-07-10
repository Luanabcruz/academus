package Controle;

import Controle.Conexao;
import Modelo.Aula;
import Modelo.Frequencia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AulaDAO {

    public void cadastrarAula(Aula aula) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "INSERT INTO aula(cod_aula, turma_cod, data)VALUES(default,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, aula.getTurma().getCodTurma());
            stmt.setDate(2, aula.getData());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }
    
    public Aula buscarAula(int codAula) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM aula WHERE cod_aula =" + codAula;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Aula aula = null;

        if (result.next()) {
            Date data = result.getDate("data");
            TurmaDAO tdao = new TurmaDAO();
            aula = new Aula(codAula, tdao.buscarTurma(result.getInt("turma_cod")), data);
        }
        result.close();
        stmt.close();
        con.close();

        return aula;
    }
    
    public void alterarAula(Aula aula) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "UPDATE aula SET turma_cod = ?, data = ? where cod_aula ="+aula.getCodAula();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, aula.getTurma().getCodTurma());
            stmt.setDate(2, aula.getData());
            stmt.execute();
            System.out.println("Alterar no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }

}
