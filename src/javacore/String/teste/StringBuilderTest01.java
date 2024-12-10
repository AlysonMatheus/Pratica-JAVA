package javacore.String.teste;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome ="Alyson";
        nome.concat("Matheus");
        nome.substring(0,2);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Alyson");
        sb.append(" Mathues").append(" Dev Java");
        sb.reverse();
        sb.reverse();
        System.out.println(sb);
    }
}
