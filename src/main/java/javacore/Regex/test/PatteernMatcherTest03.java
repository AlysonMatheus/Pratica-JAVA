package javacore.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatteernMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // /D = Tudo o que não for digito
        //\s - Espaçoes em branco \t \n \f \f \r
        // \S = Todos os caracters excluindo os brancos
        // \W = a-ZA-Z, digitos, _
        // \W =Tudo que não for incclluso no \
        String regex = "0[xX][0-9a-fA-F]";
        String regex1 ="\\D";
        String regex2 ="\\s";
        String regex3 ="\\S";

        //String texto =  "abaaba";
        String texto2 =  "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);

        Matcher matcher = pattern.matcher(texto2);
        Matcher matcher1 = pattern1.matcher(texto2);
        Matcher matcher2 = pattern2.matcher(texto2);

        System.out.println("Texto  "+texto2);
        System.out.println("indice: 123456789");
        System.out.println("regex " +regex);
        System.out.println("regex1 " +regex1);
        System.out.println("regex2 " +regex2);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        System.out.println("----------------------------");
        while (matcher1.find()){
            System.out.println(matcher1.start()+" "+matcher1.group()+"\n");
        }
        System.out.println("----------------------------");
        while (matcher2.find()){
            System.out.println(matcher2.start()+" "+matcher2.group()+"\n");
        }

        int numeroHex = 0X59F86A; //Numero Hexadecimal sempre vai ter o começo 'OX'
        System.out.println(numeroHex);



    }
}
