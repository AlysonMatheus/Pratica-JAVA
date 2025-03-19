package javacore.Polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO =0.06;
    private String datavalidade;
        public Tomate(double valor, String nome) {
        super(valor, nome);
    }

    public double calcularImposto(){
        System.out.println("Calulando emposto do tomate");
         return this.valor * IMPOSTO;
    }

    public String getDatavalidade() {
        return datavalidade;
    }

    public void setDatavalidade(String datavalidade) {
        this.datavalidade = datavalidade;
    }
}
