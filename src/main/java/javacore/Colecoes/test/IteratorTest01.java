package javacore.Colecoes.test;

import javacore.Colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();


        mangas.add(new Manga(5L,"Hellsing Ultimate",19.9,0));
        mangas.add(new Manga( 2L,"Attack on titan",20.0,5));
        mangas.add(new Manga(1L,"Berserk",13.0,0));
        mangas.add(new Manga(4L,"Pokemom",4.0,2));
        mangas.add(new Manga(3L,"Dragon ball Z",15.0,0));

       /* Iterator<Manga> mangaIterator = mangas.iterator();
        while(mangaIterator.hasNext()){
            if ( mangaIterator.next().getQuantidade() == 0){
                mangaIterator.remove();

            }
        }*/




        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
