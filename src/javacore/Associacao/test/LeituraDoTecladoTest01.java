package javacore.Associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       /*System.out.println("Digite seu nome");

        String next = entrada.nextLine();
        System.out.println(next);*/
    System.out.println("Digite sua idade");
    int idade = entrada.nextInt();
        System.out.println(idade);

        if (idade >= 18){
            System.out.println("Maior de idade");
        }
        else
            System.out.println("Menor de idade");
    }

}
