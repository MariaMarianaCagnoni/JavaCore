package Lclassesabstratas.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public abstract class Funcionario extends Pessoa{
    //classes abstratas funcionam como se fosse um template

    protected  String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;


    }

    public double calculoBonus(){
        return salario = salario + salario * 0.1;
    }
    public abstract void ferias();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
    //metodos abstratos ssó podeme xistir dentro de classes abstratas
    //porem em classes abstradas vc pode ter metodos concretos e abstratos

}
