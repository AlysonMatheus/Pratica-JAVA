package javacore.Generics.service;

import javacore.Generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(
            List.of(new Barco("Lancha"),new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barcos disponivel...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: "+barco);
        System.out.println("Barcos disponiveis para alugar");
        System.out.println(barcosDisponiveis);
        return barco;
    }
    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco "+barco);
        System.out.println("Barcos disponiveis para alugar");
        System.out.println(barcosDisponiveis);
    }
}
