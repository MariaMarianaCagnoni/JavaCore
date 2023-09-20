package Ycolecoes.test;

import Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author mariana
 * @Project: javacore
 */

class SmartPhoneCompator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getSerialNumber().compareTo(o2.getSerialNumber());
    }
}

public class NavigableSetTest01 {


    public static void main(String[] args) {


        NavigableSet<Smartphone> set = new TreeSet<>(new SmartPhoneCompator());

        Smartphone samsung = new Smartphone("47365AB", "Samsung");
        Smartphone samsung02 = new Smartphone("473AB", "Samsung");
        set.add(samsung); //classCastException pois nao tem um Comparable
        set.add(samsung02); //classCastException pois nao tem um Comparable
        set.add(samsung02); //classCastException pois nao tem um Comparable
        for (Smartphone smart:set) {
            System.out.println(smart
            );

        }

    }
}
