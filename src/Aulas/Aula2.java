package Aulas;

public class Aula2 {
    public static void main(String[] args) {
        // Exemplo 1: Promoção de byte para int
        // Variável 'numByte' é do tipo byte, que suporta valores de -128 a 127.
        byte numByte = 10;
        // Durante a operação, 'numByte' é promovido para int antes do cálculo.
        int resultadoInt = numByte + 5;
        System.out.println("Resultado (byte -> int): " + resultadoInt);

        // Exemplo 2: Promoção de int para long
        // Variável 'numInt' é do tipo int, que suporta valores maiores que byte/short.
        int numInt = 20;
        // Variável 'numLong' é do tipo long, que suporta números muito grandes.
        long numLong = 15L; // O sufixo 'L' indica que o número é long.
        // Durante a operação, 'numInt' é promovido para long antes do cálculo.
        long resultadoLong = numInt + numLong;
        System.out.println("Resultado (int -> long): " + resultadoLong);

        // Exemplo 3: Promoção de int para float
        // Variável 'numInt2' é do tipo int.
        int numInt2 = 30;
        // Variável 'numFloat' é do tipo float, usada para números decimais com precisão simples.
        float numFloat = 2.5f; // O sufixo 'f' indica que o número é float.
        // Durante a operação, 'numInt2' é promovido para float antes do cálculo.
        float resultadoFloat = numInt2 * numFloat;
        System.out.println("Resultado (int -> float): " + resultadoFloat);

        // Exemplo 4: Promoção de int para double
        // Variável 'numInt3' é do tipo int.
        int numInt3 = 40;
        // Variável 'numDouble' é do tipo double, usada para números decimais com maior precisão.
        double numDouble = 3.5;
        // Durante a operação, 'numInt3' é promovido para double antes do cálculo.
        double resultadoDouble = numInt3 / numDouble;
        System.out.println("Resultado (int -> double): " + resultadoDouble);
    }
}
