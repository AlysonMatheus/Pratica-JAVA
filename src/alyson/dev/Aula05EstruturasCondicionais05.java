package alyson.dev;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana 1 como domingo
        byte dia = 15;
        //char, int, byte, short, enum, string
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        char sexo ='G';
        switch (sexo){
            case 'M':
                 System.out.println("Homem");
                 break;
            case 'F':
                     System.out.println("Mulher");
                     break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
