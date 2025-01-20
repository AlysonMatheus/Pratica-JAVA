package javacore.Colecoes.test;

import javacore.Colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("iphone", "1231");
        Smartphone s2 = new Smartphone("Pixel", "2222");
        Smartphone s3 = new Smartphone("Samsung", "3333");
        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);
        for (Smartphone smartphone : smartphones) {

            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("Samsung", "22223333");

        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}