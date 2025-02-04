package AulasOrientadaAObjeto.Exercicio;

class Veiculos {
    void acelerar(){
        System.out.println("Acelerando Veiculo");
    }
}
class Carro extends Veiculos{
    @Override
    void acelerar(){
        System.out.println("Carro Acelerando");
        super.acelerar();
    }
}
public class Main{
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.acelerar();
    }
}

