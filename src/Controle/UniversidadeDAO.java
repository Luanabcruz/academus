package Controle;

import Modelo.Universidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UniversidadeDAO {

    public void cadastrarUniversidade(Universidade universidade) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "INSERT INTO universidade(cod_universidade, cnpj, nome_uni, campus, cidade, rua, bairro, uf, cep, telefone, email)VALUES(default,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, universidade.getCnpj());
            stmt.setString(2, universidade.getNomeUni());
            stmt.setString(3, universidade.getCampus());
            stmt.setString(4, universidade.getCidade());
            stmt.setString(5, universidade.getRua());
            stmt.setString(6, universidade.getBairro());
            stmt.setString(7, universidade.getUf());
            stmt.setString(8, universidade.getCep());
            stmt.setString(9, universidade.getTelefone());
            stmt.setString(10, universidade.getEmail());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public void alterarUniversidade(Universidade universidade) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "UPDATE universidade SET cnpj =?, nome_uni = ?, campus = ?, cidade = ?, rua = ?, bairro = ?, uf = ?, cep = ?, telefone = ?, email = ? where ="+universidade.getCodUniversidade();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, universidade.getCnpj());
            stmt.setString(2, universidade.getNomeUni());
            stmt.setString(3, universidade.getCampus());
            stmt.setString(4, universidade.getCidade());
            stmt.setString(5, universidade.getRua());
            stmt.setString(6, universidade.getBairro());
            stmt.setString(7, universidade.getUf());
            stmt.setString(8, universidade.getCep());
            stmt.setString(9, universidade.getTelefone());
            stmt.setString(10, universidade.getEmail());
            stmt.execute();
            System.out.println("Alterado no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }
    
    public Universidade buscarUniversidade(int codUniversidade) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM universidade WHERE cod_universidade =" + codUniversidade;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Universidade universidade = null;

        if (result.next()) {
            String cnpj = result.getString("cnpj");
            String nomeUni = result.getString("nome_uni");
            String campus = result.getString("campus");
            String cidade = result.getString("cidade");
            String rua = result.getString("rua");
            String bairro = result.getString("bairro");
            String uf = result.getString("uf");
            String cep = result.getString("cep");
            String telefone = result.getString("telefone");
            String email = result.getString("email");
            universidade = new Universidade(campus, codUniversidade, cnpj, nomeUni, cidade, rua, bairro, uf, cep, telefone, email);
        }
        result.close();
        stmt.close();
        con.close();

        return universidade;
    }

}
