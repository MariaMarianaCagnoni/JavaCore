package ZZEstreams.test;

import ZZEstreams.domain.LightNovels;

import java.util.*;

/**
 * @author mariana
 * @Project: javacore
 */


//Streams é uma forma de processar dados,só que de maneira funcional(declarativa)

//Order LightNovel by title
//retrieve the first 3 night novels with price less than 4

public class StreamTest01 {
    private static List<LightNovels> lightNovels = new ArrayList<>(
            List.of(
                    new LightNovels("Sekai", 2.78),
                    new LightNovels("Dragonball Z", 15.78),
                    new LightNovels("Dragonball GT", 20.00),
                    new LightNovels("Naruto", 26.00),
                    new LightNovels("Pequeno urso", 11.80)));

    public static void main(String[] args) {
        List<String> titles = new ArrayList<>();

        lightNovels.sort(Comparator.comparing(LightNovels::getPrice));
        for (LightNovels lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4){
                 titles.add(lightNovel.getTitle() + " " + lightNovel.getPrice());
            }
            if(titles.size() >= 3){
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
