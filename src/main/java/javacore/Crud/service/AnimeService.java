package javacore.Crud.service;

import javacore.Crud.dominio.Anime;
import javacore.Crud.dominio.Producer;
import javacore.Crud.repository.AnimeRepository;
import lombok.extern.log4j.Log4j2;

import java.util.Optional;
import java.util.Scanner;

@Log4j2
public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByname();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();

        }
    }

    private static void findByname() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        AnimeRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] -%s %d %s%n", p.getId(), p.getName(),p.getEpisodes(),p.getProducer().getName()));


    }

    private static void delete() {
        System.out.println("Type the id of the anime you want to delete");

        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? S/N");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)) {

            AnimeRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of episodes ");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id od the producer ");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        Anime anime = Anime.builder().episodes(episodes).name(name)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);

    }
    private static void update(){
        System.out.println("Type the id of the object want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (animeOptional.isEmpty()){
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromDb = animeOptional.get();
        System.out.println("Anime found" + animeFromDb);
        System.out.println(" Type the new or ent to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.println(" Type the number of episodes or ent to keep the same");
        int episodes = Integer.parseInt( SCANNER.nextLine());

        Anime animeToUpdate = Anime.builder()
                .id(animeFromDb.getId())
                .episodes(episodes)
                .producer(animeFromDb.getProducer())
                .name(name).build();
        AnimeRepository.uptade(animeToUpdate);
    }
}







