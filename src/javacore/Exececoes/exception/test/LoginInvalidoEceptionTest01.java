package javacore.Exececoes.exception.test;

import javacore.Exececoes.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoEceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
          e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoException{
               Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usaruio ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha ");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDB.equals(usernameDigitado)|| !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }
        System.out.println("Usuario logado com sucesso");
    }
}
