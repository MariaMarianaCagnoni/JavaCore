package Zgenerics.service;

import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class RentalService<T> {

    private List<T> veiculosDisponiveis;

    public RentalService(List<T> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }

    public T retrieveAvailableVehicle() {
        System.out.println("buscando veiculo disponivel....");
        T t = veiculosDisponiveis.remove(0);
        System.out.println("Alugando veiculo" + t);
        System.out.println("veiculos disponiveis para alugar");
        System.out.println(veiculosDisponiveis);
        return t;
    }

    public void retonardoVeiculo(T t) {
        System.out.println("retornando veiculo:");
        veiculosDisponiveis.add(t);
        System.out.println(t + ": devolvido ");
        System.out.println("veiculos disponiveis para alugar:" + veiculosDisponiveis);
    }

}
