package Modelo;

import java.sql.Date;

public class Coordenador extends Professor {
    Date dataInicio;
    Date dataFim;
    boolean permissao;

    public Coordenador(Date dataInicio, Date dataFim, boolean permissao, int siape, String titulo, Curso curso, String nome, String senha, String cpf, Date dataNascimento, String cidade, String uf, String rua, String bairro, String telefone, String cep, String email, boolean status) {
        super(siape, titulo, curso, nome, senha, cpf, dataNascimento, cidade, uf, rua, bairro, telefone, cep, email, status);
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.permissao = permissao;
    }

    public Coordenador(){
    }
    
    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public boolean getPermissao() {
        return permissao;
    }

    public void setPermissao(boolean permissao) {
        this.permissao = permissao;
    }

}
