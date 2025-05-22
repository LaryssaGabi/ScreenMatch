package Metodos.Desafio3;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    double quantidadeDeAvaliacoes;

    void fichaTecnica() {
        System.out.println("O nome da mísica é: " + titulo);
        System.out.println("O nome do artista é: " + artista);
        System.out.println("O ano de lançamento é: " + anoLancamento);

    }

    void fichaTecnicaAvaliacao(double nota){
        avaliacao += nota;
        quantidadeDeAvaliacoes++;
    }

    double fichaTecnicaAvaliacaoMedia(){
        return avaliacao/ quantidadeDeAvaliacoes;
    }
}
