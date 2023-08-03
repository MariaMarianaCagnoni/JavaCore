package Npolimorfismo.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Televisao extends Produto{

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    private static final double IMPOSTO_POR_CENTO = 0.6;
    @Override
    public double calculaImposto() {
        return IMPOSTO_POR_CENTO * this.valor;
    }

    @Override
    public void teste() {
        super.teste();
    }
}
