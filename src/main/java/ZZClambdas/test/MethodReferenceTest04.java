package ZZClambdas.test;

import ZZClambdas.domain.Anime;
import ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 3), new Anime("Dragonball", 1000)));


    }
}
