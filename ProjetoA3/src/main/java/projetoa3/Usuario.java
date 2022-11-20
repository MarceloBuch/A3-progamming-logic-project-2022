package projetoa3;

public class Usuario {
    private int IDUsuario;
    private String NomeUsuario;
    private String SenhaUsuario;
    private String CPFUsuario;
    private int TipoUsuario;
    
    public Usuario(int IDUsuario, String NomeUsuario, String SenhaUsuario, String CPFUsuario, int TipoUsuario){
        this.IDUsuario = IDUsuario;
        this.NomeUsuario = NomeUsuario;
        this.SenhaUsuario = SenhaUsuario;
        this.CPFUsuario = CPFUsuario;
        this.TipoUsuario = TipoUsuario;
    }

    public String getSenhaUsuario() {
        return SenhaUsuario;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public String getNomeUsuario() {
        return NomeUsuario;
    }

    public String getCPFUsuario() {
        return CPFUsuario;
    }

    public int getTipoUsuario() {
        return TipoUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public void setNomeUsuario(String NomeUsuario) {
        this.NomeUsuario = NomeUsuario;
    }

    public void setCPFUsuario(String CPFUsuario) {
        this.CPFUsuario = CPFUsuario;
    }

    public void setTipoUsuario(int TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    public void setSenhaUsuario(String SenhaUsuario) {
        this.SenhaUsuario = SenhaUsuario;
    }
}
