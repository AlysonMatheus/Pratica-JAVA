package javacore.Polimorfismo.test;

import javacore.Polimorfismo.dominio.Computador;
import javacore.Polimorfismo.dominio.Produto;
import javacore.Polimorfismo.dominio.Tomate;
import javacore.Polimorfismo.servico.CalculadoraImposto;

public class Produtotest02 {
    public static void main(String[] args) {
        Produto produto = new Computador(3000,"Intel");
        System.out.println(produto.getNome());
        System.out.println(produto.getValor() );
        System.out.println(produto.calcularImposto());
        System.out.println("------------");


        Produto produto2 = new Tomate(25,"nanico");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor() );
        System.out.println(produto2.calcularImposto());
    }
}
