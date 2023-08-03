package Npolimorfismo.service;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Produto;
import Npolimorfismo.domain.Tomate;

/**
 * @author mariana
 * @Project: javacore
 */
public class CalculadoraImpostoRefatorado {
    public static void calcularImposto(Produto produto) {
        if (produto == null) {
            throw new NullPointerException("O produto não pode ser nulo.");
        }
        System.out.println("Relatorio do produto");
        double imposto = produto.calculaImposto();
        System.out.println("o nome do produto: " + produto.getNome());
        System.out.println("o valor do produto: " + produto.getValor());
        System.out.println("o valor do imposto do produto: " + imposto);

    }
}
