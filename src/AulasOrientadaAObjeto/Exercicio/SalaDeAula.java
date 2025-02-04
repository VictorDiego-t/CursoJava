package AulasOrientadaAObjeto.Exercicio;

public class SalaDeAula {

    private static int totalDeAlunos = 0;

    public static void adicionarAlunos(){
        totalDeAlunos++;
    }
    public static void exibirTotalDeAlunos(){
        System.out.println("Total de alunos na sala: "+ totalDeAlunos);
    }

}
