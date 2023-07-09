package Fmodificadorestatico.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Carro {

    private String nome;
    private String modelo;
    private double limiteMinimo;
    private static double limiteMaximo; //essa variavel deixou de pertencer ao objeto e sim a classe
    private int ano;

    public Carro(String nome, String modelo, double limiteMinimo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.limiteMinimo = limiteMinimo;
        this.ano = ano;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getLimiteMinimo() {
        return limiteMinimo;
    }

    public void setLimiteMinimo(double limiteMinimo) {
        this.limiteMinimo = limiteMinimo;
    }

    public static double getLimiteMaximo() {
        return limiteMaximo;
    }

    public static void setLimiteMaximo(double limiteMaximo) {
        Carro.limiteMaximo = limiteMaximo;
        //this se refere ao objeto/instancia, portanto nao se pode usar em metodo estatico.
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", limiteMinimo=" + limiteMinimo +
                ", ano=" + ano +
                // ", limiteMaximo=" + limiteMaximo +
                '}';
    }
}
