package AulasOrientadaAObjeto.Exercicio;
import AulasOrientadaAObjeto.Exercicio.Pessoa;
public class Login {

    public static void main(String[] args) {
        Pessoa ps = new Pessoa("victor","vi223");

        if (ps.nome == "victor" && ps.senha == "vi223"){
            System.out.println("Autenticado");

        }else{
            System.out.println("Usuario Ou Senha Invalida");
        }


    }


}
