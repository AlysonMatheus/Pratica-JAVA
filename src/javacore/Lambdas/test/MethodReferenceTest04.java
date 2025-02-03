package javacore.Lambdas.test;

import javacore.Lambdas.dominio.Anime;
import javacore.Lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference para um construtor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimecomparators = AnimeComparators::new;
        AnimeComparators animeComparators =  newAnimecomparators.get();
        List<Anime> animeList = new ArrayList<>( List.of(new Anime("berserk", 5), new Anime("one  piece", 100), new Anime("naruto", 500)));

        animeList.sort(animeComparators::compareByNonStatic);

        System.out.println(animeList);
        BiFunction<String,Integer,Anime> animeBiFunction = (title,episodes) -> new Anime(title,episodes);
        BiFunction<String,Integer,Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Super campeões",36));

    }
}
