package Npolimorfismo.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Computador extends Produto{

    private final double IMPOSTO_POR_CENTO = 0.21;


    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("imposto do computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public double getIMPOSTO_POR_CENTO() {
        return IMPOSTO_POR_CENTO;
    }
}
