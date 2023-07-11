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
    public double calculoBonus() {
        return this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public void ferias() {
        if (salario >= 3000) {
            System.out.println("ferias de 6 meses");
        } else {
            System.out.println("sem ferias");
        }
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "language=" + language +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                "} ";
    }

    @Override
    public void imprime() {

    }
}
