package javacore.Associacao.test;

import javacore.Associacao.dominio.Jogador;
import javacore.Associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pele");

        Time time = new Time("Corinthians");


        jogador01.setTime(time);
        jogador01.imprime();
    }
}
