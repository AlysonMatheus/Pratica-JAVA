package javacore.Colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String>  nomes = new ArrayList(16); // ate a versao 1.4

        nomes.add("Alyson");
        nomes.add("Matheus");

        for (String nome: nomes){
            System.out.println(nome);
        }
        nomes.add("Martins");
        System.out.println("-----------");
        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));

        }
    }
}
