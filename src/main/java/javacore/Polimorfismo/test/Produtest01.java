package javacore.Polimorfismo.test;

import javacore.Polimorfismo.dominio.Computador;
import javacore.Polimorfismo.dominio.Televisao;
import javacore.Polimorfismo.dominio.Tomate;
import javacore.Polimorfismo.servico.CalculadoraImposto;

public class Produtest01 {
    public static void main(String[] args) {
        Computador computador = new Computador(110000, "i7");
        Tomate tomate = new Tomate(10, "Tomate mexicano");
        Televisao tv = new Televisao(10000,"Samsung 50\"" );
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }

}
