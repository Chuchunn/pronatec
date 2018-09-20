/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Funcionario;
import banco.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class FuncionarioDao {

    /**
     *
     * @param funcionario
     * @return
     */
    public boolean salvar(Funcionario funcionario) {

        try (Connection con = Conexao.get();) {

            String sql = "insert into Funcionario(nome,cargo,login,senha) values(?,?,?,?)";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, funcionario.getNome());
            prep.setString(3, funcionario.getCargo());
            prep.setString(4, funcionario.getLogin());
            prep.setString(5, funcionario.getSenha());

            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public boolean alterar(FuncionarioDao funcionario) {

        try (Connection con = Conexao.get();) {

            String sql = "update funcionario set "
                    + "nome=?,"
                    + "datanasc=?,"
                    + "cpf=? "
                    + "telefone"
                    + "email"
                    + "endereco"
                    + "where id =" + funcionario.getId();

            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, funcionario.getNome());
            prep.setString(3, funcionario.getCargo());
            prep.setString(4, funcionario.getLogin());
            prep.setString(5, funcionario.getSenha());

            prep.execute();
            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public boolean excluir(int id) {

        try (Connection con = Conexao.get();) {

            String sql = "delete from funcionario where id =" + id;

            PreparedStatement prep = con.prepareStatement(sql);
            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public List<FuncionarioDao> buscar() {

        List<FuncionarioDao> list = new ArrayList<>();
        
        try (Connection con = Conexao.get();) {

            String sql = "select * from pessoa";

            PreparedStatement prep = con.prepareStatement(sql);
            ResultSet result = prep.executeQuery();

            while (result.next()) {
/*private int id;
    private String nome;
    private String cargo;
    private String login;
    private String senha;*/
                FuncionarioDao p = new FuncionarioDao();
                p.setId(result.getInt("id"));
                p.setNome(result.getString("nome"));
                p.setCargo(result.getString("cargo"));
                p.setLogin(result.getString("login"));
                p.setSenha(result.getString("senha"));

                list.add(p);
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        
        return list;
        
    }

    private void values(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getCpf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getDatanasc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getTelefone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setNome(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCpf(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDatanasc(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTelefone(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setEmail(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setEndereco(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public Funcionario autenticacao(String login, String senha){
        
        Funcionario funcionario = null;
        try(Connection con = Conexao.get()){
        
            String sql = "SELECT * FROM funcionario"
                    + " WHERE login=? and senha=?";
            
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1,login);
            prep.setString(2, senha);
            
            ResultSet result = prep.executeQuery();
            
            if(result.first()){
                
                funcionario = new Funcionario();
                funcionario.setId(result.getInt("id"));
                funcionario.setNome(result.getString("nome"));
                funcionario.setLogin(login);
                funcionario.setSenha(senha);
                return funcionario;
                
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return funcionario;
        
    }  

    private String getCargo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getSenha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCargo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLogin(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSenha(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getTelefoneContato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getEmailContato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNomeContato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getCnpj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
   

