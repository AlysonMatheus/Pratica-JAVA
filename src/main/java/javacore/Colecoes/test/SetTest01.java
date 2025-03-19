package javacore.Colecoes.test;

import javacore.Colecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set <Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L,"Hellsing Ultimate",19.9,0));
        mangas.add(new Manga( 2L,"Attack on titan",20.0,5));
        mangas.add(new Manga(1L,"Berserk",13.0,0));
        mangas.add(new Manga(4L,"Pokemom",4.0,2));
        mangas.add(new Manga(3L,"Dragon ball Z",15.0,0));
        mangas.add(new Manga(3L,"Dragon ball Z",15.0,0));
         for (Manga manga : mangas){
             System.out.println(manga);
         }
    }
}
