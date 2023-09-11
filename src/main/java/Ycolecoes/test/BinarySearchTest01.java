package Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        //binarySeacrh precisa estar ordenada
        System.out.println(Collections.binarySearch(numeros, 2));
        //(-(ponto de inserção)-1)

        Integer[] array = numeros.toArray(numeros.toArray(new Integer[0]));
        //desempenho passando 0 é mais rapido pois o java usa reflection
        System.out.println(Arrays.toString(array));

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 3;
        numerosArray[2] = 4;

        List<Integer> list = Arrays.asList(numerosArray);

        for (Integer i:list) {
            System.out.println(i);
        }
    }
}
