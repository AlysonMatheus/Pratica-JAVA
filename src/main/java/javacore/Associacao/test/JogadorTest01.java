package javacore.Associacao.test;

import javacore.Associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pele");
        Jogador jogador02 = new Jogador("Ronaldo");
        Jogador jogador03 = new Jogador("Neymar");

        Jogador[] jogadores = {jogador01,jogador02,jogador03};
        for (Jogador jogador :jogadores){
            jogador.imprime();

        }
    }

}
