package ZZEstreams.test;

import ZZEstreams.domain.LightNovels;

import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class StreamsTest08 {

    protected static List<LightNovels> lightNovels = List.of(
            new LightNovels("Sekai", 2.78),
            new LightNovels("Dragonball Z", 15.78),
            new LightNovels("Dragonball GT", 20.00),
            new LightNovels("Naruto", 26.00),
            new LightNovels("Naruto", 26.00),
            new LightNovels("Pequeno urso", 11.80));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovels::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);


        double sum = lightNovels.stream()
                .mapToDouble(LightNovels::getPrice) //mantem o valor primitivo
                .filter(price -> price > 3)
                .sum();

        //mesma coisa que o metodo acima porem sem o java precisar fazer wrapper e unwrapper.
    }
}
