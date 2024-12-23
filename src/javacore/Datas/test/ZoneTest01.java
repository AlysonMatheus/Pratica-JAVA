package javacore.Datas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
         ZoneId asia = ZoneId.of("Asia/Shanghai");
        System.out.println(asia);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zona = now.atZone(asia);
        System.out.println(zona);


        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zona1 = instant.atZone(asia);
        System.out.println(zona1);


        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
         OffsetDateTime offsetDateTime =   now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);
       OffsetDateTime offsetDateTime1 =  OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime1);

       OffsetDateTime offsetDateTime2 = instant.atOffset(offsetManaus);
        System.out.println(offsetDateTime2);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
          LocalDate date = LocalDate.of(1900,2,1);
         JapaneseDate.from(date);

    }
}
