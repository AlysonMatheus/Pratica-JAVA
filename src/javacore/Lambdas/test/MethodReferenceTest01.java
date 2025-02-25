package javacore.Lambdas.test;

import javacore.Lambdas.dominio.Anime;
import javacore.Lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>( List.of(new Anime("berserk", 5), new Anime("one  piece", 100), new Anime("naruto", 500)));

      //  Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
       // Collections.sort(animeList, AnimeComparators::compareByTitle);
       animeList.sort( AnimeComparators::compareByEpisodes);
        System.out.println(animeList);

    }
}
