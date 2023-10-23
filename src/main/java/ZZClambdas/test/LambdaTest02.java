package ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author mariana
 * @Project: javacore
 */
public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> jogadoras = List.of("naiane", "Rosamaria");
        List<Integer> map = map(jogadoras, (String s) -> s.length());
        List<Integer> map1 = map(jogadoras, String::length);
        System.out.println(map);
        System.out.println(map1);
    }

    private static <T,R> List<R> map(List<T> list,Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T e: list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
