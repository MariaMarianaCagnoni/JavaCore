package Npolimorfismo.test;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Produto;
import Npolimorfismo.domain.Tomate;

/**
 * @author mariana
 * @Project: javacore
 */
public class Produto01 {

    public static void main(String[] args) throws InterruptedException {
        //polimorfismo é usado em herança

        Produto produto = new Computador("ryzen",3000);
        /* variável de referencia do tipo produto
        * e objeto do tipo Computador */

        System.out.println(produto.getValor());
        System.out.println(produto.getNome());
        System.out.println(produto.calculaImposto());
        //data de validade não pode ser acessado por ser mais "especifico" que o produto


        System.out.println("\n\n");

        Produto produto2 = new Tomate("Tomate Americano",5.00);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calculaImposto());







    }
}
