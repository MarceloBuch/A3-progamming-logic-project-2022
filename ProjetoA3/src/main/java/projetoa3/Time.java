package projetoa3;

import java.sql.Date;

public class Time {
    private int IDTime;
    private String Nome_Time;
    private Date Data_Fundacao;
    private String Estadio;
    
    public Time(int IDTime, String Nome_Time, Date Data_Fundacao, String Estadio){
        this.IDTime = IDTime;
        this.Nome_Time = Nome_Time;
        this.Data_Fundacao = Data_Fundacao;
        this.Estadio = Estadio;
    }

    public int getIDTime() {
        return IDTime;
    }

    public String getNome_Time() {
        return Nome_Time;
    }

    public Date getData_Fundacao() {
        return Data_Fundacao;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setIDTime(int IDTime) {
        this.IDTime = IDTime;
    }

    public void setNome_Time(String Nome_Time) {
        this.Nome_Time = Nome_Time;
    }

    public void setData_Fundacao(Date Data_Fundacao) {
        this.Data_Fundacao = Data_Fundacao;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }
}
