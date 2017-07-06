package Controle;

import Modelo.Coordenador;
import Modelo.Professor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoordenadorDAO {
    
    LogDAO log = new LogDAO();
    String tabela, func;

    public void cadastrarCoordenador(Coordenador coordenador, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "coordenador";
        func = "Cadastrar Coordenador";        
        log.inserirLog(codUsuario, nomeUsuario, tabela, coordenador.getSiape(), func);
        
        String sql = "INSERT INTO professor(siape, nome, senha, cpf, data_nascimento, cidade, uf, rua, bairro, cep, telefone, email, status, titulo, curso_cod, data_inicio, data_fim, permissao)VALUES(default,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, coordenador.getNome());
            stmt.setString(2, coordenador.getSenha());
            stmt.setString(3, coordenador.getCpf());
            stmt.setDate(4, coordenador.getDataNascimento());
            stmt.setString(5, coordenador.getCidade());
            stmt.setString(6, coordenador.getUf());
            stmt.setString(7, coordenador.getRua());
            stmt.setString(8, coordenador.getBairro());
            stmt.setString(9, coordenador.getCep());
            stmt.setString(10, coordenador.getTelefone());
            stmt.setString(11, coordenador.getEmail());
            stmt.setBoolean(12, coordenador.getStatus());
            stmt.setString(11, coordenador.getTitulo());
            stmt.setInt(14, coordenador.getCurso().getCodCurso());
            stmt.setDate(15, coordenador.getDataInicio());
            stmt.setDate(16, coordenador.getDataFim());
            stmt.setBoolean(15, coordenador.getPermissao());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public void alterarCoordenador(Coordenador coordenador, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "coordenador";
        func = "Cadastrar Coordenador";        
        log.inserirLog(codUsuario, nomeUsuario, tabela, coordenador.getSiape(), func);
        
        String sql = "UPDATE coordenador SET nome = ?, senha = ?, cpf = ?, data_nascimento = ?, cidade= ?, uf = ?, rua = ?, bairro = ?, cep = ?, telefone = ?, email = ?, titulo = ? where siape=" + coordenador.getSiape();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, coordenador.getNome());
            stmt.setString(2, coordenador.getSenha());
            stmt.setString(3, coordenador.getCpf());
            stmt.setDate(4, coordenador.getDataNascimento());
            stmt.setString(5, coordenador.getCidade());
            stmt.setString(6, coordenador.getUf());
            stmt.setString(7, coordenador.getRua());
            stmt.setString(8, coordenador.getBairro());
            stmt.setString(9, coordenador.getCep());
            stmt.setString(10, coordenador.getTelefone());
            stmt.setString(11, coordenador.getEmail());
            stmt.setString(12, coordenador.getTitulo());
            stmt.execute();
            System.out.println("Alterado no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }

    public void desativarCoordenador(int siape, boolean status, int codUsuario, String nomeUsuario) throws SQLException {
        Connection con = Conexao.getConnection();
        tabela = "coordenador";
        func = "Desativar Coordenador";        
        log.inserirLog(codUsuario, nomeUsuario, tabela, siape, func);
        
        String sql = "UPDATE coordenador SET  status = ? where siape=" + siape;
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

    public Coordenador buscarCoordenador(int siape) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM coordenador WHERE siape =" + siape;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Coordenador coordenador = null;

        if (result.next()) {
            CursoDAO cdao = new CursoDAO();
            int cursoCod = result.getInt("curso_cod");
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
            Date dataInicio = result.getDate("data_inicio");
            Date dataFim= result.getDate("data_fim");
            Boolean permissao = result.getBoolean("permissao");
            
            coordenador = new Coordenador(dataInicio, dataFim, permissao, siape, titulo, cdao.buscarCurso(result.getInt("curso_cod")), nome, senha, cpf, dataNascimento, cidade, uf, rua, bairro, telefone, cep, email, status);
        }
        result.close();
        stmt.close();
        con.close();

        return coordenador;
    }
    
    public int loginCoordenador(int siape, String senha) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM coordenador WHERE siape =" + siape + "and senha = '" + senha + "'";
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
