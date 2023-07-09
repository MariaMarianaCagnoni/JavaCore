package Fmodificadorestatico.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Moeda {
    private String nome;
    private double cotacao;

    private static double IOF = 0.06;

    {
        System.out.println("bloco de inicialização");
    }

    static {
        System.out.println("bloco estatico de inicialização");
    }


    public Moeda(String nome, double cotacao) {
        this.nome = nome;
        System.out.println("dentro do construtor");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    public static double getIOF() {
        return IOF;
    }

    public static void setIOF(double IOF) {
        Moeda.IOF = IOF;
    }

    @Override
    public String toString() {
        return "Moeda{" +
                "nome='" + nome + '\'' +
                ", cotacao=" + cotacao +
                ", IOF=" + IOF +
                '}';
    }
}
