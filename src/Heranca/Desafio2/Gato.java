package Heranca.Desafio2;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O gato faz o som: Miau miau miau...");
    }

    public void arranharMoveis(){
        System.out.println("O gato arranha o movel para brinca");
    }
}
