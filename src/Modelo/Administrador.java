package Modelo;

import java.sql.Date;

public class Administrador extends Usuario{

    private int codAdm;
    
    public Administrador(int codAdm,String nome,String senha, String cpf, Date dataNascimento, String cidade,String uf,String rua,String bairro,String cep,String telefone,String email, Boolean status){
        super(nome, senha, cpf, dataNascimento, cidade, uf, rua, bairro, telefone, cep, email, true);
        this.codAdm=codAdm;
        
    }

    public Administrador() {
        
    }
    
    public int cadastrarAdm(int codAdm, String senha){return 0;}
    
    public boolean desativarVinculo(int codAdm){return true;}

    public void setCodAdm(int codAdm) {
        this.codAdm = codAdm;
    }

    public int getCodAdm() {
        return codAdm;
    }
    
}
