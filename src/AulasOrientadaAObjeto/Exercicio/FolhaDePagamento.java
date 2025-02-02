package AulasOrientadaAObjeto.Exercicio;
import AulasOrientadaAObjeto.Exercicio.*;


public class FolhaDePagamento {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Victor",5000.00);
        System.out.println(funcionario.obterInfo());
        funcionario.aumentarSalario(3000.00);
        System.out.println(funcionario.obterInfo());

    }
}
