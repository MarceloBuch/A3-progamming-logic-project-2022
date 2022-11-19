package projetoa3;

public class Usuario {
    private int IDUsuario;
    private String NomeUsuario;
    private String CPFUsuario;
    private char[] TipoUsuario;
    
    public Usuario(int IDUsuario, String NomeUsuario, String CPFUsuario, char[] TipoUsuario){
        this.IDUsuario = IDUsuario;
        this.NomeUsuario = NomeUsuario;
        this.CPFUsuario = CPFUsuario;
        this.TipoUsuario = TipoUsuario;
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

    public char[] getTipoUsuario() {
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

    public void setTipoUsuario(char[] TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }
}
