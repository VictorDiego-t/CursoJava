package Aulas;

public class Aula1 {
    public static void main(String[] args) {
        // Declaração de uma variável do tipo byte para armazenar a idade.
        // O tipo byte suporta valores de -128 a 127, ideal para números pequenos.
        byte idade = 25;

        // Declaração de uma variável do tipo short para armazenar o ano.
        // O tipo short suporta valores de -32.768 a 32.767, suficiente para o ano atual.
        short ano = 2024;

        // Declaração de uma variável do tipo int para a população de uma cidade.
        // O tipo int suporta valores maiores, até aproximadamente 2 bilhões.
        int populacaoCidade = 500000;

        // Declaração de uma variável do tipo long para armazenar a população mundial.
        // O tipo long é usado para valores muito grandes, maior que o limite do int.
        // O sufixo 'L' indica que o valor literal é do tipo long.
        long populacaoMundial = 7800000000L;

        // Declaração de uma variável do tipo float para armazenar a altura.
        // O tipo float é usado para números decimais de menor precisão.
        // O sufixo 'f' indica que o valor literal é do tipo float.
        float altura = 1.75f;

        // Declaração de uma variável do tipo double para armazenar o salário.
        // O tipo double é usado para números decimais com maior precisão.
        double salario = 4500.50;

        // Declaração de uma variável do tipo boolean para indicar se é estudante.
        // O tipo boolean só pode assumir os valores true (verdadeiro) ou false (falso).
        boolean estudante = true;

        // Declaração de uma variável do tipo char para armazenar a inicial do nome.
        // O tipo char armazena um único caractere, delimitado por aspas simples.
        char inicialNome = 'A';

        // Impressão da idade no console.
        System.out.println("Idade: " + idade);

        // Impressão do ano no console.
        System.out.println("Ano: " + ano);

        // Impressão da população da cidade no console.
        System.out.println("População da cidade: " + populacaoCidade);

        // Impressão da população mundial no console.
        System.out.println("População mundial: " + populacaoMundial);

        // Impressão da altura no console.
        System.out.println("Altura: " + altura);

        // Impressão do salário no console.
        System.out.println("Salário: " + salario);

        // Impressão do status de estudante no console.
        System.out.println("É estudante? " + estudante);

        // Impressão da inicial do nome no console.
        System.out.println("Inicial do nome: " + inicialNome);
    }
}
