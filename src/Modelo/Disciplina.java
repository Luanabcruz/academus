package Modelo;

public class Disciplina {

    private int codDisciplina;
    private Curso curso;
    private String nomeDisc;
    private int credito;
    private String descricao;
    private Boolean status;

    public Disciplina(int codDisciplina, Curso curso, String nomeDisc, int credito, String descricao, Boolean status) {
        this.codDisciplina = codDisciplina;
        this.curso = curso;
        this.nomeDisc = nomeDisc;
        this.credito = credito;
        this.descricao = descricao;
        this.status = status;
    }

    public Disciplina() {

    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNomeDisc() {
        return nomeDisc;
    }

    public void setNomeDisc(String nomeDisc) {
        this.nomeDisc = nomeDisc;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
