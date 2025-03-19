package javacore.Exercicio.test;

import javacore.Exercicio.dominio.Aluno;
import javacore.Exercicio.dominio.Endereco;
import javacore.Exercicio.dominio.Professor;
import javacore.Exercicio.dominio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Endereco local = new Endereco("Osvaldo Cruz" );
        Aluno alunos = new Aluno("Alyson", 24 );
        Professor professor = new Professor("Dev", "Ação");
        Aluno [] alunos1 =  {alunos};

        Seminario seminario = new Seminario("Corinthians" , alunos1,local);
        Seminario [] seminarios1 = {seminario};

        professor.setSeminarios(seminarios1);
       professor.imprime();

    }
}
