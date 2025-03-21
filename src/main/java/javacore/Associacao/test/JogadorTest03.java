package javacore.Associacao.test;

import javacore.Associacao.dominio.Jogador;
import javacore.Associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Alyson");
        Jogador jogador2 = new Jogador("Garro");
        Time time = new Time("Corinthians");

        Jogador[] jogadores = {jogador, jogador2};
        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("-----Jogador----");
        jogador.imprime();
        System.out.println("-----Time----");
        time.imprime();


    }
}
