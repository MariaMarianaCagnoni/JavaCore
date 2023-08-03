package Npolimorfismo.test;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Televisao;
import Npolimorfismo.domain.Tomate;
import Npolimorfismo.service.CalculadoraImposto;
import Npolimorfismo.service.CalculadoraImpostoRefatorado;

/**
 * @author mariana
 * @Project: javacore
 */
public class RelatorioTest {

    public static void main(String[] args) {
        Tomate tomate = new Tomate("grande", 17.00);
        Computador computador = new Computador("pequeno", 10.00);

        CalculadoraImposto.calcularImpostoTomate(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-----------------------------");


        CalculadoraImpostoRefatorado.calcularImposto(tomate);
        System.out.println("-----------------------------");

        CalculadoraImpostoRefatorado.calcularImposto(computador);

        Televisao tv = new Televisao("grande", 10.00);
        CalculadoraImpostoRefatorado.calcularImposto(tv);

    }
}
