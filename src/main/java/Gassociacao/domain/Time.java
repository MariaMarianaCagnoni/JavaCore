package Gassociacao.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Time {

    private String nome;

    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
