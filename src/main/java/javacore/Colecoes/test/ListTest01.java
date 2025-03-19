package javacore.Colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String>  nomes = new ArrayList(16); // ate a versao 1.4
        List <String>  nomes2 = new ArrayList(16); // ate a versao 1.4

        nomes.add("Alyson");
        nomes.add("Matheus");
        nomes2.add("Gonçalves");
        nomes2.add("Martins");


        nomes.addAll(nomes2);
        //System.out.println(nomes.remove("alyson"));

        for (String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("-----------");
        int size = nomes.size();
        for(int i = 0; i < nomes.size(); i++) {

            System.out.println(nomes.get(i));

        }
        List<Integer> numeros =new ArrayList<>();
        numeros.add(1);
    }

}
