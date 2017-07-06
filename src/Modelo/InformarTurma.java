package Modelo;

public class InformarTurma {

    private int codInfo;
    private int siape;
    private int disciplinaCod;
    private int cursoCod;

    public InformarTurma(int codInfo, int siape, int disciplinaCod, int cursoCod) {
        this.codInfo = codInfo;
        this.siape = siape;
        this.disciplinaCod = disciplinaCod;
        this.cursoCod = cursoCod;
    }

    public InformarTurma() {
    }

    public int getCodInfo() {
        return codInfo;
    }

    public void setCodInfo(int codInfo) {
        this.codInfo = codInfo;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public int getDisciplinaCod() {
        return disciplinaCod;
    }

    public void setDisciplinaCod(int disciplinaCod) {
        this.disciplinaCod = disciplinaCod;
    }

    public int getCursoCod() {
        return cursoCod;
    }

    public void setCursoCod(int cursoCod) {
        this.cursoCod = cursoCod;
    }

}
