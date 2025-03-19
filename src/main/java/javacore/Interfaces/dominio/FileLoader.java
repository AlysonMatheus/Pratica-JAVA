package javacore.Interfaces.dominio;

public class FileLoader implements DataLoader,DataRomover{
    @Override
    public void load() {
        System.out.println("Careegando dados do meu arquivo");
    }

    @Override
    public void Remove() {
        System.out.println("Removendo dados do meu banco de dados");
    }
}
