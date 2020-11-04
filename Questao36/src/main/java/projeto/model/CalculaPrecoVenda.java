package projeto.model;

public class CalculaPrecoVenda implements CalculaPreco{

    @Override
    public double calculaPrecoVenda(Produto produto) {
        produto.precoVenda = produto.precoCustoProduto + (0.4 * produto.precoCustoProduto);
        return produto.precoVenda;
    }
}
