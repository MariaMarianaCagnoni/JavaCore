package ZZHpadroesdeprojeto.builder.domain;

import java.math.BigDecimal;

/**
 * @author mariana
 * @Project: javacore
 */
public class Manga {
    private Long id;
    private String name;
    private String genre;
    private BigDecimal price;
    private String description;

    private Manga(Long id, String name, String genre, BigDecimal price, String description) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public static class MangaBuilder {

        private Long id;
        private String name;
        private String genre;
        private BigDecimal price;
        private String description;

        public MangaBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public MangaBuilder name(String name) {
            this.name = name;
            return this;
        }

        public MangaBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public MangaBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public MangaBuilder description(String description) {
            this.description = description;
            return this;
        }

        public Manga build() {
            return new Manga(this.id, this.name,this.genre, this.price, this.description);
        }

    }
}
