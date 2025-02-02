package AulasOrientadaAObjeto.Exercicio;

public class Produto {

    private String nome;
    private int preco;
    private int quantidadeEmEstoque;

    public Produto(String nomeInit, int precoInit, int QuantidadeEmEstoqueInit){
        nome = nomeInit;
        preco = precoInit;
        quantidadeEmEstoque = QuantidadeEmEstoqueInit;
    }

    public String obterProduto(){
        return "Produto: "+ nome + " Preço: " + preco + " R$" + " Estoque: " + quantidadeEmEstoque;
    }

}
