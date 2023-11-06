package ZZEstreams.test;

import ZZEstreams.domain.LightNovels;

import java.util.List;
import java.util.Optional;

/**
 * @author mariana
 * @Project: javacore
 */
public class StreamsTest06 {
    static List<LightNovels> lightNovels = List.of(
            new LightNovels("Sekai", 2.78),
            new LightNovels("Dragonball Z", 15.78),
            new LightNovels("Dragonball GT", 20.00),
            new LightNovels("Naruto", 26.00),
            new LightNovels("Naruto", 26.00),
            new LightNovels("Pequeno urso", 11.80));

    public static void main(String[] args) {

        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() < 20));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));


        LightNovels lightNovels1 = lightNovels.stream()
                .filter(ln -> ln.getPrice() < 20)
                .findAny()
                .orElseThrow();//seleciona qualquer elemento dentro desse stream

        System.out.println(lightNovels1);

        Optional<LightNovels> first = lightNovels.stream()
                .filter(ln -> ln.getPrice() < 3)
                .findFirst();
        System.out.println(first);


    }

}
