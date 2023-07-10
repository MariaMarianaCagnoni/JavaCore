package ZZZZexerciciosteste.domain;

import java.util.Arrays;

/**
 * @author mariana
 * @Project: javacore
 */
public class Time {
    private long id;
    private String nome;
    private String cidade;

    private double pontuacaoTotal;

    private int vitorias;
    private int derrotas;


    private Jogadora[] jogadoras;

    public Jogadora[] getJogadoras() {
        return jogadoras;
    }

    public void setJogadoras(Jogadora[] jogadoras) {
        this.jogadoras = jogadoras;
    }

    public Time(long id, String nome, String cidade, double pontuacaoTotal, int vitorias, int derrotas, Jogadora[] jogadoras) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.pontuacaoTotal = pontuacaoTotal;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        if(jogadoras != null && jogadoras.length > 0){
            this.jogadoras = jogadoras;
            for (Jogadora jogadora : jogadoras) {
                System.out.println(jogadora);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public void setPontuacaoTotal(double pontuacaoTotal) {
        this.pontuacaoTotal = pontuacaoTotal;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", pontuacaoTotal=" + pontuacaoTotal +
                ", vitorias=" + vitorias +
                ", derrotas=" + derrotas +
                ", jogadoras=" + Arrays.toString(jogadoras) +
                '}';
    }
}
