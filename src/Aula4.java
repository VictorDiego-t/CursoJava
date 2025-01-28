public class Aula4 {
    public static void main(String[] args) {
        // Exemplo de Identificadores Válidos:

        // Um identificador pode conter letras (a-z ou A-Z).
        String nome = "João"; // Válido: começa com uma letra.
        System.out.println("Nome: " + nome);

        // Um identificador pode conter dígitos, mas não pode começar com eles.
        int idade = 25; // Válido: começa com uma letra e contém números.
        System.out.println("Idade: " + idade);

        // Identificadores podem usar sublinhados (_).
        double salario_anual = 45000.50; // Válido: contém sublinhado.
        System.out.println("Salário Anual: " + salario_anual);

        // Identificadores podem começar com cifrões ($).
        String $id = "123ABC"; // Válido: começa com $.
        System.out.println("ID: " + $id);

        // Identificadores podem começar com sublinhados (_).
        int _temp = 10; // Válido: começa com sublinhado.
        System.out.println("Temp: " + _temp);

        // Exemplo de Identificadores Inválidos:

        // int 123abc = 10; // Inválido: começa com um dígito.
        // int a-b = 5; // Inválido: contém o caractere '-' (hífen).
        // int class = 10; // Inválido: 'class' é uma palavra reservada.

        // Comentários explicam os erros dos identificadores acima:
        // 1. Não pode começar com um número (exemplo: 123abc).
        // 2. Não pode conter caracteres especiais como hífen (exemplo: a-b).
        // 3. Não pode usar palavras reservadas do Java (exemplo: class).
    }
}
