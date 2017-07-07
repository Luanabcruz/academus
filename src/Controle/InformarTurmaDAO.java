package Controle;

import Modelo.InformarTurma;
import Modelo.Log;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class InformarTurmaDAO {

    public InformarTurmaDAO() {
    }

    Log log = new Log();
    LogDAO logDAO = new LogDAO();
    Locale locale = new Locale("pt", "BR");
    GregorianCalendar calendar = new GregorianCalendar();
    SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'", locale);
    String dataHora = formatador.format(calendar.getTime());
    
    public Vector Pesquisar (String pesq) throws Exception{
        Vector tb = new Vector();
        String url = "SELECT * FROM curso where nome_curso like '" + pesq + "%'" ;
        Connection con = Conexao.getConnection();
        PreparedStatement ps = con.prepareStatement(url);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getString("nome_curso"));
            nl.add(rs.getInt("cod_curso"));
            tb.add(nl);
        }     
        return tb;
    }
    
    public void cadastrarInformarTurma(InformarTurma turma) throws SQLException {
        Connection con = Conexao.getConnection();
        log.setIdLog(2);
        log.setUsuarioId(turma.getCodInfo());
        log.setNome("coordenador");
        log.setTabela("informar_turma");
        log.setFuncionalidade("cadastrar");
        log.setDataHora(dataHora);
        logDAO.cadastrarLog(log);

        String sql = "INSERT INTO informar_turma(cod_info, siape, cod_disciplina, cod_curso)VALUES(default, ?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, turma.getCodInfo());
            stmt.setInt(2, turma.getSiape());
            stmt.setInt(3, turma.getCursoCod());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public InformarTurma buscarInformarTurma(int codInformarTurma) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM informar_turma WHERE cod_info =" + codInformarTurma;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        InformarTurma informarTurma = null;

        if (result.next()) {
            int siape = result.getInt("siape");
            int codDisciplina = result.getInt("cod_disciplina");
            int codCurso = result.getInt("cod_curso");
            informarTurma = new InformarTurma(codInformarTurma, siape, codDisciplina, codCurso);
        }
        result.close();
        stmt.close();
        con.close();

        return informarTurma;
    }

    public void alterarInformarTurma(InformarTurma turma) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "UPDATE informar_turma SET siape=?, cod_disciplina = ?, cod_curso =? where cod_info=" + turma.getCodInfo();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, turma.getSiape());
            stmt.setInt(2, turma.getDisciplinaCod());
            stmt.setInt(3, turma.getCursoCod());
            stmt.execute();
            System.out.println("Alterado no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }

    public void excluirInformarTurma(int cod_info) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "DELETE FROM informar_turma WHERE cod_info = " + cod_info;
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Excluido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }

    public ArrayList<InformarTurma> visualizarInformarTurma() throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "select * from informar_turma";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();

        ArrayList<InformarTurma> turmas = new ArrayList<InformarTurma>();

        while (result.next()) {
            InformarTurma info = new InformarTurma();
            info.setCodInfo(result.getInt("cod_info"));
            info.setSiape(result.getInt("siape"));
            info.setDisciplinaCod(result.getInt("disciplina_cod"));
            info.setCursoCod(result.getInt("curso_cod"));
            turmas.add(info);
        }
        result.close();
        stmt.close();
        con.close();

        return turmas;
    }
}
