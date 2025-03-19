package javacore.Interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRomover{

  //private -> default -> protected-> public
    @Override
    public void load() {
        System.out.println("Careegando dados do banco de dados");

    }

    @Override
    public void Remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void Permission() {
        System.out.println("Fazendo checagem de permissao");
    }

    public  static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
