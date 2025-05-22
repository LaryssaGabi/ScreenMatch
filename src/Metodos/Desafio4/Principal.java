package Metodos.Desafio4;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Fiat";
        carro.cor = "Cinza";
        carro.ano = 2019;

        carro.fichaTecnica();
        System.out.println("A idade do carro é: " + carro.idade());

    }
}
