package javacore.Datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localech = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Calendar calender = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localech);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeIndia);
        System.out.println("Italia "+ df1.format(calender.getTime()));
        System.out.println("Suiça "+ df2.format(calender.getTime()));
        System.out.println("India "+ df3.format(calender.getTime()));
    }
}
