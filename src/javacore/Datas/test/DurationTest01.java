package javacore.Datas.test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timenow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration duration = Duration.between(now,nowAfterTwoYears);
        Duration duration1 = Duration.between(timenow, timeMinus7Hours);
        Duration duration2 = Duration.between(Instant.now(),Instant.now().plusSeconds(1000));
        Duration duration3 = Duration.ofDays(20);
        Duration duration4 = Duration.ofMinutes(20);
        Duration duration5 = Duration.of(20, ChronoUnit.HOURS);
        System.out.println(duration);
        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
        System.out.println(duration5);


    }
}
