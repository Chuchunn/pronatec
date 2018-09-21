/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

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
public class VendaDao {
     public boolean salvar(VendaDao venda) {

        try (Connection con = Conexao.get();) {
/*       private int id;
    private Date dataVenda;
    private double precoTotal;
    private double desconto;
    private double precoTotalComDesconto;
    private int idFuncionario;
    private int idCliente;
*/
            String sql = "insert into ItensVenda(quantidade,precoUnidade,descontoUnidade,precoComDesconto,idVenda,idProduto) values(?,?,?,?,?,?)";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setDate(1, venda.getDataVenda());
            prep.setDouble(2, venda.getPrecoTotal());
            prep.setDouble(3, venda.getDesconto());
            prep.setDouble(4, venda.getPrecoTotalComDesconto());
            prep.setInt(5, venda.getidFuncionario());
            prep.setInt(6, venda.getidCliente());
            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    /**
     *
     * @param venda
     * @return
     */
    public boolean alterar(VendaDao venda) {

        try (Connection con = Conexao.get();) {

            String sql = "update venda set "
                    + "dataVenda=?,"
                    + "precoTotal=?,"
                    + "desconto=? "
                    + "precoTotalComDesconto"
                    + "idFuncionario"
                    + "idCliente"
                    + "where id =" + venda.getId();
/*       private int id;
    private Date dataVenda;
    private double precoTotal;
    private double desconto;
    private double precoTotalComDesconto;
    private int idFuncionario;
    private int idCliente;
*/

          PreparedStatement prep = con.prepareStatement(sql);
            prep.setDate(1, venda.getDataVenda());
            prep.setDouble(2, venda.getPrecoTotal());
            prep.setDouble(3, venda.getDesconto());
            prep.setDouble(4, venda.getPrecoTotalComDesconto());
            prep.setInt(5, venda.getidFuncionario());
            prep.setInt(6, venda.getidCliente());
            prep.execute();


            prep.execute();
            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public boolean excluir(int id) {

        try (Connection con = Conexao.get();) {

            String sql = "delete from venda where id =" + id;

            PreparedStatement prep = con.prepareStatement(sql);
            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public List<VendaDao> buscar() {

        List<VendaDao> list = new ArrayList<>();
        
        try (Connection con = Conexao.get();) {

            String sql = "select * from pessoa";

            PreparedStatement prep = con.prepareStatement(sql);
            ResultSet result = prep.executeQuery();

            while (result.next()) {
/*       private int id;
    private Date dataVenda;
    private double precoTotal;
    private double desconto;
    private double precoTotalComDesconto;
    private int idFuncionario;
    private int idCliente;
*/
                VendaDao p = new VendaDao();
                p.setId(result.getInt("id"));
                p.setDataVenda(result.getString("dataVenda"));
                p.setPrecoTotal(result.getString("precoTotal"));
                p.setDesconto(result.getString("desconto"));
                p.setPrecoTotalComDesconto(result.getString("precoTotalComDesconto"));
                p.setIdFuncionario(result.getString("idFuncionario"));
                p.setIdCliente(result.getString("idCliente"));

                list.add(p);
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        
        return list;
        
    }

    private int getidCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getidFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getPrecoTotalComDesconto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getDesconto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getPrecoTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Date getDataVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setIdCliente(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setIdFuncionario(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPrecoTotalComDesconto(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDesconto(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPrecoTotal(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDataVenda(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
