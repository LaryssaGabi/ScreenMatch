package Encapsular.Desafio1;

public class Principa {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(159963);
        conta.setSaldo(2000);
        conta.titular= "Laryssa";

        System.out.println("O número da conta: " + conta.getNumeroConta());
        System.out.println("O saldo em conta: " + conta.getSaldo());
        System.out.println("O nome do tituçar: " + conta.titular);

    }
}
