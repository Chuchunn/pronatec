package Modelo;

public class itensVenda {
    private int id;
    private double quantidade;
    private double precoUnidade;
    private double descontoUNdiade;
    private double precoComDesconto;
    private int idVenda;
    private int idProduto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(double precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public double getDescontoUNdiade() {
        return descontoUNdiade;
    }

    public void setDescontoUNdiade(double descontoUNdiade) {
        this.descontoUNdiade = descontoUNdiade;
    }

    public double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public void setPrecoComDesconto(double precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    
}
