package Heranca.Desafio3;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.depositar(1000);
        contaBancaria.consultarSaldo();
        contaBancaria.sacar(200);
        contaBancaria.consultarSaldo();

        System.out.println("\n");

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();
    }
}
