package movie.modelos;

import movie.modelos.calculos.CalculadoraDeTempo;
import movie.modelos.calculos.FiltroDeRecomendacao;
import movie.modelos.screenmatch.Episodio;
import movie.modelos.screenmatch.Filme;
import movie.modelos.screenmatch.Serie;

import java.io.FilterOutputStream;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Media das avaliações: " + meuFilme.pegaMedia());
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos() + " min");

        System.out.println("\n");
        System.out.println("------------------------------------");
        System.out.println("\n");

        Serie minhaSerie = new Serie();

        minhaSerie.setNome("Sobrenatural");
        minhaSerie.setAnoDeLancamento(2004);
        minhaSerie.setTemporadas(15);
        minhaSerie.setEpisodiosPorTemporada(25);
        minhaSerie.setMinutosPorEpisodio(45);

        minhaSerie.exibirFichaTecnica();

        System.out.println("Duração para maratonar Sobrenatural:  " + minhaSerie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());


        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
