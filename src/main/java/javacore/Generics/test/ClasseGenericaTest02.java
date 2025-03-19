package javacore.Generics.test;

import javacore.Generics.dominio.Barco;
import javacore.Generics.dominio.Carro;
import javacore.Generics.service.BarcoRentavelService;
import javacore.Generics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando barco por um mes...");
        barcoRentavelService.retornarBarcoAlugado(barco);


    }
}
