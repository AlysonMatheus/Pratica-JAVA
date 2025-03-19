package javacore.Generics.test;

import javacore.Generics.dominio.Carro;
import javacore.Generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mes...");
        carroRentavelService.retornarCarroAlugado(carro);


    }
}
