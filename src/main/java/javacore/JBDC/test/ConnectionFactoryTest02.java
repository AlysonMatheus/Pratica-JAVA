package javacore.JBDC.test;

import javacore.JBDC.dominio.Producer;
import javacore.JBDC.repository.ProducerRepositoryRowSet;
import javacore.JBDC.service.ProducerService;
import javacore.JBDC.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("MAD2").build();
        ProducerServiceRowSet.UpdateCacheRowSet(producerToUpdate);
//        log.info("----------------------");
//        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("");
//        log.info(producers);
    }

}
