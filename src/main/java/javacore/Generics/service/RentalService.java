package javacore.Generics.service;

import javacore.Generics.dominio.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T>objetosDisponiveis;
            public RentalService( List<T> objetosDisponiveis){
                this.objetosDisponiveis = objetosDisponiveis;

            }


        public T ObjetoDisponivel(){
            System.out.println("Buscando objetos disponivel...");
            T t = objetosDisponiveis.remove(0);
            System.out.println("Buscando objetos disponivel...");
            System.out.println("Alugando : "+ t);
            System.out.println("Buscando objetos disponivel...");
            System.out.println("Disponiveis para alugar");
            System.out.println(objetosDisponiveis);
            return t;
        }
        public void retornarObjetoAlugado(T t){
            System.out.println("Devolvendo objeto " +t);
            objetosDisponiveis.add(t);
            System.out.println("objeto disponiveis para alugar");
            System.out.println(objetosDisponiveis);
        }

    }

