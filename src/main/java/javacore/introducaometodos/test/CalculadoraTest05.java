package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(new int []{1,2,3,4,5});
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
    }


