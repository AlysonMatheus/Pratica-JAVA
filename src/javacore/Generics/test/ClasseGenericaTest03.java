package javacore.Generics.test;

import javacore.Generics.dominio.Barco;
import javacore.Generics.dominio.Carro;
import javacore.Generics.service.BarcoRentavelService;
import javacore.Generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(new Carro("Lancha"),new Carro("Canoa")));
        List<Barco> barcosDisponiveis = new ArrayList<>(
                List.of(new Barco("Lancha"),new Barco("Canoa")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);

        Carro carro = rentalServiceCarro.ObjetoDisponivel();
        System.out.println("Usando barco por um mes...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("------------------");


        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);

      Barco barco = rentalServiceBarco.ObjetoDisponivel();
        System.out.println("Usando barco por um mes...");
        rentalServiceBarco.retornarObjetoAlugado(barco);

    }
}
