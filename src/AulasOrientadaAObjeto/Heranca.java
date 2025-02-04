package AulasOrientadaAObjeto;

class Animal{
    public void comer(){
        System.out.println("O Animal Come.");
    }
}

class Cachorro extends Animal{
    public void latir(){
        System.out.println("O Cachorro Late");
    }
}

public class Heranca {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.latir();
        dog.comer();
    }

}
