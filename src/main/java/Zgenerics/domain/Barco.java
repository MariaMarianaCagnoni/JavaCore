package Zgenerics.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Barco {
    private String nome;

    public Barco(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
