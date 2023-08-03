package Npolimorfismo.repositorio;

/**
 * @author mariana
 * @Project: javacore
 */
public interface Repositorio {

    public abstract void salvar();

    default void imprime() {
        System.out.println("teste");
    }
}
