package javacore.Classesinternas.test;

public class OuterClassesTest02 {
    private String nome = "Midoriya";

    void print(final String param){
         final String lastNome = "Izuku";

         class LocalClass{
          public void printLocal(){
              System.out.println(param);
              System.out.println(nome+" "+lastNome) ;
          }
        }
       new LocalClass().printLocal();

    }
    public static void main(String[] args) {
      OuterClassesTest02 outer = new OuterClassesTest02();
      outer.print();
    }
}
