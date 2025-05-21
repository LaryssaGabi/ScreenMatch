public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasValiacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinutos + "min");
    }

    void avalia(double nota) {
        somaDasValiacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasValiacoes / totalDeAvaliacoes;
    }
}
