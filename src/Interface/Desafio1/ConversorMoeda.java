package Interface.Desafio1;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDoalar = 5.90;
        double valorReal = valorDolar * cotacaoDoalar;

        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
