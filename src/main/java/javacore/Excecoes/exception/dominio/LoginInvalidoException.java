package javacore.Excecoes.exception.dominio;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Login Invalido");
    }


    public LoginInvalidoException(String message) {
        super(message);
    }

}