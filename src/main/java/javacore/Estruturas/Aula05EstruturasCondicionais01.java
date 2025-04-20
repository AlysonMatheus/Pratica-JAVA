package javacore.Estruturas;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
       boolean isAutorizadoComprarBebida = idade >=18;
           // !
        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizada a comprar bebida alcolica");
        } else{
            System.out.println("Nao Autorizado");
        }



        if(!isAutorizadoComprarBebida ){
            System.out.println("Nao Autorizado");
            boolean c = true;
            if (c ==false){
                System.out.println("Dentro de algo que nao poderia ser feito");
            }
        }
    }
}
