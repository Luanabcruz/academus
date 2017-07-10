package Controle;

import Modelo.Frequencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FrequenciaDAO {
    
    public void cadastrarFrequencia(Frequencia frequencia) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "INSERT INTO frequencia(cod_frequencia, matricula, aula_cod, presenca)VALUES(default,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, frequencia.getAluno().getMatricula());
            stmt.setInt(2, frequencia.getAula().getCodAula());
            stmt.setInt(3, frequencia.getPresenca());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public Frequencia buscarFrequencia(int codFrequencia) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM frequencia WHERE cod_frequencia =" + codFrequencia;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Frequencia frequencia = null;

        if (result.next()) {
            AlunoDAO adao = new AlunoDAO();
            AulaDAO auladao = new AulaDAO();
            int presenca = result.getInt("presenca");
            frequencia = new Frequencia(codFrequencia, auladao.buscarAula(result.getInt("aula_cod")), adao.buscarAluno(result.getInt("matricula")), presenca);
        }
        result.close();
        stmt.close();
        con.close();

        return frequencia;
    }

    public void alterarFrequencia(Frequencia frequencia) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "UPDATE frequencia SET presenca = ? where matricula = " + frequencia.getAluno().getMatricula() + " and cod_frequencia = " + frequencia.getCodFrequencia();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, frequencia.getAluno().getMatricula());
            stmt.setInt(2, frequencia.getPresenca());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

}
