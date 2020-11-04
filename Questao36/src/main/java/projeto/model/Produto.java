package projeto.model;

public class Produto {
    protected String nomeProduto;
    protected String tipoProduto;
    protected int qtdMinima;
    protected double precoCustoProduto;
    protected double precoVenda;
    protected double precoDesconto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public double getPrecoCustoProduto() {
        return precoCustoProduto;
    }

    public void setPrecoCustoProduto(double precoCustoProduto) {
        this.precoCustoProduto = precoCustoProduto;
    }
    
    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoDesconto() {
        return precoDesconto;
    }

    public void setPrecoDesconto(double precoDesconto) {
        this.precoDesconto = precoDesconto;
    }
    
}
