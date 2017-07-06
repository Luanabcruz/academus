package Modelo;

import java.sql.Date;

public class Aluno extends Usuario {

    private int matricula;
    private Curso curso;
    private float cra;
    private String anoIngressante;

    public Aluno(int matricula, Curso curso, float cra, String anoIngressante, String nome, String senha, String cpf, Date dataNascimento, String cidade, String uf, String rua, String bairro, String telefone, String cep, String email, boolean status) {
        super(nome, senha, cpf, dataNascimento, cidade, uf, rua, bairro, telefone, cep, email, status);
        this.matricula = matricula;
        this.curso = curso;
        this.cra = cra;
        this.anoIngressante = anoIngressante;
    }

    public Aluno(){
    }  

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public float getCra() {
        return cra;
    }

    public void setCra(float cra) {
        this.cra = cra;
    }

    public String getAnoIngressante() {
        return anoIngressante;
    }

    public void setAnoIngressante(String anoIngressante) {
        this.anoIngressante = anoIngressante;
    }

}
