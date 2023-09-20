package Ycolecoes.test;

import Ycolecoes.domain.Manga;
import Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author mariana
 * @Project: javacore
 */

class SmartPhoneCompator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getSerialNumber().compareTo(o2.getSerialNumber());
    }
}

public class NavigableSetTest01 {

    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartPhoneCompator());
        //TreeSet não usa o equals e sim o compareTo

        Smartphone samsung = new Smartphone("47365AB", "Samsung");
        Smartphone samsung02 = new Smartphone("473AB", "Samsung");
        set.add(samsung); //classCastException pois nao tem um Comparable
        set.add(samsung02); //classCastException pois nao tem um Comparable
        set.add(samsung02); //classCastException pois nao tem um Comparable
        for (Smartphone smart : set) {
            System.out.println(smart
            );

        }

        System.out.println("-------------------------------");

        NavigableSet<Manga> manga = new TreeSet<>();
        manga.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        manga.add(new Manga(1L, "Berserk", 9.5));
        manga.add(new Manga(4L, "Pokemon", 3.2));
        manga.add(new Manga(3L, "Dragon Ball Z", 2.99));

        for (Manga manga1 : manga.descendingSet()) {
            System.out.println(manga1);
        }
        //lower <
        // floor <=
        //higher >
        //ceiling >=
    }
}
