package javacore.Formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimplesDateFormatTest01 {
    public static void main(String[] args) {
        String mascara = "'Osvaldo Cruz' dd 'de' MMM 'de' yyyy ";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        System.out.println(sdf.format(new Date()));
        try{
            System.out.println(sdf.parse("Osvaldo Cruz 17 de dez. de 2024  "));

        }catch (ParseException e ){
            e.printStackTrace();

        }
    }
}
