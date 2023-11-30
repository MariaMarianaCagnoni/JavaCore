package ZZHpadroesdeprojeto.builder.test;

import ZZHpadroesdeprojeto.builder.domain.Manga;

import java.math.BigDecimal;

/**
 * @author mariana
 * @Project: javacore
 */
public class BuilderTest02 {
    public static void main(String[] args) {

        Manga manga01 = new Manga.MangaBuilder()
                .id(1L)
                .name("naruto")
                .genre("shounen")
                .price(new BigDecimal("43.80"))
                .description("um manga top")
                .build();


        System.out.println(manga01);


    }
}
