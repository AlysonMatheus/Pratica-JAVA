package javacore.modificadorestatico.teste;

import javacore.modificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro.setVelocidadeMinima(180);

        Carro c1 = new Carro("BMW", 250);
        Carro c2 = new Carro("Mercedes", 260);
        Carro c3 = new Carro("Audi", 280);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
