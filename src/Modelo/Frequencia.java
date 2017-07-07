package Modelo;

public class Frequencia {

    private int codFrequencia;
    private Aula aula;
    private Aluno aluno;
    private int presenca;

    public Frequencia(int codFrequencia, Aula aula, Aluno aluno, int presenca) {
        this.codFrequencia = codFrequencia;
        this.aula = aula;
        this.aluno = aluno;
        this.presenca = presenca;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public int getCodFrequencia() {
        return codFrequencia;
    }

    public void setCodFrequencia(int codFrequencia) {
        this.codFrequencia = codFrequencia;
    }

    public int getPresenca() {
        return presenca;
    }

    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }

}
