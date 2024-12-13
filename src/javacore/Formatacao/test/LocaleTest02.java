package javacore.Formatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLangueges = Locale.getISOLanguages();

        for (String isoLanguage : isoLangueges){
            System.out.print(isoLanguage+" ");
        }
        for (String isoCountrie : isoCountries){
            System.out.print(isoCountrie+" ");

        }
    }
}
