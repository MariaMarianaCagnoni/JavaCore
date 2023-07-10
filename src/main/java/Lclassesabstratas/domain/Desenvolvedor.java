package Lclassesabstratas.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Desenvolvedor extends Funcionario {
    protected String language;


    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    public Desenvolvedor(String nome, double salario, String language) {
        super(nome, salario);
        this.language = language;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "language=" + language +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                "} " ;
    }
}
