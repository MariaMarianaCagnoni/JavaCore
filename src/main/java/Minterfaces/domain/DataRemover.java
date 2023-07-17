package Minterfaces.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public interface DataRemover {

    public static final int MAX_SIZE_INTEGER= 10;

    //portanto: todos atributos são constantes e staticos(ja que nao se pode instanciar uma interface)
    void remove();

    default void printName() {
        System.out.println("DataRemover");
        System.out.println("dentro do default method printName() da interface DataRemover");
    }
    //default methods em java,são metodos concretos dentro de uma interface
}
