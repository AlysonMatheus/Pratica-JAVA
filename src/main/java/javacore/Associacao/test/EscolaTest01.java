package javacore.Associacao.test;

import javacore.Associacao.dominio.Escola;
import javacore.Associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Alyson");
        Professor professor1 = new Professor("Alyson");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("FAI", professores);

        escola.imprime();
    }
}
