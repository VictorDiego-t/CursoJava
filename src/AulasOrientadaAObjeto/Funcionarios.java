package AulasOrientadaAObjeto;

public class Funcionarios {

    String nome;
    String cargo;
    String idade;

    public static void main(String[] args){

        Funcionarios funcionario = new Funcionarios();

        funcionario.nome = "Victor";
        funcionario.cargo = "Developer";
        funcionario.idade = "22";

        System.out.println("Nome = " + funcionario.nome);

        System.out.println("Cargo = " + funcionario.cargo);

        System.out.println("Idade = " + funcionario.idade);


    }

}
