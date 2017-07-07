package Controle;

import Modelo.Administrador;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdmDAO {

    LogDAO log = new LogDAO();
    String tabela, func;

    public void cadastrarAdm(Administrador administrador, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "administrador";
        func = "Cadastrar Administrador";
        log.inserirLog(codUsuario, nomeUsuario, tabela, administrador.getCodAdm(), func);

        String sql = "INSERT INTO administrador(cod_adm, nome, senha, cpf, data_nascimento, cidade, uf, rua, bairro, cep, telefone, email, status, titulo, curso_cod)VALUES(default,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, administrador.getNome());
            stmt.setString(2, administrador.getSenha());
            stmt.setString(3, administrador.getCpf());
            stmt.setDate(4, administrador.getDataNascimento());
            stmt.setString(5, administrador.getCidade());
            stmt.setString(6, administrador.getUf());
            stmt.setString(7, administrador.getRua());
            stmt.setString(8, administrador.getBairro());
            stmt.setString(9, administrador.getCep());
            stmt.setString(10, administrador.getTelefone());
            stmt.setString(11, administrador.getEmail());
            stmt.setBoolean(12, administrador.getStatus());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public void alterarAdm(Administrador administrador, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "administrador";
        func = "Cadastrar Administrador";
        log.inserirLog(codUsuario, nomeUsuario, tabela, administrador.getCodAdm(), func);
        
        String sql = "UPDATE administrador SET nome = ?, senha = ?, cpf = ?, data_nascimento = ?, cidade= ?, uf = ?, rua = ?, bairro = ?, cep = ?, telefone = ?, email = ?, status = ? where cod_adm=" + administrador.getCodAdm();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, administrador.getNome());
            stmt.setString(2, administrador.getSenha());
            stmt.setString(3, administrador.getCpf());
            stmt.setDate(4, administrador.getDataNascimento());
            stmt.setString(5, administrador.getCidade());
            stmt.setString(6, administrador.getUf());
            stmt.setString(7, administrador.getRua());
            stmt.setString(8, administrador.getBairro());
            stmt.setString(9, administrador.getCep());
            stmt.setString(10, administrador.getTelefone());
            stmt.setString(11, administrador.getEmail());
            stmt.setBoolean(12, administrador.getStatus());
            stmt.execute();
            System.out.println("Alterado no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }

    public void desativarAdministrador(int codAdm, boolean status, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "administrador";
        func = "Cadastrar Administrador";
        log.inserirLog(codUsuario, nomeUsuario, tabela, codAdm, func);
        
        String sql = "UPDATE administrador SET  status = ? where cod_adm=" + codAdm;
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

    public Administrador buscarAdministrador(int codAdm) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM administrador WHERE cod_adm =" + codAdm;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Administrador administrador = null;

        if (result.next()) {
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

            administrador = new Administrador(codAdm, nome, senha, cpf, dataNascimento, cidade, uf, rua, bairro, cep, telefone, email, status);
        }
        result.close();
        stmt.close();
        con.close();

        return administrador;
    }
    
    public int loginAdm(int codAdm, String senha) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM administrador WHERE cod_adm =" + codAdm + "and senha = '" + senha + "'";
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
