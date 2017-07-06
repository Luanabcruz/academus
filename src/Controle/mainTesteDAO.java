package Controle;

import Controle.InformarTurmaDAO;
import Modelo.Administrador;
import Modelo.Aluno;
import Modelo.InformarTurma;
import Modelo.Log;
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

        profTurma.add(0, "Luana");
        profTurma.add(0, "Aluna");
        profTurma.add(1, "Joana");
        profTurma.add(1, "Professora");

        //for (int i = 0; i < profTurma.size(); i++) {
            System.out.println(profTurma.get(0)); // código não muito útil....
            System.out.println(profTurma.get(1));
        //}
    }
}
