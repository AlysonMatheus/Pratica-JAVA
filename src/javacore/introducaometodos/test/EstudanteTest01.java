package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Estudante;
import javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante Impressora = new ImpressoraEstudante();


        estudante01.nome = "Alyson";
        estudante01.idade = 15;
        estudante01.sexo = 'F';

        estudante02.nome ="Livia";
        estudante02.idade = 16;
        estudante02.sexo = 'F';
Impressora.imprime(estudante01);
Impressora.imprime(estudante02);

        System.out.println();
Impressora.imprime(estudante01);
Impressora.imprime(estudante02);





    }
}
