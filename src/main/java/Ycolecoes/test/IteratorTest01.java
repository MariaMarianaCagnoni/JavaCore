package Ycolecoes.test;

import Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList();
        mangas.add(new Manga(5L,"Dragonball",30.00,5));
        mangas.add(new Manga(4L,"One piece",24.00,0));
        mangas.add(new Manga(8L,"Dragonball Super",50.00,3));
        mangas.add(new Manga(12L,"Dragonball GT",20.00,2));
        mangas.add(new Manga(45L,"Naruto",25.00,10));
//        for (Manga manga : mangas) {
//            if (manga.getQuantidade() == 0){
//                mangas.remove(manga);
//            }  java.util.ConcurrentModificationException não é thread safe
//        }


        Iterator<Manga> mangaIterator = mangas.iterator(); //check antes.
        while (mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if (manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);
        //tambem pode ser feito com prog. funcional
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
    }

}
