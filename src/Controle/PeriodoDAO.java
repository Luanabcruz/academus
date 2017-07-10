package Controle;

import Modelo.Periodo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeriodoDAO {

    public void cadastrarPeriodo(Periodo periodo) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "INSERT INTO periodo(cod_periodo, num_periodo, data_inicio, data_fim)VALUES(default,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, periodo.getNumPeriodo());
            stmt.setDate(2, periodo.getDataInicio());
            stmt.setDate(3, periodo.getDataFim());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public void alterarPeriodo(Periodo periodo) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "UPDATE periodo SET num_periodo = ?, data_inicio = ?, data_fim = ? where cod_periodo = "+periodo.getCodPeriodo();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, periodo.getNumPeriodo());
            stmt.setDate(2, periodo.getDataInicio());
            stmt.setDate(3, periodo.getDataFim());
            stmt.execute();
            System.out.println("Alterado no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }
    
    public Periodo buscarPeriodo(int codPeriodo) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM periodo WHERE cod_periodo =" + codPeriodo;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Periodo periodo = null;

        if (result.next()) {
            int numPeriodo = result.getInt("num_periodo");
            Date dataInicio = result.getDate("data_inicio");
            Date dataFim = result.getDate("data_fim");
            periodo = new Periodo(codPeriodo, numPeriodo, dataInicio, dataFim);
        }
        result.close();
        stmt.close();
        con.close();

        return periodo;
    }

}
