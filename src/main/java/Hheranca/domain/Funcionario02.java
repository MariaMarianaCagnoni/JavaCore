package Hheranca.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Funcionario02 extends Pessoa02 {
    protected String cargo;

    public Funcionario02(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("cargo: " + this.cargo);
    }


    public void relatorioPagamento() {

        System.out.println(this.cpf);
        System.out.println(this.nome);
    }
}

