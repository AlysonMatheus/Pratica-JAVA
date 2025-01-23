package javacore.Colecoes.test;

import javacore.Colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(2L, "Attack on titan", 20.0));
        mangas.add(new Manga(1L, "Berserk", 13.0));
        mangas.add(new Manga(4L, "Pokemom", 4.0));
        mangas.add(new Manga(3L, "Dragon ball Z", 15.0));
        //Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas){
            System.out.println(manga);
        }
        Manga mangasToSearch = new Manga(6L, "Dragon ball Z", 15.0);
        System.out.println(Collections.binarySearch(mangas,mangasToSearch, mangaByIdComparator));




    }
}
