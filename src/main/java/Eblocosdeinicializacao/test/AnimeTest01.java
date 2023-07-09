package Eblocosdeinicializacao.test;

import Eblocosdeinicializacao.domain.Anime;

/**
 * @author mariana
 * @Project: javacore
 */
public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("naruto");
        System.out.println(anime);

        Anime anime2 = new Anime("inuyasha");
        System.out.println(anime2);

        anime2.imprime();
    }
}
