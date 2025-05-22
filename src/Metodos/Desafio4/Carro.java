package Metodos.Desafio4;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void fichaTecnica() {
        System.out.println("O modelo do caroo é: " + modelo);
        System.out.println("O ano do carro é: " + ano);
        System.out.println("A cor do carro é: " + cor);
    }

    public int idade() {
        return 2025 - ano;
    }
}
