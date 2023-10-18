package ZZBcomportamento.test;

import ZZBcomportamento.domain.Car;
import ZZBcomportamento.interfaces.CarPredicate;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author mariana
 * @Project: javacore
 */
public class ComportamentoPorParametroTest03 {
    private static List<Car> listaDeCarros = List.of(new Car("green", 1998), new Car("silver", 2012), new Car("red", 2023));


    public static void main(String[] args) {


        List<Car> cars2 = filter(listaDeCarros, car -> car.getColor().equals("red"));
        List<Car> cars = filter(listaDeCarros, car -> car.getName().equals("Mercedez"));

        System.out.println(cars2);
        System.out.println(cars);

        List<Integer> listOfInteger = List.of(1,2,32,4,45);
        System.out.println(filter(listOfInteger, numeros -> numeros%2==0));


    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;

    }

}
