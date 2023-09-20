package Ycolecoes.test;

import Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mariana
 * @Project: javacore
 */
public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        //set nao permite elementos duplicados dentro da coleção
        //utilizando o HashSet,ele será ordenado pelo hash
        //o set não é indexado

        mangas.add(new Manga(5L, "Dragonball", 30.00, 5));
        mangas.add(new Manga(4L, "One piece", 24.00, 0));
        mangas.add(new Manga(8L, "Dragonball Super", 50.00, 3));
        mangas.add(new Manga(12L, "Dragonball GT", 20.00, 2));
        mangas.add(new Manga(45L, "Naruto", 25.00, 10));
        mangas.add(new Manga(45L, "Naruto", 25.00, 10));
        //não insere,pois é duplicado(o equals garante)

        for (Manga manga : mangas) {

            System.out.println(manga);
        }
    }
}
