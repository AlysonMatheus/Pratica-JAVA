package javacore.Interfaces.test;

import javacore.Interfaces.dominio.DataLoader;
import javacore.Interfaces.dominio.DatabaseLoader;
import javacore.Interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        fileLoader.Remove();
        databaseLoader.Remove();


        databaseLoader.Permission();
        fileLoader.Permission();
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();

    }
}
