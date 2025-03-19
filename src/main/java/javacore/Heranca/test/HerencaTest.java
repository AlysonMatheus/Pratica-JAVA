package javacore.Heranca.test;

import javacore.Heranca.dominio.Endereco;
import javacore.Heranca.dominio.Funcionario;
import javacore.Heranca.dominio.Pessoa;

public class HerencaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("17700-000");
        Pessoa pessoa = new Pessoa("Alyson Matheus");

        pessoa.setCpf("3435454");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Lucas Calabe");

        funcionario.setCpf("4353535");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(32324);
        System.out.println("---------------");
        funcionario.imprime();

    }
}
