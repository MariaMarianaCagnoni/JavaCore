package ZZZZexerciciosteste.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Jogadora {
    private long id;
    private String nome;

    private int idade;

    private String nacionalidade;

    private int numeroCamisa;
    private double altura;
    private double peso;
    private double salario;

    private TipoPosicao posicao;
    private Time time;


    public Jogadora(long id, String nome, int idade, String nacionalidade, double altura, double peso, double salario, TipoPosicao posicao, Time time) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;

        this.altura = altura;
        this.peso = peso;
        this.salario = salario;
        this.posicao = posicao;
        if (time != null) {
            this.time = time;
        }
    }

    public Jogadora(long id, String nome, int idade, String nacionalidade, int numeroCamisa, double altura, double peso, double salario, TipoPosicao posicao, Time time) {
        this(id, nome, idade, nacionalidade, altura, peso, salario, posicao, time);
        this.numeroCamisa = numeroCamisa;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public TipoPosicao getPosicao() {
        return posicao;
    }

    public void setPosicao(TipoPosicao posicao) {
        this.posicao = posicao;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "Jogadora{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", numeroCamisa=" + numeroCamisa +
                ", altura=" + altura +
                ", peso=" + peso +
                ", salario=" + salario +
                ", posicao=" + posicao +
                ", time=" + time +
                '}';
    }
}
