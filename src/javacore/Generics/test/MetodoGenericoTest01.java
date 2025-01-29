package javacore.Generics.test;

import javacore.Generics.dominio.Barco;
import javacore.Generics.dominio.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
      List<Barco> barcolist = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcolist);

    }
    private static <T > List<T> criarArrayComUmObjeto(T t){
        List<T> list = List.of(t);
       return List.of(t);
    }
    //private static <T extends Comparator<T>> List<T> criarArrayComUmObjeto(T t){
      //  List<T> list = List.of(t);
       // return List.of(t);
    //}

}


