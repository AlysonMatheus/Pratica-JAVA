package javacore.Datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(2);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(15);
        Period p3 = Period.ofWeeks(58);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
