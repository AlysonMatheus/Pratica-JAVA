package javacore.Datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarioTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek()==Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH,5);

        Date date = c.getTime();
        System.out.println(date);
        System.out.println(c);



    }
}
