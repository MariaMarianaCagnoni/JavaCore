package Minterfaces.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public interface DataRemover {
    void remove();

    default void printName() {
        System.out.println("DataRemover");
        System.out.println("dentro do default method printName() da interface DataRemover");
    }
    //default methods em java,são metodos concretos dentro de uma interface
}
