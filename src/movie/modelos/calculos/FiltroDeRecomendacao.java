package movie.modelos.calculos;

public class FiltroDeRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entreos preferidos do momento");
        }else if (classificavel.getClassificacao()>=2){
            System.out.println("Muito avaliado no momento");
        }else {
            System.out.println("Coloca na sua lista para asisstir deposis");
        }
    }
}
