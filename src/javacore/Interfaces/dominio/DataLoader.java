package javacore.Interfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 20;
  public abstract   void load();
 default  void Permission(){
   System.out.println("Fazendo checagem de permissão");

 }
 public  static void retrieveMaxDataSize(){
     System.out.println("Dentro do retrieveMaxDataSize");
 }
}
