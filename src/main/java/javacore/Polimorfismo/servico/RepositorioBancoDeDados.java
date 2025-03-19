package javacore.Polimorfismo.servico;

import javacore.Polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco De Dados");
    }
}
