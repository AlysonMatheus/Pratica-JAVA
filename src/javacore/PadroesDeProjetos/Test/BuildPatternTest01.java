package javacore.PadroesDeProjetos.Test;

import javacore.Exececoes.exception.dominio.Pessoa;
import javacore.PadroesDeProjetos.dominio.Person;

public class BuildPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()

                .firstName("Alyson")
                .lastName("Matheus")
                .userName("Alyzeraaa")
                .email("alysonmatheusdev@gmail.com")
                .build();

        System.out.println(build);


    }
}
