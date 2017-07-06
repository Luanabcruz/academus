package Controle;

import Modelo.Log;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class LogDAO {

    public LogDAO() {
    }
 
    public void cadastrarLog(Log log) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "INSERT INTO log(cod_log, usuario_cod, nome, funcionalidade, tabela, tabela_cod, data_hora)VALUES(default,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, log.getUsuarioId());
            stmt.setString(2, log.getNome());
            stmt.setString(3, log.getFuncionalidade());
            stmt.setString(4, log.getTabela());
            stmt.setInt(5, log.getTabelaId());
            stmt.setString(6, log.getDataHora());
            stmt.execute();
            System.out.println("Cadastrado Log no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public String retornaDataHora() throws SQLException {
        Locale locale = new Locale("pt", "BR");
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'", locale);
        String dataHora = formatador.format(calendar.getTime());

        return dataHora;
    }

    public void inserirLog(int codUsuario, String nomeUsuario, String tabela, int tabelaId, String func) throws SQLException {
        Log log = new Log();
        LogDAO logDAO = new LogDAO();
        log.setUsuarioId(codUsuario);
        log.setNome(nomeUsuario);
        log.setTabela(tabela);
        log.setTabelaId(tabelaId);
        log.setFuncionalidade(func);
        log.setDataHora(retornaDataHora());
        logDAO.cadastrarLog(log);
    }
}
