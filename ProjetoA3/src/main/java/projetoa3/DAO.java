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
    
    public Time[] obterTimes () throws Exception{ 
        String sql = "SELECT * FROM tb_time"; 
        try (Connection conn = ConexaoDB.obterConexao(); 
            PreparedStatement ps = 
            conn.prepareStatement(sql, 
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_READ_ONLY); 
            ResultSet rs = ps.executeQuery()){ 
            int totalDeTimes = rs.last () ? rs.getRow() : 0; 
            Time [] times = new Time[totalDeTimes]; 
            rs.beforeFirst(); 
            int contador = 0; 
            while (rs.next()){ 
                int id = rs.getInt("IDTime"); 
                String nome = rs.getString("Nome_Time"); 
                String estadio = rs.getString ("Estadio"); 
                times[contador++] = new Time (id, nome, estadio); 
            } 
            return times; 
        } 
    }
    
    public Jogador[] obterJogadores () throws Exception{ 
        String sql = "SELECT * FROM tb_jogador"; 
        try (Connection conn = ConexaoDB.obterConexao(); 
            PreparedStatement ps = 
            conn.prepareStatement(sql, 
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_READ_ONLY); 
            ResultSet rs = ps.executeQuery()){ 
            int totalDeJogadores = rs.last () ? rs.getRow() : 0;
            Jogador[] jogadores = new Jogador[totalDeJogadores];
            rs.beforeFirst(); 
            int contador = 0; 
            while (rs.next()){ 
                int id = rs.getInt("IDJogador"); 
                String nome = rs.getString("Nome_Jogador");
                int idade = rs.getInt("Idade_Jogador");
                String posicao =  rs.getString("Posicao_Jogador");
                jogadores[contador++] = new Jogador(id, nome, idade, posicao); 
            } 
            return jogadores; 
        }
    }
    
    public Usuario[] obterUsuarios () throws Exception{ 
        String sql = "SELECT * FROM tb_usuario"; 
        try (Connection conn = ConexaoDB.obterConexao(); 
            PreparedStatement ps = 
            conn.prepareStatement(sql, 
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_READ_ONLY); 
            ResultSet rs = ps.executeQuery()){ 
            int totalDeUsuarios = rs.last () ? rs.getRow() : 0;
            Usuario[] usuarios = new Usuario[totalDeUsuarios];
            rs.beforeFirst(); 
            int contador = 0; 
            while (rs.next()){ 
                int id = rs.getInt("IDUsuario"); 
                String nome = rs.getString("Nome_Usuario");
                String senha = rs.getString("Senha_Usuario");
                String cpf =  rs.getString("CPF_Usuario");
                int tipo = rs.getInt("Tipo_Usuario");
                usuarios[contador++] = new Usuario(id, nome, senha, cpf, tipo);  
            } 
            return usuarios; 
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
        String sql = "UPDATE tb_usuario SET Nome_Usuario = ?, Senha_Usuario = ?, CPF_Usuario = ?, Tipo_Usuario = ? WHERE IDUsuario = ?"; 
        try (Connection conexao = ConexaoDB.obterConexao(); 
                PreparedStatement ps = conexao.prepareStatement(sql)){ 
                    ps.setString (1, usuario.getNomeUsuario()); 
                    ps.setString(2, usuario.getSenhaUsuario());
                    ps.setString (3, usuario.getCPFUsuario()); 
                    ps.setInt(4, usuario.getTipoUsuario());
                    ps.setInt(5, usuario.getIDUsuario());
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
        String sql = "INSERT INTO tb_time(IDTime, Nome_Time, Estadio) VALUES (default, ?,?)";
        try(Connection conn = ConexaoDB.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, time.getNome_Time());
                ps.setString(2, time.getEstadio());
                ps.execute(); 
        }
    
    }
    
    public void atualizarTime(Time time) throws Exception{
        String sql = "UPDATE tb_time SET Nome_Time = ?, Estadio = ? WHERE IDTime = ?";
        try(Connection conn = ConexaoDB.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, time.getNome_Time());
                ps.setString(2, time.getEstadio());
                ps.setInt(3, time.getIDTime());
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
        String sql = "INSERT INTO tb_jogador(IDJogador, Nome_Jogador, Idade_Jogador, Posicao_jogador) VALUES (default, ?, ?, ?)";
        try(Connection conn = ConexaoDB.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, jogador.getNome_Jogador());
                ps.setInt(2, jogador.getIdade_Jogador());
                ps.setString(3, jogador.getPosicao_Jogador());
                ps.execute(); 
        }
    
    }
    
    public void atualizarJogador(Jogador jogador) throws Exception{
        String sql = "UPDATE tb_jogador SET Nome_Jogador = ?, Posicao_Jogador = ?, Idade_Jogador = ? WHERE IDJogador = ?";
        try(Connection conn = ConexaoDB.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, jogador.getNome_Jogador());
                ps.setString(2, jogador.getPosicao_Jogador());
                ps.setInt(3, jogador.getIdade_Jogador());
                ps.setInt(4, jogador.getIDJogador());
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
    
}
