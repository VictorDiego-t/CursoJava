package Aulas;

public class Aula5 {
    public static void main(String[] args){
        //operadores aritméticos
        // + - * / %
        // % é o operador de módulo, que retorna o resto da divisão

        int a = 10;
        int b = 2;

        System.out.println(a + b); //soma saida 12
        System.out.println(a - b); //subtração saida 8
        System.out.println(a * b); //multiplicação saida 20
        System.out.println(a / b); //divisão saida 5
        System.out.println(a % b); //resto da divisão saida 0

        //operadores de comparação
        // == != > < >= <=
        System.out.println(a == b); //igualdade saida false
        System.out.println(a != b); //diferença saida true
        System.out.println(a > b); //maior que saida true
        System.out.println(a < b); //menor que saida false
        System.out.println(a >= b); //maior ou igual saida true
        System.out.println(a <= b); //menor ou igual saida false

    }
}
