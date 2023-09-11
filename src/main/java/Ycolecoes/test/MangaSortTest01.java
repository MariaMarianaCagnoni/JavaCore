package Ycolecoes.test;

import Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */

class mangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga01, Manga manga02) {
        return manga01.getId().compareTo(manga02.getId());
    }
}
public class MangaSortTest01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(5L, "Pokemon", 3.2));
        mangas.add(new Manga(3L, "Dragon Ball Z", 2.99));

//        System.out.println(mangas);

        Collections.sort(mangas,new mangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //portanto em classes própria é preciso implementar o Comparable pro java saber como comparar os objetos
        //e o sort irá ordenar de acordo com o compareTo
    }
}
