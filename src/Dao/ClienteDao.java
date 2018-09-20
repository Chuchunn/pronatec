/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Cliente;
import banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aluno
 */
public class ClienteDao {
 /*       private int id;
    private String nome;
    private Date datanasc;
    private int cpf;
    private int telefone;
    private String email;
    private String endereco;
*/
    public boolean salvar(Cliente cliente) {

        try (Connection con = Conexao.get();) {

            String sql = "insert into Cliente(nome,datanasc,cpf,telefone, email, endereco) values(?,?,?,?,?,?)";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, cliente.getNome());
            prep.setDate(2, new java.sql.Date(cliente.getDatanasc().getTime()));
            prep.setInt(3, cliente.getCpf());
            prep.setInt(4, cliente.getTelefone());
            prep.setString(5, cliente.getEmail());
            prep.setString(6, cliente.getEndereco());

            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public boolean alterar(Cliente cliente) {
/*       private int id;
    private String nome;
    private Date datanasc;
    private int cpf;
    private int telefone;
    private String email;
    private String endereco;
*/
        try (Connection con = Conexao.get();) {

            String sql = "update cliente set "
                    + "nome=?,"
                    + "datanasc=?,"
                    + "cpf=? "
                    + "telefone"
                    + "email"
                    + "endereco"
                    + "where id =" + cliente.getId();

            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, cliente.getNome());
            prep.setDate(2, new java.sql.Date(cliente.getDatanasc().getTime()));
            prep.setInt(3, cliente.getCpf());
            prep.setInt(4, cliente.getTelefone());
            prep.setString(5, cliente.getEmail());
            prep.setString(6, cliente.getEndereco());

            prep.execute();
            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public boolean excluir(int id) {

        try (Connection con = Conexao.get();) {

            String sql = "delete from cliente where id =" + id;

            PreparedStatement prep = con.prepareStatement(sql);
            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public List<Cliente> buscar() {

        List<Cliente> list = new ArrayList<>();
        
        try (Connection con = Conexao.get();) {

            String sql = "select * from pessoa";

            PreparedStatement prep = con.prepareStatement(sql);
            ResultSet result = prep.executeQuery();

            while (result.next()) {
/*       private int id;
    private String nome;
    private Date datanasc;
    private int cpf;
    private int telefone;
    private String email;
    private String endereco;
*/
                Cliente p = new Cliente();
                p.setId(result.getInt("id"));
                p.setNome(result.getString("nome"));
                p.setDatanasc(result.getDate("datanasc"));
                p.setCpf(result.getInt("cpf"));
                p.setTelefone(result.getInt("telefone"));
                p.setEmail(result.getString("email"));
                p.setEndereco(result.getString("endereco"));

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

}


