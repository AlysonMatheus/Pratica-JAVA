package alyson.dev;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // dados os valores de 1 a 7,imprima se é dia util ou final de semana
        // considerado 1 como domingo
        int dia = 10;
        switch (dia) {
            case 1:
                System.out.println("domingo,final de semana");
                break;
            case 2:
                System.out.println("SEG,DIA UTIL");
                break;
            case 3:
                System.out.println("ter,DIA UTIL");
                break;
            case 4:
                System.out.println("quart,DIA UTIL");
                break;
            case 5:
                System.out.println("quint,DIA UTIL");
                break;
            case 6:
                System.out.println("sex,DIA UTIL");
                break;
            case 7:
                System.out.println("SAB,DIA UTIL");
                break;
            default:
                System.out.println("Dia invalido");

        }
    }
}
