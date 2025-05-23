package Heranca.Desafio2;

public class Principal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.emitirSom();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        System.out.println("\n");

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();
    }
}
