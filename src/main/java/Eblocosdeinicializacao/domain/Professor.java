package Eblocosdeinicializacao.domain;

import java.math.BigDecimal;

/**
 * @author mariana
 * @Project: javacore
 */
public class Professor {
    private String nome;
    private String especialidade;
    private int idade;
    private BigDecimal salario;

    {
        System.out.println("Dentro do bloco de inicialização");
        this.salario = BigDecimal.valueOf(5000.00);
    }

    public Professor(String nome, String especialidade, int idade) {
        this();
        this.nome = nome;
        this.especialidade = especialidade;
        this.idade = idade;

    }

    public Professor() {
        System.out.println("dentro do construtor de professor");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}
