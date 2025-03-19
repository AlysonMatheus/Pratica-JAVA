package javacore.Polimorfismo.test;

import javacore.Polimorfismo.repositorio.Repositorio;
import javacore.Polimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
      Repositorio repositorio= new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> List = new LinkedList<>();
        List.add("Goku");
        List.add("Vegeta");
        List.add("Vegeta");
        System.out.println(List);

    }
}
