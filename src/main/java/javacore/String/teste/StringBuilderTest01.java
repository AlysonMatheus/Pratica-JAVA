package javacore.String.teste;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome ="Alyson";
        nome.concat("Matheus");
        nome.substring(0,2);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("Alyson");
        sb.append(" Mathues").append(" Dev Java");
        sb.reverse();
        sb.reverse();
        sb.delete(0,2);
        System.out.println(sb);
    }
}
