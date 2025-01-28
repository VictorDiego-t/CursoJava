package Aulas;

public class Aula3 {
    public static void main(String[] args) {

        // Uso do var só foi implementado a partir do Java 10
        //Obrigatório declarar um valor não pode ser nulo

        var numero = 10; // inference int
        // var usuario = new Usuario(); // inference Usuário
        System.out.println("Valor do numero é: " + numero); // Funciona sem declarar o tipo resulta 10.
    }
}
