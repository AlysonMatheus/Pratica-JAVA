package javacore.Polimorfismo.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO =0.21;
    public Televisao(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calcular imposto da televisão");
        return this.valor * IMPOSTO;
    }

}
