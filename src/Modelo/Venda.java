package Modelo;

import java.util.Date;

public class Venda {
    private int id;
    private Date dataVenda;
    private double precoTotal;
    private double desconto;
    private double precoTotalComDesconto;
    private int idFuncionario;
    private int idCliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoTotalComDesconto() {
        return precoTotalComDesconto;
    }

    public void setPrecoTotalComDesconto(double precoTotalComDesconto) {
        this.precoTotalComDesconto = precoTotalComDesconto;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
