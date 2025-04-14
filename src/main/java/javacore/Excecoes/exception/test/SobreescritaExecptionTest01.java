package javacore.Excecoes.exception.test;

import javacore.Excecoes.exception.dominio.Funcionario;
import javacore.Excecoes.exception.dominio.LoginInvalidoException;
import javacore.Excecoes.exception.dominio.Pessoa;

public class SobreescritaExecptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();


        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

}
