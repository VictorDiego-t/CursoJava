package AulasOrientadaAObjeto.Exercicio;
import AulasOrientadaAObjeto.Exercicio.Produto;
public class CadastrarProduto {

    public static void main(String[] args) {
        Produto produto = new Produto("Relogio", 100, 10){
        };
        System.out.println(produto.obterProduto());
    }
}
