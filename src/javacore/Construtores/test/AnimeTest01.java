package javacore.Construtores.test;


import javacore.Construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto","TV", 12, "Ação", "Disney");
      //anime.init("Naruto","TV",12);
      // anime.init("Narauto 2" ,"TV", 12, "Ação" );

        anime.imprime();



    }
}
