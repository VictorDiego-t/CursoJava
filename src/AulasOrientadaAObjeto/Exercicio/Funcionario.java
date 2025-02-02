package AulasOrientadaAObjeto.Exercicio;

public class Funcionario {
    String nome;
    double salario;


    //Criação do objeto funcionario
    public Funcionario(String nomeInit,double salarioInit){
        nome = nomeInit;
        salario = salarioInit;
        System.out.println("Nome: "+ nome);
        System.out.println("Salario: "+ salario);
    }

}
