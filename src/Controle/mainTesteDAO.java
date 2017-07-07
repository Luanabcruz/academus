package Controle;

import Controle.InformarTurmaDAO;
import Modelo.Administrador;
import Modelo.Aluno;
import Modelo.InformarTurma;
import Modelo.Log;
import Modelo.Nota;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Locale;

public class mainTesteDAO {

    public static void main(String[] args) throws SQLException {

        ArrayList<Object> profTurma = new ArrayList<>();
        AlunoDAO adao = new AlunoDAO();
        
        ArrayList<Nota> notas = new ArrayList<>();
        notas = adao.buscarAlunoTurma(1);
        
    }
}
