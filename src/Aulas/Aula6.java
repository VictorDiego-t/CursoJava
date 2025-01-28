package Aulas;

public class Aula6 {
    public static void main(String[] args){
        //instruções condicionais

        //if else
        int a = 10;
        if (a > 5){
            System.out.println("a é maior que 5");
        } else {
            System.out.println("a é menor ou igual a 5");
        }

        //instanceof
        String s = "Olá Mundo";
        if (s instanceof String){
            System.out.println("s é uma instância de String");
        } else {
            System.out.println("s não é uma instância de String");
        }

        //switch case dias da semana segunda terça
        int dia = 4;
        switch (dia){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido");
        }

    }
}
