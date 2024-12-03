package javacore.Polimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO =0.21;

    public Computador(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calcular imposto do computador");
        return this.valor * IMPOSTO;
    }

}
