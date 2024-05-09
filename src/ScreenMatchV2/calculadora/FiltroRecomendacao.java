package ScreenMatchV2.calculadora;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            recomendacao = "Recomendado";
        } else {
            recomendacao = "Não recomendado";
        }
    }
}
