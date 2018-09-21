/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

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
public class ItensVendaDao {
 
    public boolean salvar(ItensVendaDao itensvenda) {

        try (Connection con = Conexao.get();) {

            String sql = "insert into ItensVenda(quantidade,precoUnidade,descontoUnidade,precoComDesconto,idVenda,idProduto) values(?,?,?,?,?,?)";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setDouble(1, itensvenda.getQuantidade());
            prep.setDouble(2, itensvenda.getPrecoUnidade());
            prep.setDouble(3, itensvenda.getDescontoUnidade());
            prep.setDouble(4, itensvenda.getPrecoComDesconto());
            prep.setInt(5, itensvenda.getIdVenda());
            prep.setInt(6, itensvenda.getIdProduto());
            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    /**
     *
     * @param itensvenda
     * @return
     */
    public boolean alterar(ItensVendaDao itensvenda) {

        try (Connection con = Conexao.get();) {

            String sql = "update itensvenda set "
                    + "quantidade=?,"
                    + "precoUnidade=?,"
                    + "descontoUnidade=? "
                    + "precoComDesconto"
                    + "idVenda"
                    + "idProduto"
                    + "where id =" + itensvenda.getId();

            PreparedStatement prep = con.prepareStatement(sql);
            prep.setDouble(1, itensvenda.getQuantidade());
            prep.setDouble(2, itensvenda.getPrecoUnidade());
            prep.setDouble(3, itensvenda.getDescontoUnidade());
            prep.setDouble(4, itensvenda.getPrecoComDesconto());
            prep.setInt(5, itensvenda.getIdVenda());
            prep.setInt(6, itensvenda.getIdProduto());

            prep.execute();
            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public boolean excluir(int id) {

        try (Connection con = Conexao.get();) {

            String sql = "delete from itensvenda where id =" + id;

            PreparedStatement prep = con.prepareStatement(sql);
            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public List<ItensVendaDao> buscar() {

        List<ItensVendaDao> list = new ArrayList<>();
        
        try (Connection con = Conexao.get();) {

            String sql = "select * from pessoa";

            PreparedStatement prep = con.prepareStatement(sql);
            ResultSet result = prep.executeQuery();

            while (result.next()) {
        /*    private int id;
    private double quantidade;
    private double precoUnidade;
    private double descontoUndiade;
    private double precoComDesconto;
    private int idVenda;
    private int idProduto;*/
                ItensVendaDao p = new ItensVendaDao();
                p.setId(result.getInt("id"));
                p.setQuantidade(result.getString("quantidade"));
                p.setPrecoUnidade(result.getString("precoUnidade"));
                p.setDescontoUnidade(result.getString("descontoUnidade"));
                p.setPrecoComDesconto(result.getString("precoComDesconto"));
                p.setIdVenda(result.getString("idVenda"));
                p.setIdProduto(result.getString("idProduto"));

                list.add(p);
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        
        return list;
        
    }

    private int getIdProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getIdVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getPrecoComDesconto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getDescontoUnidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getPrecoUnidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getQuantidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setQuantidade(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPrecoUnidade(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDescontoUnidade(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPrecoComDesconto(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setIdVenda(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setIdProduto(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
