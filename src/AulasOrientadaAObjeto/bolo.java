package AulasOrientadaAObjeto;

public class bolo {

    //Variáveis
    int quantidadeDeAcucar;


    public static void main(String[] args){

        bolo boloDeChocolate = new bolo();
        boloDeChocolate.quantidadeDeAcucar = 200;

        bolo boloDeBaunilha = new bolo();
        boloDeBaunilha.quantidadeDeAcucar = 150;

        System.out.println("Quantidade de açucar no bolo de choclate é: " + boloDeChocolate.quantidadeDeAcucar);
        System.out.println("Quantidade de açucar no bolo de choclate é: " + boloDeBaunilha.quantidadeDeAcucar);



    }
}
