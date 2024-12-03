package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Alyson Prof";
        professor.idade = 23;
        professor.sexo = 'M';

        System.out.println(professor.nome + " IDADE:" + professor.idade + " SEXO:" + professor.sexo);

    }
}
