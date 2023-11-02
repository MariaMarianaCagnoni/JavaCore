package ZZEstreams.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class LightNovels {

    private String Title;
    private double price;

    public LightNovels(String title, double price) {
        Title = title;
        this.price = price;
    }

    public String getTitle() {
        return Title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "LightNovels{" +
                "Title='" + Title + '\'' +
                ", price=" + price +
                '}';
    }

}
