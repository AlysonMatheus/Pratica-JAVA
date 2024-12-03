package javacore.Exececoes.exception.test;

import javacore.Exececoes.exception.dominio.Funcionario;
import javacore.Exececoes.exception.dominio.LoginInvalidoException;
import javacore.Exececoes.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

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
