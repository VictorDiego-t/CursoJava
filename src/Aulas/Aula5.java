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

        //operadores lógicos
        // && || !
        // && é o operador E, retorna true se as duas condições forem verdadeiras
        // || é o operador OU, retorna true se pelo menos uma das condições for verdadeira
        // ! é o operador NÃO, inverte o valor da condição
        System.out.println(a > b && a < b); //saida false
        System.out.println(a > b || a < b); //saida true
        System.out.println(!(a > b)); //saida false

        //operadores de incremento e decremento
        // ++ --
        // ++ incrementa uma unidade
        // -- decrementa uma unidade
        System.out.println(a++); //saida 10
        System.out.println(a); //saida 11
        System.out.println(++a); //saida 12
        System.out.println(a--); //saida 12
        System.out.println(a); //saida 11
        System.out.println(--a); //saida 10

        //operadores de atribuição
        // = += -= *= /= %=
        // += incrementa o valor da variável
        // -= decrementa o valor da variável
        // *= multiplica o valor da variável
        // /= divide o valor da variável
        // %= retorna o resto da divisão
        a += 2;
        System.out.println(a); //saida 12
        a -= 2;
        System.out.println(a); //saida 10
        a *= 2;
        System.out.println(a); //saida 20
        a /= 2;
        System.out.println(a); //saida 10
        a %= 2;
        System.out.println(a); //saida 0

        //operador ternário
        // ? :
        // ? é o operador ternário, que é uma forma simplificada de if else
        // : é o separador de condições
        int c = 10;
        int d = 20;
        int e = c > d ? c : d;
        System.out.println(e); //saida 20

        //operador de concatenação
        // +
        // + é o operador de concatenação, que junta duas strings
        String f = "Olá";
        String g = "Mundo";
        System.out.println(f + " " + g); //saida Olá Mundo

        //operador de instanciação
        // new
        // new é o operador de instanciação, que cria um novo objeto
        Object h = new Object();
        System.out.println(h); //saida java.lang.Object@6d06d69c

        //operador de cast
        // (tipo)
        // (tipo) é o operador de cast, que converte um tipo de dado em outro
        double i = 10.5;
        int j = (int) i;
        System.out.println(j); //saida 10

        //operador de acesso
        // .
        // . é o operador de acesso, que acessa um atributo ou método de um objeto
        String k = "Olá Mundo";
        System.out.println(k.length()); //saida 9

        //operador de indexação
        // []
        // [] é o operador de indexação, que acessa um elemento de um array
        int[] l = {1, 2, 3, 4, 5};
        System.out.println(l[0]); //saida 1

    }
}
