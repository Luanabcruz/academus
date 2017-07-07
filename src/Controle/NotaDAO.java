package Controle;

import Modelo.Disciplina;
import Modelo.InformarTurma;
import Modelo.Nota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class NotaDAO {

    
    public Vector Pesquisar (int pesq) throws Exception{
        Vector tb = new Vector();
        String url = "SELECT * FROM nota where matricula like '" + String.valueOf(pesq) + "'";
        
        Connection con = Conexao.getConnection();
        PreparedStatement ps = con.prepareStatement(url);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("cod_nota"));
            nl.add(rs.getInt("turma_cod"));
            // Buscando os dados do informar turma
            InformarTurma model = new InformarTurma();
            InformarTurmaDAO control = new InformarTurmaDAO();
            model = control.buscarInformarTurma(rs.getInt("turma_cod")); 
            // Buscando o nome da disciplina
            Disciplina modelD = new Disciplina();
            DisciplinaDAO controlD = new DisciplinaDAO();
            modelD = controlD.buscarDisciplina(model.getDisciplinaCod());
            
            nl.add(modelD.getNomeDisc().toString());
            tb.add(nl);
        }     
        return tb;
    }
    
    public void cadastrarNota(Nota nota) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "INSERT INTO nota(cod_nota, matricula, turma_cod, nota_1, nota_2, nota_3)VALUES(default,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, nota.getAluno().getMatricula());
            stmt.setInt(2, nota.getTurma().getCodTurma());
            stmt.setFloat(3, nota.getNota1());
            stmt.setFloat(4, nota.getNota2());
            stmt.setFloat(5, nota.getNota3());
            stmt.execute();
            System.out.println("Inserido no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public void alterarNota(Nota nota) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "UPDATE nota SET matricula = ?, turma_cod = ?, nota_1 = ?, nota_2 = ?, nota_3 = ? where cod_nota=" + nota.getCodNota();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, nota.getAluno().getMatricula());
            stmt.setInt(2, nota.getTurma().getCodTurma());
            stmt.setFloat(3, nota.getNota1());
            stmt.setFloat(4, nota.getNota2());
            stmt.setFloat(5, nota.getNota3());
            stmt.execute();
            System.out.println("Alterado no Banco..");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar: " + ex.getMessage());
        }
    }

    public Nota buscarNota(int codNota) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "SELECT * FROM nota WHERE cod_nota =" + codNota;
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        Nota nota = null;

        if (result.next()) {
            AlunoDAO adao = new AlunoDAO();
            TurmaDAO tdao = new TurmaDAO();
            int nota1 = result.getInt("nota_1");
            int nota2 = result.getInt("nota_2");
            int nota3 = result.getInt("nota_3");
            nota = new Nota(codNota, adao.buscarAluno(result.getInt("matricula")), tdao.buscarTurma(result.getInt("turma_cod")), nota1, nota2, nota3);
        }
        result.close();
        stmt.close();
        con.close();

        return nota;
    }
}
