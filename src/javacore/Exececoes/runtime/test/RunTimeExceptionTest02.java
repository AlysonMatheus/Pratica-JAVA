package javacore.Exececoes.runtime.test;

import java.io.IOException;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {


            divisao(1, 0);
        System.out.println("Codigo Finalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

        private static int divisao(int a,int b){
            if (b == 0) {
                throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
            }
            return a/b;

        }
    }


