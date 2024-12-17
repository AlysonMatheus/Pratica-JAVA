package javacore.Datas.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timenow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration duration = Duration.between(now,nowAfterTwoYears);
        System.out.println(duration);

    }
}
