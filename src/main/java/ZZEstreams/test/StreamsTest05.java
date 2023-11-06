package ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author mariana
 * @Project: javacore
 */
public class StreamsTest05 {
    public static void main(String[] args) {
        List<String> lettersSlice = List.of("maria", "mariana", "Cagnoni");


        for (String word : lettersSlice) {
            String[] split = word.split("");
            System.out.println(Arrays.toString(split));
        }
        //sem usar streams

        List<String> list = lettersSlice.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
                System.out.println(list);

                //usando streams e colocando em uma list só usando o flatMap.


    }
}
