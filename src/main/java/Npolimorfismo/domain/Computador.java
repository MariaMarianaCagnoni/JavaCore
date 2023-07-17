package Npolimorfismo.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Computador extends Produto{


    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("imposto do computador");
        return this.valor * 20;
    }
}
