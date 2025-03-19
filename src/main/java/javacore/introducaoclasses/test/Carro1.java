package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Carro;

public class Carro1 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
      carro.nome ="Chevrolet";
      carro.ano = 2000;
      carro.modelo ="Vectra";

        System.out.println("-----------------");
        carro2.nome ="Gol";
        carro2.ano =  1998;
        carro2.modelo ="Gtr";

        carro = carro2;

        System.out.println( " NOME: " + carro.nome + " ano: " + carro.ano + " modelo: "+ carro.modelo );

        System.out.println(carro2.nome + " NOME: "+ carro2.ano +" Ano: "+ carro2.modelo );



    }
}
