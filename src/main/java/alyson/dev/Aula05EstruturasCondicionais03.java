package alyson.dev;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 2000;
        String mensagemDoar = "Eu vou doar 1000 pro alyson";
        String mensagemNaoDoar = "Ainda nao tenho money";
        String resultado = salario >5000 ? mensagemDoar : mensagemNaoDoar;


        System.out.println(resultado);

    }
}
