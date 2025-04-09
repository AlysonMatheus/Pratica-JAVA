package javacore.JBDC.test;

import javacore.JBDC.dominio.Producer;
import javacore.JBDC.repository.ProducerRepositoryRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("NHK");
        log.info(producers);
    }
}
