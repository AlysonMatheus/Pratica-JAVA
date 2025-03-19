package javacore.modificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
   private static double velocidadeMinima = 250;


    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeMinima = velocidadeMinima;

    }

    public void imprime() {
        System.out.println("---------------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Maxima " + this.velocidadeMaxima);
        System.out.println("Minima " + Carro.velocidadeMinima);

    }
    public static void setVelocidadeMinima(double velocidadeMinima){
         Carro.velocidadeMinima = velocidadeMinima;
    }
    public static  double getVelocidadeMinima(){
        return Carro.velocidadeMinima;
    }



    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
