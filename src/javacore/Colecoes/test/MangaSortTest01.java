package javacore.Colecoes.test;

import javacore.Colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L,"Hellsing Ultimate",19.9));
        mangas.add(new Manga( 2L,"Attack on titan",20.0));
        mangas.add(new Manga(1L,"Berserk",13.0));
        mangas.add(new Manga(4L,"Pokemom",4.0));
        mangas.add(new Manga(3L,"Dragon ball Z",15.0));

        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("-------------");
        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
