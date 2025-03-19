package javacore.ModificadorFinal.Test;

import javacore.ModificadorFinal.dominio.Carro;
import javacore.ModificadorFinal.dominio.Comprador;
import javacore.ModificadorFinal.dominio.Ferrari;

public class CarroTest  extends  Carro{

    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
      carro.COMPRADOR.setNome("Alyson");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Timao");
        ferrari.imprime();


    }
}
