package javacore.Datas.test;

import java.util.Date;

public class DataTest01 {
    public static void main(String[] args) {
        Date date = new Date(1734015071168L);// Long representando o milesgundos 1000000
        date.setTime(date.getTime()+3_600_000);
        System.out.println(date);
    }
}
