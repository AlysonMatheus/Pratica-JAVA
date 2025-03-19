package javacore.Streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> alyson = new ArrayList<>();
     List<String>  graphicDeesingners = List.of("Matheus", "Gonçalves", "Martins");
     List<String> developers = List.of("Alyson","David","Harisson");
     List<String> students = List.of("Livia","Marcos","Cesar");
     alyson.add(graphicDeesingners);
     alyson.add(developers);
     alyson.add(students);
        for (List<String> people : alyson) {
            for (String person : people) {
                System.out.println(person);
            }

        }
        System.out.println("-------------");
         alyson.stream().flatMap(Collection::stream).forEach(System.out::println);

    }

}
