package javacore.String.teste;

public class StringPeromanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatSring(100000);
        long fim =System.currentTimeMillis();
        System.out.println("Tempo gasto para String " +(fim-inicio)+"ms");
    }
    private static void concatSring(int tamanho){
        String texto =  "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i;//0,01,012,013
            
        }
    }
}
