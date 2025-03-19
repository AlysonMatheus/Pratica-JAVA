package javacore.Polimorfismo.dominio;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}

