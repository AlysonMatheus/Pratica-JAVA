package javacore.Vio.test;

//File
//FileWriter
//FileReader
///BufferedWriter
//BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true);){
            fw.write("O Alyson vai se tornar um desenvolvedor foda!!!\n Vai Corinthains\n");
            fw.flush();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
}
