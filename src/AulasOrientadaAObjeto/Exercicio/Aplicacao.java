package AulasOrientadaAObjeto.Exercicio;
import AulasOrientadaAObjeto.Exercicio.Livro;
public class Aplicacao {

    public static void main(String[] args) {
        // Testando o construtor padrão
        Livro livro1 = new Livro();
        System.out.println("Livro 1 -> Título: " + livro1.titulo + ", Autor: " + livro1.getAutor() +
                ", Ano: " + livro1.anoPublicacao + ", Preço: " + livro1.preco);

        // Testando o construtor com dois parâmetros
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien");
        System.out.println("Livro 2 -> Título: " + livro2.titulo + ", Autor: " + livro2.getAutor() +
                ", Ano: " + livro2.anoPublicacao + ", Preço: " + livro2.preco);

        // Testando o construtor com quatro parâmetros
        Livro livro3 = new Livro("1984", "George Orwell", 1949, 45.90);
        System.out.println("Livro 3 -> Título: " + livro3.titulo + ", Autor: " + livro3.getAutor() +
                ", Ano: " + livro3.anoPublicacao + ", Preço: " + livro3.preco);
    }
}
