package javacore.Heranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;
    static {
        System.out.println("inicialização Funcionario");
    }
    {
        System.out.println("Dentro do bloco iniciaslização de Funcionarioa  1 ");
    }
    {
        System.out.println("Dentro do bloco inicialização de Funcionario 2");
    }



   public Funcionario(String nome) {
       super(nome);
       System.out.println("Dentro do construtor de funcionario");
   }
     public void imprime() {
         super.imprime();
         System.out.println(this.salario);

     }
     public  void relatorioPagamento(){
         System.out.println("Eu"+this.nome +" recebi esse valor" + this.salario);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



   }