package ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author mariana
 * @Project: javacore
 */
public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> pessoas = List.of("mariana", "kristen stewart", "CJ");
        forEach(pessoas, s -> System.out.println(s));
        //forEach(pessoas, System.out::println);
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
