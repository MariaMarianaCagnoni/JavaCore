package ZZEstreams.test;

import org.openjdk.jmh.annotations.Benchmark;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import static java.lang.System.out;

/**
 * @author mariana
 * @Project: javacore
 */
public class StreamTest10 {

    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(100)
                .forEach(out::println);

        out.println("-----------------------------------");


        ThreadLocalRandom rd = ThreadLocalRandom.current();
        Stream.generate(() -> rd.nextInt(1, 60))

                .limit(6)
                .forEach(n -> out.print(n + " "));


        ThreadLocalRandom rd2 = ThreadLocalRandom.current();
        Set<Integer> numerosGerados = new HashSet<>();

        out.println("---------------");
        Stream.generate(() -> {
                    int numero;
                    do {
                        numero = rd2.nextInt(1, 60);
                    } while (numerosGerados.contains(numero));
                    numerosGerados.add(numero);
                    return numero;
                })
                .limit(6)
                .forEach(n -> out.print(n + " "));


        //sequencia de fibonacci
        //(Fn = Fn-1 + Fn-2)
    }
}
