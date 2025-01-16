package javacore.Colecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String marca, String seralNumber) {
        this.marca = marca;
        this.serialNumber = seralNumber;
    }
      //Reflexivo: x.equals(x) tem que ser  true para tudo que for diferente de null
    // Simetrico: para x e y difentes de null, se x.equals(y) == true logo y.equals(x) == true
    // Transitividade: para x,y,z difentes de null, se x.equals(y) == true, e x.equals(z) == true logo , y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) tem que retornar false
    @Override
    public boolean equals(Object obj) {
      if(obj == null) return false;
      if(this == obj) return true;
      if (this.getClass()!= obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    public String getSeralNumber() {
        return serialNumber;
    }

    public void setSeralNumber(String seralNumber) {
        this.serialNumber = seralNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
