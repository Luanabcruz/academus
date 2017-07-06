package Modelo;

public class Log {

    private int idLog;
    private int usuarioId;
    private String nome;
    private String funcionalidade;
    private String tabela;
    private int tabelaId;
    private String dataHora;

    public Log(int idLog, int usuarioId, String nome, String funcionalidade, String tabela, int tabelaId, String dataHora) {
        this.idLog = idLog;
        this.usuarioId = usuarioId;
        this.nome = nome;
        this.funcionalidade = funcionalidade;
        this.tabela = tabela;
        this.tabelaId = tabelaId;
        this.dataHora = dataHora;
    }


    public Log() {
    }

    public int getTabelaId() {
        return tabelaId;
    }

    public void setTabelaId(int tabelaId) {
        this.tabelaId = tabelaId;
    }
    
    public int getIdLog() {
        return idLog;
    }

    public void setIdLog(int idLog) {
        this.idLog = idLog;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    public String getTabela() {
        return tabela;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

}
