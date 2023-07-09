package Eblocosdeinicializacao.domain;

import java.util.Arrays;

/**
 * @author mariana
 * @Project: javacore
 */
public class Anime {
    private String nome;
    private int[] episodios;


    {

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
            //é executado antes do construtor

        }
        System.out.println("dentro do bloco de inicialização");
        //bloco de inicializao de INSTANCIA.Toda instancia vai ter os mesmos episodios
    }


    public Anime(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", episodios=" + Arrays.toString(episodios) +
                '}';
    }

    public void imprime(){
        System.out.println(Arrays.toString(this.episodios));
    }
}

