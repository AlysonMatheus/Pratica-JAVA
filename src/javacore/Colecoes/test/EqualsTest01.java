package javacore.Colecoes.test;

import javacore.Colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 =new Smartphone("1ABC1","iphone");
        Smartphone s2 = s1;
        System.out.println(s1.equals(s2));
    }
}
