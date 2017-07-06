package Modelo;

public class Turma {

    private int codTurma;
    private Curso curso;
    private Periodo periodo;
    private int sala;
    private String horario;
    private Disciplina disciplina;
    private Professor professor;
    
    public Turma() {

    }

    public Turma(int codTurma, Curso curso, Periodo periodo, int sala, String horario, Disciplina disciplina, Professor professor) {
        this.codTurma = codTurma;
        this.curso = curso;
        this.periodo = periodo;
        this.sala = sala;
        this.horario = horario;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
