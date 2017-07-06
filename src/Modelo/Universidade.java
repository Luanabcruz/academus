package Modelo;

public class Universidade {

    private int codUniversidade;
    private String cnpj;
    private String nomeUni;
    private String campus;
    private String cidade;
    private String rua;
    private String bairro;
    private String uf;
    private String cep;
    private String telefone;
    private String email;

    public Universidade(String campus, int codUniversidade, String cnpj, String nomeUni, String cidade, String rua, String bairro, String uf, String cep, String telefone, String email) {
        this.cnpj = cnpj;
        this.campus = campus;
        this.nomeUni = nomeUni;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public int getCodUniversidade() {
        return codUniversidade;
    }

    public void setCodUniversidade(int codUniversidade) {
        this.codUniversidade = codUniversidade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeUni() {
        return nomeUni;
    }

    public void setNomeUni(String nomeUni) {
        this.nomeUni = nomeUni;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
