package Dao;

import Modelo.Funcionario;
import banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class LoginDao {
    
    public Funcionario autenticacao(String login, String senha){
        
        Funcionario logindao = null;
                try(Connection con = Conexao.get()){
            String sql = "SELECT * FROM usuario"+ " WHERE login=? and senha=?";
            PreparedStatement prep = con.prepareStatement(sql);
                   prep.setString(1,login);
                   prep.setString(2,senha);
                  
                   ResultSet result = prep.executeQuery();
                   if(result.first()){
                       logindao = new Funcionario();
                       logindao.setId(result.getInt("id"));
                       logindao.setNome(result.getString("nome"));
                       logindao.setCargo(result.getString("cargo"));
                       logindao.setLogin(login);
                       logindao.setSenha(senha);
                       
                       return logindao;
                   }
                   
        }catch(Exception e){
            e.printStackTrace();
        }

        return logindao;
    }
    
}
