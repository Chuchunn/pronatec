/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Funcionario;
import banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Fornecedor {

    private static String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public boolean salvar(Funcionario funcionario) {

        try (Connection con = Conexao.get();) {

            String sql = "insert into Fornecedor(nome,cnpj,nomeContato,emailContato,telefoneContato,status) values(?,?,?,?,?,?)";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, funcionario.getNome());
            prep.setString(2, funcionario.getCnpj());
            prep.setString(3, funcionario.getNomeContato());
            prep.setString(4, funcionario.getEmailContato());
            prep.setString(5, funcionario.getTelefoneContato());
            prep.setString(6, funcionario.getStatus());

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
                    + "cnpj=?,"
                    + "nomeContato=? "
                    + "emailContato"
                    + "telefoneContato"
                    + "status"
                    + "where id =" + Fornecedor.getId();

            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, funcionario.getNome());
            prep.setString(2, funcionario.getCnpj());
            prep.setString(3, funcionario.getNomeContato());
            prep.setString(4, funcionario.getEmailContato());
            prep.setString(5, funcionario.getTelefoneContato());
            prep.setString(6, funcionario.getStatus());

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

                FuncionarioDao p = new FuncionarioDao();
                p.setId(result.getInt("id"));
                p.setNome(result.getString("nome"));
                p.setCargo(result.getString("cnpj"));
                p.setLogin(result.getString("nomeContato"));
                p.setSenha(result.getString("emailContato"));
                p.setSenha(result.getString("telefoneContato"));
                p.setSenha(result.getString("status"));

                list.add(p);
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        
        return list;
        
    }
}
