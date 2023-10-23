package ZZClambdas.test;

import ZZClambdas.test.domain.Anime;
import ZZClambdas.test.service.AnimeComparators;

import java.util.*;

/**
 * @author mariana
 * @Project: javacore
 */
public class MethodReferenceTest01 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 3), new Anime("Dragonball", 1000)));
        animeList.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        System.out.println(animeList);
        animeList.sort(AnimeComparators::compareByTitle); //method reference
        animeList.sort(AnimeComparators::compareByEpisodes); //method reference

    }
}
