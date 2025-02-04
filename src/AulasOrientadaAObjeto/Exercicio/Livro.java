package AulasOrientadaAObjeto.Exercicio;

public class Livro {
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    double preco;

    //Construtor Padrão
    public Livro(){
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }
    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    //Getter para acessar o autor privado
    public String getAutor(){
        return autor;
    }

    // Setter para modificar o atributo privado autor
    public void setAutor(String autor) {
        this.autor = autor;
    }




}
