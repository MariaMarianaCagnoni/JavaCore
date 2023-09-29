package Zgenerics.test;

import Zgenerics.domain.Carro;
import Zgenerics.service.CarroRentavelService;

/**
 * @author mariana
 * @Project: javacore
 */
public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.retrieveAvailableCar();
        System.out.println(carro);
    }
}
