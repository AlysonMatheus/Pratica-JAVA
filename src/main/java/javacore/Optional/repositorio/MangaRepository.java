package javacore.Optional.repositorio;

import javacore.Optional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1,"Boku no hero",50),new Manga(2, "Overlord",25));
public static Optional<Manga> finById (Integer id){
        return finBy(m ->m.getId().equals(id));
    }


   public static Optional<Manga> finByTitle (String title){
      return finBy(m ->m.getTitle().equals(title));
       }



    private static Optional<Manga> finBy (Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)){
                found = manga;

            }
        }
        return Optional.ofNullable(found);
    }
}
