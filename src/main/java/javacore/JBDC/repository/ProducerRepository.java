package javacore.JBDC.repository;

import javacore.JBDC.conn.ConnectionFactory;
import javacore.JBDC.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public  static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
           try (Connection conn = ConnectionFactory.getConnection();
                Statement stmt =  conn.createStatement()){
                    stmt.executeUpdate(sql);
                    int rowsAffected = stmt.executeUpdate(sql);
               System.out.println(rowsAffected);
           } catch (SQLException e) {
               e.printStackTrace();
           }
    }

}
