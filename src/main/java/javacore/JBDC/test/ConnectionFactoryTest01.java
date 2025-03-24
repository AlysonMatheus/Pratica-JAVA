package javacore.JBDC.test;

import javacore.JBDC.conn.ConnectionFactory;
import javacore.JBDC.dominio.Producer;
import javacore.JBDC.repository.ProducerRepository;
import javacore.JBDC.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {

        Producer producer = Producer.builder().name("Studio Deen").build();

       // ProducerRepository.save(producer);

       // ProducerService.delete(5);

  /*  log.info("info");
    log.debug("debug");
    log.warn("warn");
    log.error("error");
    log.trace("trace");
*/
    }
}
