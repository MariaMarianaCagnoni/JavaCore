package Npolimorfismo.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Tomate extends Produto{

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        return this.valor * 0.06;
    }
}
