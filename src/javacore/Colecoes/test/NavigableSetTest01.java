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

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneTMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "marca");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L,"Hellsing Ultimate",19.9,0));
        mangas.add(new Manga( 2L,"Attack on titan",20.0,5));
        mangas.add(new Manga(1L,"Berserk",13.0,0));
        mangas.add(new Manga(4L,"Pokemom",4.0,2));
        mangas.add(new Manga(3L,"Dragon ball Z",15.0,0));
        mangas.add(new Manga(3L,"Dragon ball Z",15.0,0));
        for (Manga manga : mangas) {
            System.out.println(manga);

        }

    }
}
