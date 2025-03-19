package javacore.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatteernMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String texto =  "abaaba";
        String texto2 =  "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto  "+texto2);
        System.out.println("indice: 123456789");
        System.out.println("regex " +regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }


    }
}
