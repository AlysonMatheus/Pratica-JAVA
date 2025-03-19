package javacore.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatteernMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // /D = Tudo o que não for digito
        //\s - Espaçoes em branco \t \n \f \f \r
        // \S = Todos os caracters excluindo os brancos
        // \W = a-ZA-Z, digitos, _
        // \W =Tudo que não for incclluso no \
        //? Zero ou uma
        //* zero ou mais
        // + uma ou mais
        //{n,m} de n ate m
        //()
        // | o(v|c)o ovo | oco
        // $ fim da linha

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);


        System.out.println("Texto  " + texto);
        System.out.println("indice: 123456789") ;
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }






    }
}
