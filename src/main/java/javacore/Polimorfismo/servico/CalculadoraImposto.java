package javacore.Polimorfismo.servico;

import javacore.Polimorfismo.dominio.Computador;
import javacore.Polimorfismo.dominio.Produto;
import javacore.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {


    public  static void calcularImposto(Produto produto) {
        System.out.println("----Relatorio do imposto----");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
String datavalidade = ((Tomate) produto).getDatavalidade();
            System.out.println(datavalidade);
        }
    }

}
