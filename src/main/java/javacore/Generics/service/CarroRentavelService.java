package javacore.Generics.service;

import javacore.Generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(
            List.of(new Carro("Lancha"),new Carro("Canoa")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carros disponivel...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+carro);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(carrosDisponiveis);
        return carro;
    }
    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro "+carro);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(carrosDisponiveis);
    }
}
