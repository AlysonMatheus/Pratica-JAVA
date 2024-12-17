package javacore.Datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeTes01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date  = LocalDate.of(2024,10,1);
        System.out.println(localDateTime);
        System.out.println(date);
    }

}
