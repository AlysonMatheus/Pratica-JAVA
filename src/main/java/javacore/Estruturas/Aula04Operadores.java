package javacore.Estruturas;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+-/*
        int numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 / numero2;
        System.out.println(resultado);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("IsDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("IsDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("IsDezIgualVinte " + isDezIgualVinte);
        System.out.println("IsDezIgualDez " + isDezIgualDez);
        System.out.println("IsDezDiferenteDez " + isDezDiferenteDez);


        // && (AND) ||(or)!
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("IsDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("IsDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlay = 5000f;
        boolean isPlay5Compravel = valorTotalContaCorrente >valorPlay || valorTotalContaPoupanca > valorPlay;
        System.out.println("IsPlay5 "+isPlay5Compravel);


        // = += -= *= /= %=
        double bonus = 1800;
           bonus += 1000;//2800
           bonus -=1000;//1800
        bonus *= 2;
        bonus /=2;
        bonus %= 2;

        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador +=1; // contador = contador +1;
       contador++;
       contador--;
       ++contador;
       --contador;
       int contador2 = 0;
        System.out.println(contador2++);

        System.out.println(contador2);
    }

}
