package ZZBcomportamento.test;

import ZZBcomportamento.domain.Car;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class ComportamentoPorParametroTest01 {

    public static void main(String[] args) {

        System.out.println(greenCarsFilter(listaDeCarros));
        System.out.println(filtercarByColor(listaDeCarros,"red"));
        System.out.println("------------------");
        System.out.println(filtercarByYear(listaDeCarros, 2003));
    }

    private static List<Car> listaDeCarros = List.of(new Car("green", 1998), new Car("silver", 2012), new Car("red", 2023));

    private static List<Car> greenCarsFilter(@NotNull List<Car> cars) {
        List<Car> greenCars = new ArrayList();
        for (Car car : cars) {
            if (car.getColor().equals("green".trim().toLowerCase())) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }
    private static List<Car> filtercarByColor(List<Car> cars,String color) {
        List<Car> colorCars = new ArrayList();
        for (Car car : cars) {
            if (car.getColor().equals(color.trim().toLowerCase())) {
                colorCars.add(car);
            }
        }
        return colorCars;
    }
    private static List<Car> filtercarByYear(List<Car> cars,int year) {
        List<Car> oldCars = new ArrayList();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCars.add(car);
            }
        }
        return oldCars;
    }
}
