package Heranca.Desafio1;

public class Pincipal {
    public static void main(String[] args) {
        ModeloCarro modeloCarro = new ModeloCarro();

        System.out.println("\n");
        System.out.println("------------ Carro dos Sonhos ------------");
        modeloCarro.definirModelo("Posher");
        modeloCarro.definirPreco(580.595, 953.786, 852.456);
        modeloCarro.setNitro(true);
        modeloCarro.setMotor("v8");
        modeloCarro.exibirInfo();



    }
}