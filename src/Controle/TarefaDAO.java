package Controle;

import Modelo.Periodo;
import Modelo.Tarefa;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TarefaDAO {

    public void cadastrarTarefa(Tarefa tarefa) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "INSERT INTO tarefa(cod_tarefa, turma_cod, descricao, data_inicio, data_fim, matricula, resposta)VALUES(default,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, tarefa.getTurma().getCodTurma());
            stmt.setString(2, tarefa.getDescricao());
            stmt.setDate(3, tarefa.getDataInicio());
            stmt.setDate(4, tarefa.getDataFim());
            stmt.setInt(5, tarefa.getAluno().getMatricula());
            stmt.setString(6, tarefa.getResposta());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public void alterarTarefa(Tarefa tarefa) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "UPDATE tarefa SET descricao = ?, data_fim = ? where cod_tarefa = "+tarefa.getCodTarefa()+"and turma_cod"+tarefa.getTurma().getCodTurma();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, tarefa.getDescricao());
            stmt.setDate(2, tarefa.getDataFim());
            stmt.execute();
            System.out.println("Alterado no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }
    
    public Tarefa buscarTarefa(int codTarefa) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM tarefa WHERE cod_tarefa =" + codTarefa;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Tarefa tarefa = null;

        if (result.next()) {
            TurmaDAO tdao = new TurmaDAO();
            AlunoDAO adao = new AlunoDAO();
            String descricao = result.getString("descricao");
            Date dataInicio = result.getDate("data_inicio");
            Date dataFim = result.getDate("data_fim");
            String resposta = result.getString("resposta");
            tarefa = new Tarefa(codTarefa, tdao.buscarTurma(result.getInt("turma_cod")), descricao, dataInicio, dataFim, adao.buscarAluno(result.getInt("matricula")), resposta);
        }
        result.close();
        stmt.close();
        con.close();

        return tarefa;
    }
}
