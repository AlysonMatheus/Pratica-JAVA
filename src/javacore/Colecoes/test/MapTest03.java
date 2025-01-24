package javacore.Colecoes.test;

import javacore.Colecoes.dominio.Consumidor;
import javacore.Colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Alyson Matheus");
        Consumidor consumidor2 = new Consumidor("Lucas");

         Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9);
         Manga manga2 = new Manga(2L, "Attack on titan", 20.0);
         Manga manga3 = new Manga(1L, "Berserk", 13.0);
         Manga manga4 = new Manga(4L, "Pokemom", 4.0);
         Manga manga5 = new Manga(3L, "Dragon ball Z", 15.0);

        List <Manga> mangaConsumidor1 = List.of(manga1, manga2, manga3);
        List <Manga> mangaConsumidor2 = List.of(manga3, manga4);
        Map<Consumidor, List <Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, mangaConsumidor1);
        consumidorManga.put(consumidor2, mangaConsumidor2);

      for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()){
          System.out.println("------- "+entry.getKey().getNome());
          for (Manga manga : entry.getValue()) {
              System.out.println("-------- "+manga.getNome());
              
          }

      }




    }
}
