package javacore.Estruturas;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short,int,long, float e double 0
        // char */u0000
        // boolean false
        // String null

     String[] nomes = new String[4];
        nomes[0] = "Alyson";
        nomes[1] = "Alyson";
        nomes[2] = "Alyson";
        nomes[3] = "Alyson";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
    }
}
}
