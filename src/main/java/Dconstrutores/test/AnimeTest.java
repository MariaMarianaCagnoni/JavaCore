package Dconstrutores.test;

import Dconstrutores.domain.Anime;

/**
 * @author mariana
 * @Project: javacore
 */
public class AnimeTest {

    public static void main(String[] args) {

        Anime anime = new Anime("Dragon ball","shonen",978);

        System.out.println(anime);

        new Anime("Dragon ball","shonen",978,"koudai");
        //sobrecarga de construtor








    }
}
