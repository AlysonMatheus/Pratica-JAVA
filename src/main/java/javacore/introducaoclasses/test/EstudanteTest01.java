package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
      Estudante estudante = new Estudante();
      estudante.nome = "Alyson";
      estudante.idade = 23;
      estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);



    }

}
