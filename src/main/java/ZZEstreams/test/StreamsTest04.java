package ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author mariana
 * @Project: javacore
 */
public class StreamsTest04 {
    public static void main(String[] args) {

        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> flattenedList = nestedList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList);
        //pega varias listas e add em uma só,sem precisar aninhar loops
        System.out.println("-----------------------------------");

        List<List<String>> nestedListStrings = new ArrayList<>();

        List<String> devs = new ArrayList<>(List.of("Mariana","Luana","Jessica"));
        List<String> designerGrafics = new ArrayList<>(List.of("Diogo","Rodolfo","Breno"));
        List<String> ba = new ArrayList<>(List.of("Gustavo","Endrick","Joana"));

        nestedListStrings.add(devs);
        nestedListStrings.add(designerGrafics);
        nestedListStrings.add(ba);

        nestedListStrings.stream().flatMap(Collection::stream).forEach(System.out::println);


    }
}
