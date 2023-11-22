package ZZEstreams.test;

import ZZEstreams.domain.Category;
import ZZEstreams.domain.LightNovels;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author mariana
 * @Project: javacore
 */
public class StreamsTest12Collectors {
    protected static List<LightNovels> lightNovels = List.of(
            new LightNovels("Sekai", 2.78, Category.TERROR),
            new LightNovels("Dragonball Z", 15.78, Category.FANTASY),
            new LightNovels("Dragonball GT", 20.00, Category.ROMANCE),
            new LightNovels("Naruto", 26.00, Category.TERROR),
            new LightNovels("Naruto", 26.00, Category.TERROR),
            new LightNovels("Pequeno urso", 11.80, Category.FANTASY));

    public static void main(String[] args) {

        Map<Category, List<LightNovels>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovels::getCategory));
        System.out.println(collect);
    }
}
