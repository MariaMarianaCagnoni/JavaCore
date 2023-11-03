package ZZEstreams.test;

import ZZEstreams.domain.LightNovels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author mariana
 * @Project: javacore
 */
public class StreamTest02 {
    private static List<LightNovels> lightNovels = new ArrayList<>(
            List.of(
                    new LightNovels("Sekai", 2.78),
                    new LightNovels("Dragonball Z", 15.78),
                    new LightNovels("Dragonball GT", 20.00),
                    new LightNovels("Naruto", 26.00),
                    new LightNovels("Pequeno urso", 11.80)));

    public static void main(String[] args) {
        List<String> filterByStream = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovels::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovels::getTitle) // ln -> ln.getTitle
                .collect(Collectors.toList());


        System.out.println(filterByStream);


    }
}

