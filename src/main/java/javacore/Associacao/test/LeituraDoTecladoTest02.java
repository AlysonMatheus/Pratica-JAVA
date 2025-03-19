package javacore.Associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa de perguntas");
        System.out.println("Digite sua pergunta e eu vou responder sim ou não");
        String digite = entrada.nextLine();
        if (digite.charAt(0) == ' '){
            System.out.println("Sim");

    }else{
            System.out.println("Não");
        }
}
}
