package javacore.Polimorfismo.test;

import javacore.Polimorfismo.dominio.Computador;
import javacore.Polimorfismo.dominio.Produto;
import javacore.Polimorfismo.dominio.Tomate;
import javacore.Polimorfismo.servico.CalculadoraImposto;

public class Produtotest03 {
    public static void main(String[] args) {
        Produto produto = new Computador(3000,"Intel");



   Tomate tomate = new Tomate(25,"nanico");
       tomate.setDatavalidade("11/11/2024");


        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
