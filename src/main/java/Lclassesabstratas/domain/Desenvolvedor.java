package Lclassesabstratas.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Desenvolvedor extends Funcionario {
    private String language;



    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    public Desenvolvedor(String nome, double salario, String language) {
        super(nome, salario);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
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
