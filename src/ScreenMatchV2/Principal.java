package ScreenMatchV2;

import ScreenMatchV2.calculadora.CalculadoraDeTempo;
import ScreenMatchV2.modelos.Filme;
import ScreenMatchV2.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Sniper Americano");
        meuFilme.setAnoDeLancamento(2012);
        meuFilme.setDuracaoEmMinutos(144);

        System.out.println(meuFilme.getNome());
        System.out.println(meuFilme.getAnoDeLancamento());
        System.out.println(meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7.5);
        meuFilme.avalia(10);
        //System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaDasAvaliacoes());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(9);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração do título: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Velozes e Furioso: Desafio em Tóquio");
        outroFilme.setAnoDeLancamento(2007);
        outroFilme.setDuracaoEmMinutos(130);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}
