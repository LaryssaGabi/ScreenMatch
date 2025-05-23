package Heranca.Desafio3;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("O valor do deposito foi de: " + valor);
        System.out.println("O saldo atual é de: " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
