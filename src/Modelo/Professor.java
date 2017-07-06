package Modelo;

import java.sql.Date;

public class Professor extends Usuario {

    private int siape;
    private String titulo;
    private Curso curso;

    public Professor(int siape, String titulo, Curso curso, String nome, String senha, String cpf, Date dataNascimento, String cidade, String uf, String rua, String bairro, String telefone, String cep, String email, boolean status) {
        super(nome, senha, cpf, dataNascimento, cidade, uf, rua, bairro, telefone, cep, email, status);
        this.siape = siape;
        this.titulo = titulo;
        this.curso = curso;
    }
    
    public Professor(){
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
