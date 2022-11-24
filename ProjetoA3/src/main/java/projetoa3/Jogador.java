package projetoa3;


public class Jogador {
    private int IDJogador;
    private String Nome_Jogador;
    private String Posicao_Jogador;
    
    public Jogador(int IDJogador, String Nome_Jogador, String Posicao_Jogador){
        this.IDJogador = IDJogador;
        this.Nome_Jogador = Nome_Jogador;
        this.Posicao_Jogador = Posicao_Jogador;
    }

    public int getIDJogador() {
        return IDJogador;
    }

    public String getNome_Jogador() {
        return Nome_Jogador;
    }

    public String getPosicao_Jogador() {
        return Posicao_Jogador;
    }

    public void setIDJogador(int IDJogador) {
        this.IDJogador = IDJogador;
    }

    public void setNome_Jogador(String Nome_Jogador) {
        this.Nome_Jogador = Nome_Jogador;
    }

    public void setPosicao_Jogador(String Posicao_Jogador) {
        this.Posicao_Jogador = Posicao_Jogador;
    }
    
    
}
