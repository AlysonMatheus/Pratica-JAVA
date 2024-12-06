package javacore.String.teste;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Alyson ";//String  constant pool
        String nome2= "Alyson";
       nome = nome.concat("Matheus");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Alyson");// 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
