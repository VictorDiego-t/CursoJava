package Exercicios;

public class Exercicio6 {
    public static void main(String[] args){
        String mes = "fevereiro";
        
        String diasm = switch (mes) {
            case "janeiro","março","maio","julho","agosto","outubro","dezembro" -> "31 dias";
            case "abril","junho","stembro","novembro" -> "30 dias";
            case "fevereiro" -> "o número de dias é 28 (considerando um ano não bissexto).";
            default -> "Mês desconhecido";
        };
        System.out.println(diasm);
    }
}
