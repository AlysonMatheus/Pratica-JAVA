package Treino;

import java.util.Scanner;

public class TreinoJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo;
        int velocidade;
        int distancia;
        double media= 12.0;

        double resultado;

        System.out.println("Digite a velocidade");
        velocidade = sc.nextInt();

        System.out.println("digite o tempo gasto");
        tempo = sc.nextInt();

        distancia = tempo*velocidade;
        resultado = distancia/media;

        System.out.println("a quantidade de litros foi" + resultado);

    }

}
