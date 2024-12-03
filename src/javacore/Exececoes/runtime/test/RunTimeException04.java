package javacore.Exececoes.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeException04 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();

        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException |ArithmeticException e){
            System.out.println("Dentro Do ArrayIndexOutOfBoundsException ");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro Do ArrayIndexOutOfBoundsException ");
        }catch (RuntimeException e){
            System.out.println("Dentro da RuntimeException");

        }
        try{
            talvezLanceException();
        }catch (Exception  e){
            e.printStackTrace();
        }


    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }


}
