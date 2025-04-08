package javacore.JBDC.test;

import javacore.JBDC.conn.ConnectionFactory;
import javacore.JBDC.dominio.Producer;
import javacore.JBDC.repository.ProducerRepository;
import javacore.JBDC.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {

        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("NHK").build();

        // ProducerRepository.save(producer);

        //ProducerService.delete(15);

        //  ProducerService.update(producerToUpdate);
       // List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
       // log.info("´Producers found '{}'", producers);
       // ProducerService.showProducerMetaData();
//        //ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        log.info("´Producers found '{}'", producers);
        List<Producer> producers = ProducerService.findByNamePreparedStatement("Bones");
        log.info("´Producers found '{}'", producers);



  /*  log.info("info");
    log.debug("debug");
    log.warn("warn");
    log.error("error");
    log.trace("trace");
*/
    }
}
