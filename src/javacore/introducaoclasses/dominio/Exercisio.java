package javacore.introducaoclasses.dominio;

public class Exercisio {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media ;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            System.out.println(salario + "");
        }
        mediaSalarios();
    }

    public void mediaSalarios() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMedia Salarial " + media);

    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }



    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }
}

