package Modelo;

import java.sql.Date;

public class Periodo {

    private int codPeriodo;
    private int numPeriodo;
    private Date dataInicio;
    private Date dataFim;

    public Periodo(int codPeriodo, int numPeriodo, Date dataInicio, Date dataFim) {
        this.codPeriodo = codPeriodo;
        this.numPeriodo = numPeriodo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Periodo() {
       
    }

    public int getCodPeriodo() {
        return codPeriodo;
    }

    public void setCodPeriodo(int codPeriodo) {
        this.codPeriodo = codPeriodo;
    }

    public int getNumPeriodo() {
        return numPeriodo;
    }

    public void setNumPeriodo(int numPeriodo) {
        this.numPeriodo = numPeriodo;
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

}
