package AulasOrientadaAObjeto;

public class SobrecargaConstrutor {
    String nome;
    String cargo;
    int idade;

    SobrecargaConstrutor(String nome, String cargo, int idade){
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;

    }
    SobrecargaConstrutor(){}

    public static void main(String[] args) {

                            //Exemplo de erro
//        //Criação do Funcionario 1
//        SobrecargaConstrutor funcionario1 = new SobrecargaConstrutor();
//
//        funcionario1.nome = "victor";
//
//        System.out.println("Nome = " + funcionario1.nome);
//        System.out.println("Cargo = " + funcionario1.cargo);
//        System.out.println("Idade = " + funcionario1.idade);

                            //Correção adicionar
                            // SobrecargaConstrutor(){} no começo para ser o default

        SobrecargaConstrutor funcionario1 = new SobrecargaConstrutor();

        funcionario1.nome = "victor";

        System.out.println("Nome = " + funcionario1.nome);
        System.out.println("Cargo = " + funcionario1.cargo);
        System.out.println("Idade = " + funcionario1.idade);

    }




}
