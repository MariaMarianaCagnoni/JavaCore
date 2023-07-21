package Npolimorfismo.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public interface Taxavel {

    public abstract double calculaImposto();

    default void teste(){
        System.out.println("este é um teste");
    };
}
