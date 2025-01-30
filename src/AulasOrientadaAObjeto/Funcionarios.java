package AulasOrientadaAObjeto;

public class Funcionarios {

    String nome;
    String cargo;
    String idade;

    public static void main(String[] args){

        //Criação do Funcionario 1
        Funcionarios funcionario1 = new Funcionarios();

        funcionario1.nome = "Victor";
        funcionario1.cargo = "Developer";
        funcionario1.idade = "22";

        System.out.println("Nome = " + funcionario1.nome);
        System.out.println("Cargo = " + funcionario1.cargo);
        System.out.println("Idade = " + funcionario1.idade);

        System.out.println(); // Pula linha

        //Criação do Funcionario2

        Funcionarios funcionario2 = new Funcionarios();

        funcionario2.nome = "Diogo";
        funcionario2.cargo = "P&D";
        funcionario2.idade = "21";

        System.out.println("Nome = " + funcionario2.nome);
        System.out.println("Cargo = " + funcionario2.cargo);
        System.out.println("Idade = " + funcionario2.idade);


    }

}
