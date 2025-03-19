package javacore.Lambdas.test;

import javacore.Lambdas.dominio.Anime;
import javacore.Lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
// Referência a um método de instância de um objeto específico
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>( List.of(new Anime("berserk", 5), new Anime("one  piece", 100), new Anime("naruto", 500)));
        animeList.sort(animeComparators::compareByNonStatic);
        animeList.sort((a1,a2) -> animeComparators.compareByNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
