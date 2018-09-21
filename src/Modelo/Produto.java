package Modelo;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private String precoCusto;
    private String unidade;
    private double porcentageLucro;
    private double precoVenda;
    private double quantidadeEstoque;
    private int idFornecedor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public double getPorcentageLucro() {
        return porcentageLucro;
    }

    public void setPorcentageLucro(double porcentageLucro) {
        this.porcentageLucro = porcentageLucro;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public double QuantidadeEstoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int IdFornecedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
