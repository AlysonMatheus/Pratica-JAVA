package javacore.JBDC.test;

import javacore.JBDC.conn.ConnectionFactory;
import javacore.JBDC.dominio.Producer;
import javacore.JBDC.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {

        Producer producer = Producer.ProducerBuilder.builder().name("NHK").build();

        ProducerRepository.save(producer);

    }
}
