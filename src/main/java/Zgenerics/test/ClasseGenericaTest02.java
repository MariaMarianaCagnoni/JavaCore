package Zgenerics.test;

import Zgenerics.domain.Barco;
import Zgenerics.domain.Carro;
import Zgenerics.service.CarroRentavelService;
import Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Ford"), new Carro("Chevrolet"),new Carro("bmw")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Iate"), new Barco("Yamaha"),new Barco("Mercedez")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.retrieveAvailableVehicle();
        rentalService.retonardoVeiculo(carro);

        System.out.println("--------------------------------");
        RentalService<Barco> rentalService2 = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService2.retrieveAvailableVehicle();
        rentalService2.retonardoVeiculo(barco);


    }
}
