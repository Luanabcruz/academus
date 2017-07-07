package Modelo;

import java.sql.Date;

public class Usuario {

    protected String nome;
    protected String senha;
    protected String cpf;
    protected Date dataNascimento;
    protected String cidade;
    protected String uf;
    protected String rua;
    protected String bairro;
    protected String telefone;
    protected String cep;
    protected String email;
    protected boolean status;

    public Usuario(String nome, String senha, String cpf, Date dataNascimento, String cidade, String uf, String rua, String bairro, String telefone, String cep, String email, boolean status) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;
        this.uf = uf;
        this.rua = rua;
        this.bairro = bairro;
        this.telefone = telefone;
        this.cep = cep;
        this.email = email;
        this.status = status;
    }

    public Usuario() {
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

}
