package Exercicios;

public class Exercicio4 {
    public static void main(String [] args){
        int nivel = 5;
        switch (nivel){
            case 1 -> System.out.println("Muito insatisfeito");
            case 2 -> System.out.println("Insatisfeito");
            case 3 -> System.out.println("Neutro");
            case 4 -> System.out.println("Satisfeito");
            case 5 -> System.out.println("Muito satisfeito");
            default -> System.out.println("Desconhecido");
        }
    }
}
