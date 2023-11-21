package ZZEstreams.test;

import ZZEstreams.domain.LightNovels;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author mariana
 * @Project: javacore
 */
public class StreamsTest11Collectors {
    protected static List<LightNovels> lightNovels = List.of(
            new LightNovels("Sekai", 2.78),
            new LightNovels("Dragonball Z", 15.78),
            new LightNovels("Dragonball GT", 20.00),
            new LightNovels("Naruto", 26.00),
            new LightNovels("Naruto", 26.00),
            new LightNovels("Pequeno urso", 11.80));

    public static void main(String[] args) {
        //para contar a lista
        System.out.println(lightNovels.stream().count()); //ou
        System.out.println(lightNovels.size());

        //agora usando o framework Collectors

        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        //pegar pelo valor maximo(preço)
        lightNovels.stream().max(Comparator.comparing(LightNovels::getPrice)).ifPresent(System.out::println);

        //agora usando Collectors
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovels::getPrice))).ifPresent(System.out::println);

        //pelo valor minimo(preço)
        lightNovels.stream().collect(Collectors.minBy(Comparator.comparing(LightNovels::getPrice))).ifPresent(System.out::println);


        //fazer soma
        System.out.println(lightNovels.stream().mapToDouble(LightNovels::getPrice).sum());

        //usando Collectors
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovels::getPrice)));

        // media
        lightNovels.stream().mapToDouble(LightNovels::getPrice).average().ifPresent(System.out::println);

        //usando Collectors
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovels::getPrice)));

        //agora é possivel reunir tudo a cima em um unico metodo

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovels::getPrice));
        System.out.println(collect);


        //junta todos os titulos e os delimita por virgula
        System.out.println(lightNovels.stream().map(LightNovels::getTitle).collect(Collectors.joining(",")));

    }

}
