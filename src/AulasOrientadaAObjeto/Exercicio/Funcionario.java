package AulasOrientadaAObjeto.Exercicio;

public class Funcionario {

    private String nome;
    private double salario;


    //Criação do objeto funcionario
    public Funcionario(String nomeInit,double salarioInit){
        nome = nomeInit;
        salario = salarioInit;
    }

    public String obterInfo(){
        return "Nome: " + nome + " Salario: " + salario;
    }


}
