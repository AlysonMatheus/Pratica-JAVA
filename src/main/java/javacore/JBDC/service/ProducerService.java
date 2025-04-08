package javacore.JBDC.service;

import javacore.JBDC.dominio.Producer;
import javacore.JBDC.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.uptade(producer);
    }
    public static void uptadePreparedStatement(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.uptadePreparedStatement(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();

    }
    public static void showProducerMetaData(){
        ProducerRepository.showProducerMetaData();
    }
    public static void showDriverMetaData(){
        ProducerRepository.showDriverMetadata();
    }
    public static void showTypeScrollWorking(){
        ProducerRepository.showTypeScrollWorking();
    }


    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }
   public static List<Producer> findByNamePreparedStatement(String name) {
        return ProducerRepository.findByNamePreparedStatement(name);
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        return ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }
    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }
    public static void findByNameAndDelete(String name) {
     ProducerRepository.findByNameAndDelete(name);
    }


    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");

        }
    }
}
