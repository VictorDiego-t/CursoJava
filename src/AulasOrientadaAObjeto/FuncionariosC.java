package AulasOrientadaAObjeto;

public class FuncionariosC {

    String nome;
    String cargo;
    int idade;

    FuncionariosC(String nome, String cargo, int idade){
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        
    }


    public static void main(String[] args) {

        //Criação do Funcionario 1
        FuncionariosC funcionario1 = new FuncionariosC("Victor","Developer",30);

        System.out.println("Nome = " + funcionario1.nome);
        System.out.println("Cargo = " + funcionario1.cargo);
        System.out.println("Idade = " + funcionario1.idade);

    }


}
