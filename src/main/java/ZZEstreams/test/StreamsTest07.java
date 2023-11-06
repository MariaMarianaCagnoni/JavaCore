package ZZEstreams.test;

import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class StreamsTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 3, 4, 5);
        integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);
        System.out.println("-----------------------------");

        System.out.println(integers.stream()
                .reduce(3, (x, y) -> x + y));

        System.out.println(integers.stream()
                .reduce(3, Integer::sum)); //mesma coisa que a funcao de cima.

        System.out.println(integers.stream()
                .reduce((x, y) -> x * y)
                .orElseThrow());


    }

}
