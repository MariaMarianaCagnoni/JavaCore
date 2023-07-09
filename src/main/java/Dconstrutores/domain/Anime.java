package Dconstrutores.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Anime {
    private String nome;
    private String tipo;
    private int episodios;

    private String estudio;

    public Anime(String nome, String tipo, int episodios) {
        this();   //chama o contrutor sem argumentos pois sem parametros
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;    }

    public Anime(String nome, String tipo, int episodios, String studio) {
        this(nome, tipo, episodios); //só funciona com construtores e precisa sera  PRIMEIRA linha do construtor

        this.estudio = studio;
    }


    public Anime() {
        //sobrecarga de construtores
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;

    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setStudio(String studio) {
        this.estudio = studio;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", episodios=" + episodios +
                ", estudio='" + estudio + '\'' +
                '}';
    }
}
