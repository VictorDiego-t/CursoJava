package AulasOrientadaAObjeto.Exercicio;

public class Carros {

    //Variáveis

    String modelo;
    String marca;
    int ano;

    public Carros() {
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
        this.ano = 0;
    }
    public Carros(String marca, String modelo, int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;

    }
    public Carros(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    // Método para exibir os detalhes do carro
    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }


    public static void main(String[] args) {

        Carros carro3 = new Carros("Honda", "Civic", 2020);
        System.out.println(carro3);
        carro3.exibirDetalhes();


    }
}
