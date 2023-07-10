package Lclassesabstratas.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public abstract class Funcionario {
    //classes abstratas funcionam como se fosse um template

    protected  String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
