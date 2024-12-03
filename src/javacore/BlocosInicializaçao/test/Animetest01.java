package javacore.BlocosInicializaçao.test;

import javacore.BlocosInicializaçao.domain.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Alyson");
        Anime anime2 = new Anime();



        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");

        }

    }

}
