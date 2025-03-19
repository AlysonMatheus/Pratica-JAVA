package javacore.Colecoes.test;

import javacore.Colecoes.dominio.Manga;
import javacore.Colecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class SmartphoneTMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneTMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "marca");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>( new MangaPrecoComparator());
        mangas.add(new Manga(5L,"Hellsing Ultimate",19.9,0));
        mangas.add(new Manga( 2L,"Attack on titan",20.0,5));
        mangas.add(new Manga(1L,"Berserk",13.0,0));
        mangas.add(new Manga(4L,"Pokemom",4.0,2));
        mangas.add(new Manga(3L,"Dragon ball Z",15.0,0));

        for (Manga manga : mangas) {
            System.out.println(manga);

        }
        Manga yuyu =  new Manga(21L,"Yuyu Hakusho",85,5);
        // Metodos
        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println("--------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());


    }
}
