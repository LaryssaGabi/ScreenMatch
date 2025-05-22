package Metodos.Desafio3;

public class Pirncipal {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "2 Much";
        musica.artista = "Justin Bieber";
        musica.anoLancamento = 2021 ;


        musica.fichaTecnica();

        musica.fichaTecnicaAvaliacao(8);
        musica.fichaTecnicaAvaliacao(5.8);
        musica.fichaTecnicaAvaliacao(10);
        double media = musica.fichaTecnicaAvaliacaoMedia();
        System.out.println("Médiadas avaliações: " + media);
    }
}
