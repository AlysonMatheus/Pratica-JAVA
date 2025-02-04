package javacore.Streams.test;

import javacore.Streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {

        private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Tensei Shittara", 8.99),
                new LightNovel("Overlord", 3.99),
                new LightNovel("Violet Evergarden", 5.99),
                new LightNovel("No game no life", 2.99),
                new LightNovel("Fullmetal Alchemist", 5.99),
                new LightNovel("Kumo desuga", 1.99),
                new LightNovel("Monogatari", 4.00)
        ));

        public static void main(String[] args) {
            List<String> titles = lightNovels.stream()
                    .sorted(Comparator.comparing(LightNovel::getTitle)) //ordena
                    .filter(ln -> ln.getPrice() <= 4) //filtrou
                    .limit(3) // limitou
                    .map(LightNovel::getTitle) //pegou somente o titulo
                    .collect(Collectors.toList()); //agrupa tudo em uma lista de titulos e voce vai ter o mesmo resultado

            System.out.println(titles);

        }
    }

