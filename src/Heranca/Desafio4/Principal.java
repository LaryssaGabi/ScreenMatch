package Heranca.Desafio4;

public class Principal {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);
        verificador.verificarSeEhPrimo(18);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximo = gerador.gerarProximoPrimo(23);
        System.out.println("Próximo primo depois de 23: " + proximo);

        System.out.println();
        gerador.listarPrimos(30);
    }
}
