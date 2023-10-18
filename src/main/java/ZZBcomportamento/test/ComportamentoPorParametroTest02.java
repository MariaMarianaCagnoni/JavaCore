package ZZBcomportamento.test;

import ZZBcomportamento.domain.Car;
import ZZBcomportamento.interfaces.CarPredicate;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class ComportamentoPorParametroTest02 {
    private static List<Car> listaDeCarros = List.of(new Car("green", 1998), new Car("silver", 2012), new Car("red", 2023));

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList();
        for (Car car : cars) {
            if (carPredicate.teste(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
        //a definicao do comportamento será definido por uma classe anônima
    }



    public static void main(String[] args) {
        List<Car> cars = filter(listaDeCarros, new CarPredicate() {
            @Override
            public boolean teste(Car car) {
                return car.getColor().equals("green");
            }
        });

        List<Car> cars2 = filter(listaDeCarros, car -> car.getColor().equals("red"));
        //mesma coisa que a linha 29 mas usando lambda function
        System.out.println(cars);
        System.out.println(cars2);
    }

}
