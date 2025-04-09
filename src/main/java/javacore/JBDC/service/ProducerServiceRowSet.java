package javacore.JBDC.service;

import javacore.JBDC.dominio.Producer;
import javacore.JBDC.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
    return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);

    }
}
