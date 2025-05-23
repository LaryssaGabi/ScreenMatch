package Heranca.Desafio2;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz o som: AU AU AU...");
    }

    public void abanarRabo(){
        System.out.println("O cachorro abana o rabo quando esta feliz");
    }
}
