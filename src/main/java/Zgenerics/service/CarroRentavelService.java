package Zgenerics.service;

import Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class CarroRentavelService {
    List<Carro> listaDeCarros = new ArrayList<>(List.of(new Carro("Fusca"), new Carro("BMW")));


    public Carro retrieveAvailableCar() {
        System.out.println("buscando carro disponivel....");
        Carro carro = listaDeCarros.remove(0);
        System.out.println("Alugando carro" + carro);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(listaDeCarros);
        return carro;
    }

    public void retonardoCarro(Carro carro) {
        System.out.println("retornando carro:");
        listaDeCarros.add(carro);
        System.out.println(carro + ": devolvido ");
        System.out.println("carros disponiveis para alugar:" + listaDeCarros);
    }

}
