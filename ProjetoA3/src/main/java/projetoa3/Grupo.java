package projetoa3;

public class Grupo {
    private int IDGrupo;
    private int IDTime1;
    private int IDTime2;
    private int IDTime3;
    private int IDTime4;
    
    public Grupo(int IDGrupo, int IDTime1, int IDTime2, int IDTime3, int IDTime4){
        this.IDGrupo = IDGrupo;
        this.IDTime1 = IDTime1;
        this.IDTime2 = IDTime2;
        this.IDTime3 = IDTime3;
        this.IDTime4 = IDTime4;
    }

    public int getIDGrupo() {
        return IDGrupo;
    }

    public int getIDTime1() {
        return IDTime1;
    }

    public int getIDTime2() {
        return IDTime2;
    }

    public int getIDTime3() {
        return IDTime3;
    }

    public int getIDTime4() {
        return IDTime4;
    }

    public void setIDGrupo(int IDGrupo) {
        this.IDGrupo = IDGrupo;
    }

    public void setIDTime1(int IDTime1) {
        this.IDTime1 = IDTime1;
    }

    public void setIDTime2(int IDTime2) {
        this.IDTime2 = IDTime2;
    }

    public void setIDTime3(int IDTime3) {
        this.IDTime3 = IDTime3;
    }

    public void setIDTime4(int IDTime4) {
        this.IDTime4 = IDTime4;
    }
}
