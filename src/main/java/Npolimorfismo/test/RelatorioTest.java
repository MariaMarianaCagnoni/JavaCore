package Npolimorfismo.test;

import Npolimorfismo.domain.Tomate;
import Npolimorfismo.service.CalculadoraImposto;

/**
 * @author mariana
 * @Project: javacore
 */
public class RelatorioTest {

    public static void main(String[] args) {
        Tomate tomate = new Tomate("grande",17.00);
       CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}