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
public class RelatorioTest02 {

    public static void main(String[] args) {
        Tomate tomate = new Tomate("grande", 17.00);

        tomate.setDATA_VALIDADE("01/01/2023");

        Computador computador = new Computador("pequeno", 10.00);

    }
}
