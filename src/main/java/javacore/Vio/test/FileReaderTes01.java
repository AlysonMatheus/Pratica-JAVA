package javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTes01 {
    public static void main(String[] args) {
        File  file = new File("file.txt");
        try {
            FileReader fr = new FileReader(file);

         //   char [] in = new char [65];
           // fr.read(in);
            //for (char c : in){
              //  System.out.println(c);
            //}
            int i;
            while ((i = fr.read())!= -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
         e.printStackTrace();
        }

    }
}
