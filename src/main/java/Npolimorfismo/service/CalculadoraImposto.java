package Npolimorfismo.service;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Tomate;

/**
 * @author mariana
 * @Project: javacore
 */
public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        if (computador == null) {
            throw new NullPointerException("O computador não pode ser nulo.");
        }
        System.out.println("Relatorio do computador");
        double imposto = computador.calculaImposto();
        System.out.println("o nome do pc: " + computador.getNome());
        System.out.println("o valor do pc: " + computador.getValor());
        System.out.println("o valor do imposto: " + imposto);

    }

    public static void calcularImpostoTomate(Tomate tomate) {
        if (tomate == null) {
            throw new NullPointerException("O tomate não pode ser nulo.");
        }
        System.out.println("Relatorio do tomate");
        double imposto = tomate.calculaImposto();
        System.out.println("o nome do tomate: " + tomate.getNome());
        System.out.println("o valor do tomate: " + tomate.getValor());
        System.out.println("o valor do imposto do tomate: " + imposto);

    }
}
