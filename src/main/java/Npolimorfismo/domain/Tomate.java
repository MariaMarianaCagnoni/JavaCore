package Npolimorfismo.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Tomate extends Produto {

    private final String DATA_VALIDADE = "12/9/23";

    public static final double IMPOSTO_POR_CENTO = 0.90;


    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }


}
