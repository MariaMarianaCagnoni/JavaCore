package Lclassesabstratas.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);

    }

    @Override
    public double calculoBonus() {
        return this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public void ferias() {
        if (salario >= 5000) {
            System.out.println("Pode ter ferias de 3 meses");
        } else {
            System.out.println("nao pode tirar ferias");
        }
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                "} ";
    }

    @Override
    public void imprime() {

    }
}
