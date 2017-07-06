package Modelo;

public class Curso {

    private int codCurso;
    private Administrador administrador;
    private Universidade universidade;
    private String nomeCurso;
    private float conceitoCurso;
    private String descricao;
    private int cargaCurso;
    private boolean statusCurso;

    public Curso(int codCurso, Administrador administrador, Universidade universidade, String nomeCurso, float conceitoCurso, String descricao, int cargaCurso, boolean statusCurso) {
        this.codCurso = codCurso;
        this.administrador = administrador;
        this.universidade = universidade;
        this.nomeCurso = nomeCurso;
        this.conceitoCurso = conceitoCurso;
        this.descricao = descricao;
        this.cargaCurso = cargaCurso;
        this.statusCurso = statusCurso;
    }

    public Curso() {
        
    }
    
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public float getConceitoCurso() {
        return conceitoCurso;
    }

    public void setConceitoCurso(float conceitoCurso) {
        this.conceitoCurso = conceitoCurso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaCurso() {
        return cargaCurso;
    }

    public void setCargaCurso(int cargaCurso) {
        this.cargaCurso = cargaCurso;
    }

    public boolean getStatusCurso() {
        return statusCurso;
    }

    public void setStatusCurso(boolean statusCurso) {
        this.statusCurso = statusCurso;
    }
    
}
