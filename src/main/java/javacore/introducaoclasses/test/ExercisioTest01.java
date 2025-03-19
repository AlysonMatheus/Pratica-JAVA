package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Exercisio;

public class ExercisioTest01 {
    public static void main(String[] args) {
        Exercisio exercisio = new Exercisio();
        exercisio.setNome("Alyson");
        exercisio.setIdade(23);
        exercisio.setSalarios(new double[]{1300, 3434, 43434});

        exercisio.imprime();
        System.out.println("Media  " + exercisio.getMedia());

    }
}
