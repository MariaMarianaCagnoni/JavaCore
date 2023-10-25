package ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * @author mariana
 * @Project: javacore
 */
public class MethodReferencetest03 {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>(List.of("Vash", "Vegeta", "Goku", "Buruma", "Chichi"));
        listaNomes.sort(String::compareTo); //ordem alfabética.O compareTo é chamado pela classe String,portanto nao estatico ou sem ser uma instância
        System.out.println(listaNomes);

        Function<String, Integer> StringToInteger = Integer::parseInt;
        Integer apply = StringToInteger.apply("10000");
        System.out.println(apply);


        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(listaNomes, "Vegeta"));
    }
}
