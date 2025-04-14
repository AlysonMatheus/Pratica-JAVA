package javacore.Excecoes.runtime.test;

public class RunTimeException03 {
    public static void main(String[] args) {
        abreConexao2();
    }

public static String abreConexao() {
            try{
                System.out.println("Abrindo Arquivo");
                System.out.println("Escrevendo dados no arquivo");
                return "CONEXÃO ABERTA";
            }catch (Exception e){
                e.printStackTrace();
            }
            finally {
                System.out.println("Fechando recurso liberando pelo SO");


            }
            return null;
    }
 private static  void abreConexao2() {
    try {
        System.out.println("Abrindo Arquivo");
        System.out.println("Escrevendo dados no arquivo");
        throw new RuntimeException();


    } finally {
        System.out.println("Fechando recurso liberando pelo SO");


    }
}
}
