package javacore.Comportamento.dominio;

public class Car {
    private String name ="Audi";
    private String color;
    private int year;

    public Car( String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
