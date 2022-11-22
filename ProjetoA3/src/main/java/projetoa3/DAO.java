package projetoa3;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
    public boolean existe(Usuario usuario) throws Exception{
        String sql="SELECT * FROM tb_usuario WHERE Nome_Usuario=? AND Senha_Usuario=?";
        try(Connection conn=ConexaoDB.obterConexao()){
                PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1,usuario.getNomeUsuario());
                    ps.setString(2,usuario.getSenhaUsuario());
                    try(ResultSet rs = ps.executeQuery()){
                        return rs.next();
                    }        
        }              
    }
    
    public void cadastrarUsuario(Usuario usuario) throws Exception{
        String sql = "INSERT INTO tb_usuario(IDUsuario, Nome_Usuario, Senha_Usuario, CPF_Usuario, Tipo_Usuario) values(default, ?, ?, ?, 0)";
        try(Connection conn = ConexaoDB.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, usuario.getNomeUsuario());
                ps.setString(2, usuario.getSenhaUsuario());
                ps.setString(3, usuario.getCPFUsuario());
                ps.execute(); 
        }
    
    }
    
    public void atualizarUsuario (Usuario usuario) throws Exception{ 
        String sql = "UPDATE tb_usuario SET Nome_Usuario = ?, CPF_Usuario = ?, Tipo_Usuario = ? WHERE IDUsuario = ?"; 
        try (Connection conexao = ConexaoDB.obterConexao(); 
                PreparedStatement ps = conexao.prepareStatement(sql)){ 
                    ps.setString (1, usuario.getNomeUsuario()); 
                    ps.setString (2, usuario.getCPFUsuario()); 
                    ps.setInt(3, usuario.getTipoUsuario());
                    ps.execute(); 
            } 
    }
    
    public void removerUsuario (Usuario usuario) throws Exception{ 
        String sql = "DELETE FROM tb_usuario WHERE IDUsuario = ?"; 
        try (Connection conexao = ConexaoDB.obterConexao(); 
                PreparedStatement ps = conexao.prepareStatement(sql);){ 
            ps.setInt (1, usuario.getIDUsuario()); 
            ps.execute(); 
        } 
    }
    
    public void cadastrarTime(Time time) throws Exception{
        String sql = "INSERT INTO tb_time(IDTime, Nome_Time, Data_Fundacao, Estadio) VALUES (default, ?, ?,?)";
        try(Connection conn = ConexaoDB.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, time.getNome_Time());
                ps.setDate(2, time.getData_Fundacao());
                ps.setString(3, time.getEstadio());
                ps.execute(); 
        }
    
    }
    
    public void atualizarTime(Time time) throws Exception{
        String sql = "UPDATE tb_time SET Nome_Time = ?, Data_Fundacao = ?, Estadio = ? WHERE IDTime = ?";
        try(Connection conn = ConexaoDB.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, time.getNome_Time());
                ps.setDate(2, time.getData_Fundacao());
                ps.setString(3, time.getEstadio());
                ps.execute(); 
        }
    
    }
    
    public void removerTime (Time time) throws Exception{ 
        String sql = "DELETE FROM tb_time WHERE IDTime = ?"; 
        try (Connection conexao = ConexaoDB.obterConexao(); 
                PreparedStatement ps = conexao.prepareStatement(sql);){ 
            ps.setInt (1, time.getIDTime()); 
            ps.execute(); 
        } 
    }
    
    public void cadastrarJogador(Jogador jogador) throws Exception{
        String sql = "INSERT INTO tb_jogador(IDJogador, Nome_Jogador, Data_Nascimento, Posicao_jogador, IDTime) VALUES (default, ?,?,?,?)";
        try(Connection conn = ConexaoDB.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, jogador.getNome_Jogador());
                ps.setDate(2, jogador.getData_Nascimento());
                ps.setString(3, jogador.getPosicao_Jogador());
                ps.setInt(4, jogador.getIDTime());
                ps.execute(); 
        }
    
    }
    
    public void atualizarJogador(Jogador jogador) throws Exception{
        String sql = "UPDATE tb_jogador SET Nome_Jogador = ?, Data_Nascimento = ?, Posicao_Jogador = ?, IDTime = ? WHERE IDJogador = ?";
        try(Connection conn = ConexaoDB.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, jogador.getNome_Jogador());
                ps.setDate(2, jogador.getData_Nascimento());
                ps.setString(3, jogador.getPosicao_Jogador());
                ps.setInt(4, jogador.getIDTime());
                ps.setInt(5, jogador.getIDJogador());
                ps.execute(); 
        }
    
    }
    
    public void removerJogador (Jogador jogador) throws Exception{ 
        String sql = "DELETE FROM tb_jogador WHERE IDJogador = ?"; 
        try (Connection conexao = ConexaoDB.obterConexao(); 
                PreparedStatement ps = conexao.prepareStatement(sql);){ 
            ps.setInt (1, jogador.getIDJogador()); 
            ps.execute(); 
        } 
    }
    
    public void inserirGrupo(Grupo grupo) throws Exception{
        String sql = "INSERT INTO tb_grupo(IDGrupo, IDTime1, IDTime2, IDTime3, IDTime4) VALUES (default, ?, ?, ?, ?)";
        try(Connection conexao = ConexaoDB.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql);){
            ps.setInt(1, grupo.getIDTime1());
            ps.setInt(2, grupo.getIDTime2());
            ps.setInt(3, grupo.getIDTime3());
            ps.setInt(4, grupo.getIDTime4());
        }
    }
    
    public void atualizarGrupo(Grupo grupo) throws Exception{
        String sql = "UPDATE tb_grupo SET IDTime1 = ?, IDTime2 = ?, IDTime3 = ?, IDTime4 = ? WHERE IDGrupo = ?";
        try(Connection conexao = ConexaoDB.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql);){
            ps.setInt(1, grupo.getIDTime1());
            ps.setInt(2, grupo.getIDTime2());
            ps.setInt(3, grupo.getIDTime3());
            ps.setInt(4, grupo.getIDTime4());
            ps.setInt(5, grupo.getIDGrupo());
        }
    }
    
    public void removerGrupo (Grupo grupo) throws Exception{ 
        String sql = "DELETE FROM tb_grupo WHERE IDGrupo = ?"; 
        try (Connection conexao = ConexaoDB.obterConexao(); 
                PreparedStatement ps = conexao.prepareStatement(sql);){ 
            ps.setInt (1, grupo.getIDGrupo()); 
            ps.execute(); 
        } 
    }
    
    
    
}
