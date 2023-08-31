package Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>();

        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Dragon ball");
        mangas.add("Naruto");
        mangas.add("Pokemon");
        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }


        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(23.98);
        dinheiros.add(500D);
        dinheiros.add(45.987);
        Collections.sort(dinheiros);
        //funciona com tipos primitivos,quando passar uma classe nossa o java nao sabe pelo que ordenar

        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }

    }
}
