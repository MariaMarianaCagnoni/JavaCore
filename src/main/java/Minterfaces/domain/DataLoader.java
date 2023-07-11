package Minterfaces.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public interface DataLoader {
    //nao aceita a palavra final

    void load();


    void checkPermission(char permission);


    //todos os metodos dentro de uma interface é publico e abstrato
    //portanto nem precisa colocar pois dicaria redundante

}
