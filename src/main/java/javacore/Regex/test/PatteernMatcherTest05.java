package javacore.Regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatteernMatcherTest05 {
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
        // . 1.3 = 123, 133, 1@3, 1A3

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email Valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
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
