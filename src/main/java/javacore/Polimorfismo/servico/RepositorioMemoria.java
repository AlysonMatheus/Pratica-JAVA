package javacore.Polimorfismo.servico;

import javacore.Polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria");
    }
}
