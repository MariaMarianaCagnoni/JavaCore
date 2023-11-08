package ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author mariana
 * @Project: javacore
 */
public class StreamsTest09 {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();


        IntStream.range(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("maria", " mariana", " Cagnoni", "Ferreira")
                .map(String::toUpperCase)
                .forEach(System.out::print);

        System.out.println("--");
        int[] num = {1, 3, 4, 56};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);


        try (Stream<String> txt = Files.lines(Paths.get("file2.txt"))) {
            txt.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
