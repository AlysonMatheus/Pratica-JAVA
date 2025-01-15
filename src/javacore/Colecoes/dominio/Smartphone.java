package javacore.Colecoes.dominio;

public class Smartphone {
    private String seralNumber;
    private String marca;

    public Smartphone(String marca, String seralNumber) {
        this.marca = marca;
        this.seralNumber = seralNumber;
    }

    public String getSeralNumber() {
        return seralNumber;
    }

    public void setSeralNumber(String seralNumber) {
        this.seralNumber = seralNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
