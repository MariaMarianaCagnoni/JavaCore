package ZZEstreams.domain;

import java.util.Objects;

/**
 * @author mariana
 * @Project: javacore
 */
public class LightNovels {

    private String Title;
    private double price;
    private Category category;

    public LightNovels(String title, double price) {
        Title = title;
        this.price = price;
    }

    public LightNovels(String title, double price, Category category) {
        Title = title;
        this.price = price;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightNovels that = (LightNovels) o;
        return Objects.equals(Title, that.Title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Title);
    }

    public String getTitle() {
        return Title;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "LightNovels{" +
                "Title='" + Title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
