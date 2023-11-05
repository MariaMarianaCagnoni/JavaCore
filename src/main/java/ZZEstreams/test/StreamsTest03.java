package ZZEstreams.test;

import ZZEstreams.domain.LightNovels;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.out;

/**
 * @author mariana
 * @Project: javacore
 */
public class StreamsTest03 {
    private static List<LightNovels> lightNovels = new ArrayList<>(
            List.of(
                    new LightNovels("Sekai", 2.78),
                    new LightNovels("Dragonball Z", 15.78),
                    new LightNovels("Dragonball GT", 20.00),
                    new LightNovels("Naruto", 26.00),
                    new LightNovels("Naruto", 26.00),
                    new LightNovels("Pequeno urso", 11.80)));

    public static void main(String[] args) {
        lightNovels.stream().forEach(x -> out.println(x)); //isso aqui é desperdicio de processamento
        lightNovels.forEach(out::println);

        Stream<LightNovels> stream = lightNovels.stream();
        long count = stream.filter(ln -> ln.getPrice() <= 20).count(); //count conta
        long count2 = lightNovels.stream().distinct().filter(ln -> ln.getPrice() < 20).count();
        out.println(count);
        out.println(count2);


    }
}
