package javacore.Optional.test;

import javacore.Optional.dominio.Manga;
import javacore.Optional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.finByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.finById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.finByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 20));

        System.out.println(newManga);
    }
}
