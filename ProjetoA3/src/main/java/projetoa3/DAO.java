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
    
    public void CadastrarUsuario(Usuario usuario) throws Exception{
        String sql = "INSERT INTO tb_usuario(IDUsuario, Nome_Usuario, Senha_Usuario, CPF_Usuario, Tipo_Usuario) values(default, ?, ?, ?, 0)";
        try(Connection conn = ConexaoDB.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, usuario.getNomeUsuario());
                ps.setString(2, usuario.getSenhaUsuario());
                ps.setString(3, usuario.getCPFUsuario());
                ps.execute(); 
        }
    
    }
    
}
