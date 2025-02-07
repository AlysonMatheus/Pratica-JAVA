package javacore.Streams.dominio;

import java.util.Objects;

public class LightNovel {
    private String title;
    private double price;
    private Category caretory;

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public LightNovel(String title,double price, Category caretory) {
        this.title = title;
        this.caretory = caretory;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", caretory=" + caretory +
                '}';
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Category getCaretory() {
        return caretory;
    }
}
