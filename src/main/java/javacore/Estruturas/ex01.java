package javacore.Estruturas;

public class ex01 {
    public static void main(String[] args) {
      /*  double salarioMenor = 9.70;
        double salarioMedio = 37.35;
        double salarioMaior =49.60;

        if(salarioMenor <= 34.712){
            System.out.println("voce pagara 9.70% de taxa");

        } else if (salarioMedio >34.712 && <=68.506 ) {
            System.out.println("voce pagara 34.35");

        } else{
            System.out.println("voce pagara 49.50");
        }
    }*/

        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.75 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valaorImposto;
        if (salarioAnual <= 34712) {
            valaorImposto = salarioAnual * primeiraFaixa;

        } else if (salarioAnual >= 34712 && salarioAnual <= 6850) {
            valaorImposto = salarioAnual * segundaFaixa;
        } else {
            valaorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valaorImposto);

    }
}

