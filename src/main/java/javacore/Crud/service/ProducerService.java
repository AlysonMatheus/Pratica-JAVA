package javacore.Crud.service;

import javacore.Crud.conn.ConnectionFactory;
import javacore.Crud.dominio.Producer;
import javacore.Crud.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

@Log4j2
public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByname();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByname() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] -%s%n", p.getId(), p.getName()));


    }

    private static void delete() {
        System.out.println("Type the id of the producer you want to delete");

        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? S/N");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)) {

            ProducerRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);

    }
    private static void update(){
        System.out.println("Type the id of the object want to update");
        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()){
            System.out.println("Producer not found");
            return;
        }
        Producer producerFromDb = producerOptional.get();
        System.out.println("Producer found" + producerFromDb);
        System.out.println(" Type the new or ent to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDb.getName() : name;
        Producer producerToUpdate = Producer.builder()
                .id(producerFromDb.getId())
                .name(name).build();
        ProducerRepository.uptade(producerToUpdate);
    }
}







