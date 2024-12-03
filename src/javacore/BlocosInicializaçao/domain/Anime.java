package javacore.BlocosInicializaçao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1- Alocando espaço em memoria pro objetivo
    // 2 - Cada atributo da classe é inicilazado com valores default ou o que for passado
    // 3 - Bloco de inizialização é executado
    // 4 - Construtot é executado
    {
        System.out.println("Bloco ininiziação");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
      for (int episodios: this.episodios){
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
