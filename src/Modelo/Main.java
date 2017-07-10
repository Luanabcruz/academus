package Modelo;


import Controle.AlunoDAO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws SQLException{
      AlunoDAO controle = new AlunoDAO();
      ArrayList<Aluno> alunos = new ArrayList<>();
      alunos = controle.visualizarAlunos();
      
      for(int i=0;i<alunos.size();i++){
          System.out.print(alunos.get(i).getCurso().getNomeCurso());
      }
        /*  
      Locale locale = new Locale("pt","BR");
      GregorianCalendar calendar = new GregorianCalendar();
      SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'",locale);
      System.out.println(formatador.format(calendar.getTime()));
      String teste =formatador.format(calendar.getTime());
      */
      
    }

    
    
    
}
