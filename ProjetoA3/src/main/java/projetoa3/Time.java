package projetoa3;

public class Time {
    private int IDTime;
    private String Nome_Time;
    private String Estadio;
    
    public Time(int IDTime, String Nome_Time, String Estadio){
        this.IDTime = IDTime;
        this.Nome_Time = Nome_Time;
        this.Estadio = Estadio;
    }
    
    public Time( String Nome_Time, String Estadio){
        this.Nome_Time = Nome_Time;
        this.Estadio = Estadio;
    }

    public int getIDTime() {
        return IDTime;
    }

    public String getNome_Time() {
        return Nome_Time;
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

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }
    
    @Override
    public String toString(){
        return this.Nome_Time;
    }
}
