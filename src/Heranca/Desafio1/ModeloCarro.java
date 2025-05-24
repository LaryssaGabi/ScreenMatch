package Heranca.Desafio1;

public class ModeloCarro extends Carro {
    private String motor;
    private boolean nitro;

    public boolean isNitro() {
        return nitro;
    }

    public void setNitro(boolean nitro) {
        this.nitro = nitro;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void ativarNitro() {
        if (nitro) {
            System.out.println("O carro está com nitro ativado! Desempenho máximo.");
        } else {
            System.out.println("O carro está sem nitro. Desempenho padrão.");
        }
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Motor: " + motor);
        System.out.println("Nitro: " + (nitro ? "Ativado" : "Desativado"));
    }
}