package javacore.modificadorestatico.domain;

public class Anime {
    private String nome;
    private  static  int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1- Alocado espaço em memoria pro objetivo
    // 2 - Cada atributo da classe é inicilazado com valores default ou o que for passado
    // 3 - Bloco de inizialização é executado
    // 4 - Construtot é executado
       static {
        System.out.println("Bloco inicilização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;


        }

    }
    static {
        System.out.println("Bloco de inicialização 2");
    }
    static {
        System.out.println("Bloco de inicialização estatico 3");

    }
    {
        System.out.println("Bloco de inicialização não estatico ");
    }



    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
      for (int episodios: Anime.episodios){
          System.out.print(episodios + " " );


        }


        System.out.println();

    }


    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
