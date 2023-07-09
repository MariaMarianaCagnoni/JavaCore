package Csobrecargametodos.test;

import Csobrecargametodos.domain.Anime;

/**
 * @author mariana
 * @Project: javacore
 */
public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();

        anime.setNome("Naruto");
        anime.setTipo("shounen");
        anime.setEpisodios(12);
        anime.setGenero("Ação");
        anime.init("mariana", "XXXXXXXXXXXXXXXXX", 12, "Ação");

        anime.imprime();

    }
}
