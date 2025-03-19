package javacore.ClassesAbstratas.test;

import javacore.ClassesAbstratas.dominio.Desenvolvedor;
import javacore.ClassesAbstratas.dominio.Funcionario;
import javacore.ClassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Alyson", 20000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
      gerente.imprime();
      desenvolvedor.imprime();
    }

}
