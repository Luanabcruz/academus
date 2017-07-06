package Controle;

import Modelo.Turma;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TurmaDAO {

    public void cadastrarTurma(Turma turma) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "INSERT INTO turma(cod_turma, curso_cod, siape, periodo_cod, sala, horario, disciplina_cod)VALUES(default,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, turma.getCurso().getCodCurso());
            stmt.setInt(2, turma.getProfessor().getSiape());
            stmt.setInt(3, turma.getPeriodo().getCodPeriodo());
            stmt.setInt(4, turma.getSala());
            stmt.setString(5, turma.getHorario());
            stmt.setInt(6, turma.getDisciplina().getCodDisciplina());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public void alterarTurma(Turma turma) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "UPDATE turma SET curso_cod = ?, siape = ?, periodo_cod = ?, sala = ?, horario = ?, disciplina_cod = ? where cod_turma = "+turma.getCodTurma();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, turma.getCurso().getCodCurso());
            stmt.setInt(2, turma.getProfessor().getSiape());
            stmt.setInt(3, turma.getPeriodo().getCodPeriodo());
            stmt.setInt(4, turma.getSala());
            stmt.setString(5, turma.getHorario());
            stmt.setInt(6, turma.getDisciplina().getCodDisciplina());
            stmt.execute();
            System.out.println("Alterado no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }
    
    public Turma buscarTurma(int codTurma) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM turma WHERE cod_turma =" + codTurma;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Turma turma = null;

        if (result.next()) {
            CursoDAO cdao = new CursoDAO();
            ProfessorDAO pdao = new ProfessorDAO();
            PeriodoDAO pedao = new PeriodoDAO();
            DisciplinaDAO ddao = new DisciplinaDAO();
            int sala = result.getInt("sala");
            String horario = result.getString("horario");
            turma = new Turma(codTurma, cdao.buscarCurso(result.getInt("curso_cod")), pedao.buscarPeriodo(result.getInt("periodo_cod")), sala, horario, ddao.buscarDisciplina(result.getInt("disciplina_cod")), pdao.buscarProfessor(result.getInt("siape")));
         }
        result.close();
        stmt.close();
        con.close();

        return turma;
    }

}
