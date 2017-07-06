package Modelo;

import java.sql.Date;

public class Aula {

    private int codAula;
    private Turma turma;
    private Date data;

    public Aula(int codAula, Turma turma, Date data) {
        this.codAula = codAula;
        this.turma = turma;
        this.data = data;
    }

    public Aula() {
    }

    public int getCodAula() {
        return codAula;
    }

    public void setCodAula(int codAula) {
        this.codAula = codAula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
