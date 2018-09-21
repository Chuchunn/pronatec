/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Produto;
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
public class ProdutoDao {

    private static String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public boolean salvar(Produto produto) {

        try (Connection con = Conexao.get();) {

            String sql = "insert into Fornecedor(nome,descricao,precoCusto,unidade,porcentagemLucro,precoVenda,quantidadeEstoque,idFornecedor) values(?,?,?,?,?,?,?,?)";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, produto.getNome());
            prep.setString(2, produto.getDescricao());
            prep.setString(3, produto.getPrecoCusto());
            prep.setString(4, produto.getUnidade());
            prep.setDouble(5, produto.getPorcentageLucro());
            prep.setDouble(6, produto.getPrecoVenda());
            prep.setDouble(7, produto.QuantidadeEstoque());
            prep.setInt(8, produto.IdFornecedor());

            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public boolean alterar(ProdutoDao produto) {

        try (Connection con = Conexao.get();) {

            String sql = "update produto set "
                    + "nome=?,"
                    + "descricao=?,"
                    + "precoCusto=? "
                    + "unidade"
                    + "porcentageLucro"
                    + "precoVenda"
                    + "quantidadeEstoque"
                    + "idFornecedor"
                   + "where id =" + ProdutoDao.getId();
    /*    private int id;
    private String nome;
    private String descricao;
    private String precoCusto;
    private String unidade;
    private double porcentageLucro;
    private double precoVenda;
    private double quantidadeEstoque;
    private int idFornecedor;*/
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, produto.getNome());
            prep.setString(2, produto.getDescricao());
            prep.setString(3, produto.getPrecoCusto());
            prep.setString(4, produto.getUnidade());
            prep.setDouble(5, produto.getPorcentageLucro());
            prep.setDouble(6, produto.getPrecoVenda());
            prep.setDouble(7, produto.QuantidadeEstoque());
            prep.setInt(8, produto.IdFornecedor());
            prep.execute();
            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public boolean excluir(int id) {

        try (Connection con = Conexao.get();) {

            String sql = "delete from produto where id =" + id;

            PreparedStatement prep = con.prepareStatement(sql);
            prep.execute();

            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }

    }

    public List<ProdutoDao> buscar() {

        List<ProdutoDao> list = new ArrayList<>();
        
        try (Connection con = Conexao.get();) {

            String sql = "select * from pessoa";

            PreparedStatement prep = con.prepareStatement(sql);
            ResultSet result = prep.executeQuery();

            while (result.next()) {
    /*    private int id;
    private String nome;
    private String descricao;
    private String precoCusto;
    private String unidade;
    private double porcentageLucro;
    private double precoVenda;
    private double quantidadeEstoque;
    private int idFornecedor;*/
                ProdutoDao p = new ProdutoDao();
                p.setId(result.getInt("id"));
                p.setNome(result.getString("nome"));
                p.setDescricao(result.getString("descricao"));
                p.setPrecoCusto(result.getString("PrecoCustoo"));
                p.setUnidade(result.getString("Unidade"));
                p.setPorcentageLucro(result.getString("PorcentageLucro"));
                p.setPrecoVenda(result.getString("PrecoVenda"));
                p.setQuantidadeEstoque(result.getString("QuantidadeEstoque"));
                p.setIdFornecedor(result.getString("IdFornecedor"));

                list.add(p);
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        
        return list;
        
    }

    private int IdFornecedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double QuantidadeEstoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getPrecoVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getPorcentageLucro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getUnidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getPrecoCusto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getDescricao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setIdFornecedor(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setQuantidadeEstoque(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPrecoVenda(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPorcentageLucro(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setUnidade(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPrecoCusto(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDescricao(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setNome(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


