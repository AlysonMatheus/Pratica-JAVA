package javacore.String.teste;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome ="Alyson";
        nome.concat("Matheus");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Alyson");
        sb.append(" Mathues");
        System.out.println(sb);
    }
}
