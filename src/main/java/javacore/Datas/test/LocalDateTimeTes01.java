package javacore.Datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTes01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate date  = LocalDate.parse("2024-08-01");

        LocalTime time= LocalTime.parse("09:45:22");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime hora = date.atTime(time);
        LocalDateTime hora2 =  time.atDate(date);
        System.out.println(hora);
        System.out.println(hora2);

    }

}
